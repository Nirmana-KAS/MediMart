package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>MediMart-Header-Section</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"icon\" href=\"images/MediMartLogoF.png\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/header.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <!-- Header section Start -->\r\n");
      out.write("                <div class=\"header\">\r\n");
      out.write("                    <!-- Topbar start -->\r\n");
      out.write("                        <div class=\"topbar\">\r\n");
      out.write("                            <div class=\"left-side\">\r\n");
      out.write("                                <a href=\"http://\"><img class=\"logo24-7\" src=\"images/24_7.png\" alt=\"logo24-7\"> Online Service</a>\r\n");
      out.write("                                <a href=\"http://\"><img class=\"openhours-logo\" src=\"images/openhours.png\" alt=\"openhours-logo\"> Open Hours: Mon to Sat 8.00 A.M. - 9.00 P.M. </a>\r\n");
      out.write("                                <a href=\"http://\"><img class=\"location-logo\" src=\"images/location.png\" alt=\"location-logo\"> NO:121/2, High level Road, Homagama </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"right-side\">\r\n");
      out.write("                                <a href=\"http://\"><img class=\"hotline-logo\" src=\"images/hotline.png\" alt=\"hotline-logo\"> HOTLINE: +9411 222 333 444 </a>\r\n");
      out.write("                                <a href=\"http://\"><img class=\"email-logo\" src=\"images/email.png\" alt=\"email-logo\"> medimartonlinesl@gmail.com </a>\r\n");
      out.write("                                <div class=\"social-links\">\r\n");
      out.write("                                    <a href=\"http://\" class=\"follow\">FOLLOW ON</a>\r\n");
      out.write("                                    <a href=\"http://\"><img class=\"facebook-logo\" src=\"images/facebook.png\" alt=\"facebook-logo\"> </a>\r\n");
      out.write("                                    <a href=\"http://\"><img class=\"messenger-logo\" src=\"images/messenger.png\" alt=\"messenger-logo\"> </a>\r\n");
      out.write("                                    <a href=\"http://\"><img class=\"whatsapp-logo\" src=\"images/whatsapp.png\" alt=\"whatsapp-logo\"> </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    <!-- Topbar end -->\r\n");
      out.write("                    <!-- Main Logo of Website -->\r\n");
      out.write("                    <center>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            <img class=\"MainLogo\" src=\"images/MediMartLogoF.png\" alt=\"MainLogo\">\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </center>\r\n");
      out.write("                    <!-- Navbar start -->\r\n");
      out.write("                        <div class=\"topnav\">\r\n");
      out.write("                            <!-- Centered area on Navbar -->\r\n");
      out.write("                                <div class=\"topnav-centered\">\r\n");
      out.write("                                    <div class=\"search-container\">\r\n");
      out.write("                                        <form action=\"/action_page.php\">\r\n");
      out.write("                                            <input type=\"text\" placeholder=\"Search..\" name=\"search\">\r\n");
      out.write("                                            <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            <!-- Left area on Navbar -->\r\n");
      out.write("                                <div class=\"topnav-left\">\r\n");
      out.write("                                    <a href=\"index.jsp\" class=\"active\">Home</a>\r\n");
      out.write("                                    <div class=\"dropdown\">\r\n");
      out.write("                                        <button class=\"dropbtn\">Shop \r\n");
      out.write("                                            <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                        <div class=\"dropdown-content\">\r\n");
      out.write("                                            <div class=\"header\">\r\n");
      out.write("                                                <h2>All Categary</h2>\r\n");
      out.write("                                            </div>   \r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"column\">\r\n");
      out.write("                                                    <h3>Category 1</h3>\r\n");
      out.write("                                                    <a href=\"#\">Link 1</a>\r\n");
      out.write("                                                    <a href=\"#\">Link 2</a>\r\n");
      out.write("                                                    <a href=\"#\">Link 3</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"column\">\r\n");
      out.write("                                                    <h3>Category 2</h3>\r\n");
      out.write("                                                    <a href=\"#\">Link 1</a>\r\n");
      out.write("                                                    <a href=\"#\">Link 2</a>\r\n");
      out.write("                                                    <a href=\"#\">Link 3</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"column\">\r\n");
      out.write("                                                    <h3>Category 3</h3>\r\n");
      out.write("                                                    <a href=\"#\">Link 1</a>\r\n");
      out.write("                                                    <a href=\"#\">Link 2</a>\r\n");
      out.write("                                                    <a href=\"#\">Link 3</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div> \r\n");
      out.write("                                    <div class=\"dropdown\">\r\n");
      out.write("                                        <button class=\"dropbtn\">Brands \r\n");
      out.write("                                            <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                        <div class=\"dropdown-content\">\r\n");
      out.write("                                            <div class=\"header\">\r\n");
      out.write("                                                <h2>Brand Menu</h2>\r\n");
      out.write("                                            </div>   \r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"column\">\r\n");
      out.write("                                                    <h3>Category 1</h3>\r\n");
      out.write("                                                    <a href=\"#\">Link 1</a>\r\n");
      out.write("                                                    <a href=\"#\">Link 2</a>\r\n");
      out.write("                                                    <a href=\"#\">Link 3</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"column\">\r\n");
      out.write("                                                    <h3>Category 2</h3>\r\n");
      out.write("                                                    <a href=\"#\">Link 1</a>\r\n");
      out.write("                                                    <a href=\"#\">Link 2</a>\r\n");
      out.write("                                                    <a href=\"#\">Link 3</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"column\">\r\n");
      out.write("                                                    <h3>Category 3</h3>\r\n");
      out.write("                                                    <a href=\"#\">Link 1</a>\r\n");
      out.write("                                                    <a href=\"#\">Link 2</a>\r\n");
      out.write("                                                    <a href=\"#\">Link 3</a>\r\n");
      out.write("                                                 </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div> \r\n");
      out.write("                                    <a href=\"about-us.jsp\">About Us</a>\r\n");
      out.write("                                    <a href=\"contact-us.jsp\">Contact</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            <!-- Right area on Navbar -->\r\n");
      out.write("                                <div class=\"topnav-right\">\r\n");
      out.write("                                    <div class=\"shoppingcart-link\">\r\n");
      out.write("                                        <a href=\"#shoppingcart\" class=\"\"><img class=\"shopping-cart\" src=\"images/ShoppingCartBlack.png\" alt=\"shopping-cart\"></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"Sign-links\">\r\n");
      out.write("                                        <a href=\"#about\" class=\"active\">SIGN IN / UP</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    <!-- Navbar end -->\r\n");
      out.write("                </div>\r\n");
      out.write("            <!-- Header section end -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write(" ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
