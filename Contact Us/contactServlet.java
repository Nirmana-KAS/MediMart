import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.mail.*;
import javax.mail.internet.*;

public class ContactServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String subject = request.getParameter("phone");
        String message = request.getParameter("message");

        // Process the form data
        sendEmail(name, email, subject, message);
        saveToDatabase(name, email, subject, message);

        // Redirect back to the contact page or show a confirmation message
        response.sendRedirect("contact.html");
    }

    private void sendEmail(String name, String email, String subject, String message) {
        // Replace these values with your email server details
        String host = "your-smtp-server.com";
        String port = "587";
        String username = "your-email@example.com";
        String password = "your-email-password";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(username));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
            msg.setSubject("Thank you for contacting us");
            msg.setText("Dear " + name + ",\n\nThank you for contacting us. We have received your message:\n\n" + message);

            Transport.send(msg);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    private void saveToDatabase(String name, String email, String subject, String message) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // Replace these values with your database connection details
            String url = "jdbc:mysql://localhost:3306/your_database";
            String dbUsername = "your_username";
            String dbPassword = "your_password";

            // Connect to the database
            conn = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Insert the form data into the database
            String sql = "INSERT INTO contact_messages (name, email, subject, message) VALUES (?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, subject);
            stmt.setString(4, message);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
