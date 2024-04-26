package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>....</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/footer.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Footer section start -->\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"footer\">\r\n");
      out.write("                <!-- Fist left side on footer -->\r\n");
      out.write("                    <div class=\"first-left\">\r\n");
      out.write("                        <ul class=\"decription-footer\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"http://\"><img class=\"medimart-logo\" src=\"img/Medi Mart Logo New 1.png\" alt=\"medimart-logo\"></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <p class=\"About-footer\">\r\n");
      out.write("                                    Welcome to MediMart - your trusted <br> \r\n");
      out.write("                                    pharmacy for prescriptions, OTC <br>\r\n");
      out.write("                                    products and health essentials. <br>\r\n");
      out.write("                                    Enjoy quality, affordability and <br>\r\n");
      out.write("                                    fast, secure service. Your well <br>\r\n");
      out.write("                                    -being matters most.\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <div class=\"footer-social-links\">\r\n");
      out.write("                                    <a href=\"http://\"><img class=\"foot-facebook-logo\" src=\"imgages/facebook.png\" alt=\"facebook-logo\"> </a>\r\n");
      out.write("                                    <a href=\"http://\"><img class=\"foot-messenger-logo\" src=\"imgages/messenger.png\" alt=\"messenger-logo\"> </a>\r\n");
      out.write("                                    <a href=\"http://\"><img class=\"foot-whatsapp-logo\" src=\"imgages/whatsapp.png\" alt=\"whatsapp-logo\"> </a>\r\n");
      out.write("                                    <a href=\"http://\"><img class=\"foot-email-logo\" src=\"imgages/email.png\" alt=\"email-logo\"> </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                <!-- Fist left side on footer -->\r\n");
      out.write("                    <div class=\"second-left\">\r\n");
      out.write("                        <ul class=\"quick-links\">\r\n");
      out.write("                            <h3 class=\"quick-links-header\">Quick Links</h3>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"http://\" class=\"home-link\">Home</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"http://\" class=\"shop-link\">Shop</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"http://\" class=\"brands-link\">Brands</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"http://\" class=\"aboutus-link\">About Us</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"http://\" class=\"contact\">Contact</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"http://\" class=\"cart\">Shopping Cart</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                <!-- Center side on footer -->\r\n");
      out.write("                    <div class=\"foot-center\">\r\n");
      out.write("                        <ul class=\"contact-number-links\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"\" alt=\"\">\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                <!-- First right side on footer -->\r\n");
      out.write("                    <div class=\"first-right\">\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                <!-- Second right side on footer -->\r\n");
      out.write("                    <div class=\"second-right\">\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("        <!-- Footer section end -->\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
