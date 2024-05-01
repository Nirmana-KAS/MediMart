/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dines
 */
@WebServlet(name = "checkLoginInfoServlet", urlPatterns = {"/checkLoginInfoServlet"})
public class checkLoginInfoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet checkLoginInfoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet checkLoginInfoServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //rocessRequest(request, response);
        String email = request.getParameter("lemail");
        String psw = request.getParameter("lpsw");
        
        String url = "jdbc:mysql://localhost:3306/medimart";
        String user = "root";
        String dbPassword = "";
        
        if (!isValidEmail(email)) {
            response.sendRedirect("login.jsp?error=invalidemail");
            return;
        }
        try(Connection conn = DriverManager.getConnection(url, user, dbPassword)){
            Class.forName("com.mysql.jdbc.Driver");
                        String sql = "SELECT upassword FROM users WHERE uemail=?";
                        
            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                statement.setString(1, email);
                ResultSet resultSet = statement.executeQuery();

                // Check if the email exists in the database
                if (resultSet.next()) {
                    String storedPassword = resultSet.getString("upassword");

                    // Check if the provided password matches the stored password
                    if (psw.equals(storedPassword)) {
                        // Successful login
                        HttpSession session = request.getSession();
                        session.setAttribute("email", email);
                        response.sendRedirect("index.jsp"); // Redirect to welcome page after successful login
                        return;
                    } else {
                        // Invalid password
                        response.sendRedirect("login.jsp?error=invalidpassword");
                        return;
                    }
                } else {
                    // Email not found
                    response.sendRedirect("login.jsp?error=emailnotfound");
                    return;
                }
            }
        } catch (SQLException e) {
            throw new ServletException(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(checkLoginInfoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Method to validate email format
    private boolean isValidEmail(String email) {
        // Implement your email validation logic here
        // For simplicity, let's assume any non-empty string is valid
        return email != null && !email.isEmpty();
    }

        

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}