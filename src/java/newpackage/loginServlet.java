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
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dines
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

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
            out.println("<title>Servlet loginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loginServlet at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        String uname = request.getParameter("uname");
        String uemail = request.getParameter("uemail");
        String upsw = request.getParameter("upsw");
        String ucontact= request.getParameter("ucontact");
        
        String url = "jdbc:mysql://localhost:3306/medimart";
        String user = "root";
        String dbPassword = "";
        
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Create SQL query to insert data into the database
            try ( // Establish database connection
                    Connection conn = DriverManager.getConnection(url, user, dbPassword)) {
                // Create SQL query to insert data into the database
                String sql = "INSERT INTO users (uname,uemail,upassword,ucontact) VALUES ( ?, ?, ?, ?)";
                try (PreparedStatement statement = conn.prepareStatement(sql)) {
                    statement.setString(1, uname);
                    statement.setString(2, uemail);
                    statement.setString(3,upsw );
                    statement.setString(4,ucontact);
                    // Execute the query
                    int rowsInserted = statement.executeUpdate();
                    if (rowsInserted > 0) {
                        response.getWriter().println("<div style='position: fixed; top: 30%; left: 50%; transform: translate(-50%, -50%); background-color: #e4e4e4; padding: 20px; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2); border-radius: 10px; text-align: center;'>");
                        response.getWriter().println("<h1 style='color: #009999; font-family: Poppins;'>Registration Successfully.</h1>");
                        response.getWriter().println("</div>");
                    } else {
                        response.getWriter().println("<div style='position: fixed; top: 30%; left: 50%; transform: translate(-50%, -50%); background-color: #e4e4e4; padding: 20px; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2); border-radius: 10px; text-align: center;'>");
                        response.getWriter().println("<h1 style='color: #009999; font-family: Poppins;'>Registration failed. Please try again!</h1>");
                        response.getWriter().println("</div>"); 
                    }
                    // Close resources
                }
            }
        } catch (ClassNotFoundException | SQLException | IOException e) {
            response.getWriter().println("<div style='position: fixed; top: 30%; left: 50%; transform: translate(-50%, -50%); background-color: #e4e4e4; padding: 20px; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2); border-radius: 10px; text-align: center;'>");
            response.getWriter().println("<h1 style='color: #f5190a; font-family: Poppins;'>An error occurred: "+ e.getMessage()+" </h1>");
            response.getWriter().println("</div>"); 
    }
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }


}