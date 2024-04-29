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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>....</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/footer.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Footer section start -->\r\n");
      out.write("            <footer>\r\n");
      out.write("                <div class=\"decription-footer\">\r\n");
      out.write("                    <!-- Fist left side on footer -->\r\n");
      out.write("                        <div class=\"first-left\">\r\n");
      out.write("                            <ul class=\"about-footer-links\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"http://\"><img class=\"medimart-logo\" src=\"images/MediMartFootLogo.png\" alt=\"medimart-logo\"></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <p class=\"About-footer\">\r\n");
      out.write("                                        Welcome to MediMart - your trusted <br> \r\n");
      out.write("                                        pharmacy for prescriptions, OTC <br>\r\n");
      out.write("                                        products and health essentials. <br>\r\n");
      out.write("                                        Enjoy quality, affordability and <br>\r\n");
      out.write("                                        fast, secure service. Your well <br>\r\n");
      out.write("                                        -being matters most.\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"footer-social-links\">\r\n");
      out.write("                                        <a href=\"http://\"><img class=\"foot-facebook-logo\" src=\"images/facebook.png\" alt=\"facebook-logo\"> </a>\r\n");
      out.write("                                        <a href=\"http://\"><img class=\"foot-messenger-logo\" src=\"images/messenger.png\" alt=\"messenger-logo\"> </a>\r\n");
      out.write("                                        <a href=\"http://\"><img class=\"foot-whatsapp-logo\" src=\"images/whatsapp.png\" alt=\"whatsapp-logo\"> </a>\r\n");
      out.write("                                        <a href=\"http://\"><img class=\"foot-email-logo\" src=\"images/email.png\" alt=\"email-logo\"> </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    <!-- Second left side on footer -->\r\n");
      out.write("                        <div class=\"second-left\">\r\n");
      out.write("                            <ul class=\"quick-links\">\r\n");
      out.write("                                <h3 class=\"quick-links-header\">Quick Links</h3>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"http://\" class=\"home-link\">Home</a>\r\n");
      out.write("                                \r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"http://\" class=\"shop-link\">Shop</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"http://\" class=\"brands-link\">Brands</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"http://\" class=\"aboutus-link\">About Us</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"http://\" class=\"contact\">Contact</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"http://\" class=\"cart\">Shopping Cart</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    <!-- Center side on footer -->\r\n");
      out.write("                        <div class=\"foot-center\">\r\n");
      out.write("                            <ul class=\"contact-number-links\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <img class=\"custemercare\" src=\"images/CustemerCare.png\" alt=\"custemercare\">\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a class=\"cutomercare-link\" href=\"tel:+9411 222 333 444\"><img class=\"cutomercare-logo\" src=\"images/CustemerCareLogo.png\" alt=\"cutomercare-logo\">  Cutomer Care : +9411 222 333 444</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a class=\"physicalstore-link\" href=\"tel:+9411 555 666 777\"><img class=\"physicalstore-logo\" src=\"images/PhysicalStoreLogo.png\" alt=\"physicalstore-logo\">  Physical Store : +9411 555 666 777</a>\r\n");
      out.write("                                </li>    \r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    <!-- First right side on footer -->\r\n");
      out.write("                        <div class=\"first-right\">\r\n");
      out.write("                            <ul class=\"openinig-hours-links\">\r\n");
      out.write("                                <h3>Opening Hours</h3>\r\n");
      out.write("                                <li>Online store: 24/7 Service</li>\r\n");
      out.write("                                <h5>Physical store :</h5>\r\n");
      out.write("                                <li> Mon - Fri : 08.00 A.M. - 09.00 P.M. </li>\r\n");
      out.write("                                <li>Sat : 08.00 A.M. - 06.00 P.M.</li>\r\n");
      out.write("                                <li>Sun : 08.00 A.M. - 02.00 P.M.</li>\r\n");
      out.write("                                <h5>Noticed!</h5>\r\n");
      out.write("                                <li>Special Holidays Open</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    <!-- Second right side on footer -->\r\n");
      out.write("                        <div class=\"second-right\">\r\n");
      out.write("                            <ul class=\"singnup-links\">\r\n");
      out.write("                                <h3>Sign Up Today</h3>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <form action=\"/action_page.php\">\r\n");
      out.write("                                        <input type=\"text\" placeholder=\"Email address\" name=\"mail\" required>\r\n");
      out.write("                                        <input type=\"submit\" value=\"Subscribe\">\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <h5>Location</h5>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"http://\"><img class=\"footer-location-logo\" src=\"images/location.png\" alt=\"footer-location-logo\"> NO:121/2, High level Road, Homagama</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <img class=\"footer-fastdelivery-logo\" src=\"images/FastDeliveryLogo.png\" alt=\"footer-fastdelivery-logo\">\r\n");
      out.write("                                    <img class=\"footer-freedelivery-logo\" src=\"images/FreeDeliveryLogo.png\" alt=\"footer-freedelivery-logo\">\r\n");
      out.write("                                    <img class=\"footer-safedelivery-logo\" src=\"images/SafeDeliveryLogo.png\" alt=\"footer-safedelivery-logo\">\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    <!-- Payment links area on footer -->\r\n");
      out.write("                        <div class=\"payment-links\">\r\n");
      out.write("                            <center>\r\n");
      out.write("                                <a href=\"http://\"><img class=\"bank-logo\" src=\"images/BankLogo.png\" alt=\"bank-logo\"></a>\r\n");
      out.write("                                <a href=\"http://\"><img class=\"visa-logo\" src=\"images/VisaLogo.png\" alt=\"visa-logo\"></a>\r\n");
      out.write("                                <a href=\"http://\"><img class=\"master-logo\" src=\"images/MasterLogo.png\" alt=\"master-logo\"></a>\r\n");
      out.write("                                <a href=\"http://\"><img class=\"paypal-logo\" src=\"images/PaypalLogo.png\" alt=\"paypal-logo\"></a>\r\n");
      out.write("                                <a href=\"http://\"><img class=\"vishwa-logo\" src=\"images/VishwaLogo.png\" alt=\"vishwa-logo\"></a>\r\n");
      out.write("                                <a href=\"http://\"><img class=\"amex-logo\" src=\"images/AmexLogo.png\" alt=\"amex-logo\"></a>\r\n");
      out.write("                                <a href=\"http://\"><img class=\"frimi-logo\" src=\"images/FrimiLgo.png\" alt=\"frimi-logo\"></a>\r\n");
      out.write("                                <a href=\"http://\"><img class=\"genie-logo\" src=\"images/GenieLogo.png\" alt=\"genie-logo\"></a>\r\n");
      out.write("                                <a href=\"http://\"><img class=\"ezcash-logo\" src=\"images/EzcashLogo.png\" alt=\"ezcash-logo\"></a>\r\n");
      out.write("                                <a href=\"http://\"><img class=\"lakpay-logo\" src=\"images/LakpayLogo.png\" alt=\"lakpay-logo\"></a>\r\n");
      out.write("                                <a href=\"http://\"><img class=\"upay-logo\" src=\"images/UpayLogo.png\" alt=\"upay-logo\"></a>\r\n");
      out.write("                                <a href=\"http://\"><img class=\"mcash-logo\" src=\"images/McashLogo.png\" alt=\"mcash-logo\"></a>\r\n");
      out.write("                            </center>\r\n");
      out.write("                        </div>    \r\n");
      out.write("                <div> \r\n");
      out.write("            </footer> \r\n");
      out.write("        <!-- Footer section end --> \r\n");
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
