package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_002dus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/about-us.css\"> \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write(" \r\n");
      out.write("            <div class=\"description\">\r\n");
      out.write("                <div class=\"slide\">\r\n");
      out.write("                    <img src=\"images/b6.jpg\" alt=\"Image 1\">\r\n");
      out.write("                  </div>      \r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                  <h2><b>Get To Know MEDIMART</b></h2>\r\n");
      out.write("                  <p>Welcome to Medi Mart, your trusted online pharmacy committed to providing convenient access to high-quality healthcare products and services. \r\n");
      out.write("                    At Medi Mart, we understand the importance of reliable, affordable, and accessible healthcare solutions, which is why we strive to be your partner in wellness.\r\n");
      out.write("                    <br><br>Founded with a passion for improving healthcare accessibility, Medi Mart is dedicated to serving individuals and families with the utmost care and professionalism.\r\n");
      out.write("                     Our mission is to empower our customers to lead healthier lives by offering a wide range of pharmaceutical products, wellness essentials, and expert advice right at your fingertips.\r\n");
      out.write("                     <br><br>With a team of experienced pharmacists and healthcare professionals, we prioritize your well-being above all else. Whether you're managing a chronic condition, seeking \r\n");
      out.write("                    over-the-counter remedies, or simply looking for personalized healthcare guidance, our knowledgeable staff is here to support you every step of the way. \r\n");
      out.write("                    <br><br>At Medi Mart, we uphold the highest standards of safety, efficacy, and customer service. We partner with reputable suppliers and adhere to strict quality control measures to ensure\r\n");
      out.write("                     that every product you receive meets our rigorous standards.\r\n");
      out.write("                     <br><br>As a customer-centric online pharmacy, we're dedicated to making your shopping experience seamless and hassle-free. With convenient ordering, fast shipping, \r\n");
      out.write("                    and discreet packaging, we strive to exceed your expectations at every turn.\r\n");
      out.write("                    <br><br>Thank you for choosing Medi Mart as your healthcare partner. We look forward to serving you and helping you live your healthiest life.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div> \r\n");
      out.write("        <div class =\"description2\">        \r\n");
      out.write("                <div class=\"content2\">\r\n");
      out.write("                  <h2><b>Why Choose MEDIMART</b></h2>\r\n");
      out.write("                </div>        \r\n");
      out.write("        <div class=\"slide2\">\r\n");
      out.write("              <div class=\"info-box\">\r\n");
      out.write("                <img src=\"images/gq.jpeg\" alt=\"Image 2\">\r\n");
      out.write("                <div class=\"info-content\">\r\n");
      out.write("                    <h2>Good Quality</h2>\r\n");
      out.write("                    <p>Discover premium health solutions at MediMart! From trusted brands to rigorously tested medications, \r\n");
      out.write("                        our selection ensures your well-being comes first. Elevate your health journey with our top-quality medicines, curated to empower your vitality and wellness.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>       \r\n");
      out.write("            <div class=\"info-box\">\r\n");
      out.write("                <img src=\"images/free d.jpg\" alt=\"Image 3\">\r\n");
      out.write("                <div class=\"info-content\">\r\n");
      out.write("                    <h2>Free Delivery</h2>\r\n");
      out.write("                    <p>Enjoy the convenience of doorstep delivery with MediMart! Get your essential medications delivered for free, right to your doorstep. \r\n");
      out.write("                        Say goodbye to the hassle of pharmacy runs and hello to seamless healthcare solutions. Experience the ease of online shopping with MediMart's free delivery service.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"info-box\">\r\n");
      out.write("                <img src=\"images/safety.jpg\" alt=\"Image 4\">\r\n");
      out.write("                <div class=\"info-content\">\r\n");
      out.write("                    <h2>Safety</h2>\r\n");
      out.write("                    <p>Discover peace of mind with MediMart's safety-first approach to medicines. Our meticulously curated selection ensures every product meets stringent quality standards, \r\n");
      out.write("                        so you can trust in both efficacy and safety. Your well-being is our priority, making your journey to better health both reliable and reassuring.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>       \r\n");
      out.write("        <div class =\"description3\">        \r\n");
      out.write("            <div class=\"content3\">\r\n");
      out.write("              <h2><b>Customers' Reviews</b></h2>\r\n");
      out.write("            </div>       \r\n");
      out.write("        <div class=\"carousel-container\">\r\n");
      out.write("            <div class=\"carousel\">\r\n");
      out.write("              <div class=\"carousel-item\">\r\n");
      out.write("                <div class=\"customer-name\"><b>John Smith</b></div><br>\r\n");
      out.write("                <div class=\"customer-review\">MediMart Online Pharmacy saved me so much time and hassle. Their website is easy to navigate, and I received my medication right on time!.</div><br>\r\n");
      out.write("                <div class=\"stars\">\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"carousel-item\">\r\n");
      out.write("                <div class=\"customer-name\"><b>Emily Johnson</b></div><br>\r\n");
      out.write("                <div class=\"customer-review\">I've been using MediMart for years now, and they've always been reliable. Their customer service is top-notch, and I appreciate their attention to detail.</div><br>\r\n");
      out.write("                <div class=\"stars\">\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9734;</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>       \r\n");
      out.write("              <div class=\"carousel-item\">\r\n");
      out.write("                <div class=\"customer-name\"><b>Michael Brown</b></div><br>\r\n");
      out.write("                <div class=\"customer-review\">I was skeptical about ordering medication online at first, but MediMart exceeded my expectations. The process was seamless, and I got exactly what I needed.</div><br>\r\n");
      out.write("                <div class=\"stars\">\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>      \r\n");
      out.write("              <div class=\"carousel-item\">\r\n");
      out.write("                <div class=\"customer-name\"><b>Sarah Davis</b></div><br>\r\n");
      out.write("                <div class=\"customer-review\">I rely on MediMart for all my prescription needs. Their prices are competitive, and the delivery is always prompt. Highly recommended!.</div><br>\r\n");
      out.write("                <div class=\"stars\">\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9734;</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>        \r\n");
      out.write("              <div class=\"carousel-item\">\r\n");
      out.write("                <div class=\"customer-name\"><b>David Wilson</b></div><br>\r\n");
      out.write("                <div class=\"customer-review\">I'm impressed with the professionalism of MediMart. Their pharmacists are knowledgeable, and I feel confident knowing I'm getting quality medication.</div><br>\r\n");
      out.write("                <div class=\"stars\">\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9734;</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>        \r\n");
      out.write("              <div class=\"carousel-item\">\r\n");
      out.write("                <div class=\"customer-name\"><b>Jennifer Martinez</b></div><br>\r\n");
      out.write("                <div class=\"customer-review\">I love the convenience of ordering from MediMart. It's so much easier than going to a physical pharmacy, especially when you're busy.</div><br>\r\n");
      out.write("                <div class=\"stars\">\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>        \r\n");
      out.write("              <div class=\"carousel-item\">\r\n");
      out.write("                <div class=\"customer-name\"><b>Robert Taylor</b></div><br>\r\n");
      out.write("                <div class=\"customer-review\">MediMart has been a lifesaver for me. As someone with a chronic condition, having my medication delivered to my door is a game-changer.</div><br>\r\n");
      out.write("                <div class=\"stars\">\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>        \r\n");
      out.write("              <div class=\"carousel-item\">\r\n");
      out.write("                <div class=\"customer-name\"><b>Samantha Thompson</b></div><br>\r\n");
      out.write("                <div class=\"customer-review\">I appreciate the discreet packaging from MediMart. It's important to me to maintain privacy when it comes to my healthcare, and they understand that.</div><br>\r\n");
      out.write("                <div class=\"stars\">\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9733;</span>\r\n");
      out.write("                  <span class=\"star\">&#9734;</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>        \r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          </div>       \r\n");
      out.write("          <script>\r\n");
      out.write("            const carousel = document.querySelector('.carousel');\r\n");
      out.write("            const carouselItems = document.querySelectorAll('.carousel-item');\r\n");
      out.write("            const totalItems = carouselItems.length;\r\n");
      out.write("            let currentIndex = 0;          \r\n");
      out.write("            function showNextItem() {\r\n");
      out.write("              currentIndex = (currentIndex + 1) % totalItems;\r\n");
      out.write("              updateCarousel();\r\n");
      out.write("            }         \r\n");
      out.write("            function updateCarousel() {\r\n");
      out.write("              const newPosition = -currentIndex * 100 + '%';\r\n");
      out.write("              carousel.style.transform = `translateX(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newPosition}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(")`;\r\n");
      out.write("            }          \r\n");
      out.write("            setInterval(showNextItem, 5000); \r\n");
      out.write("          </script> \r\n");
      out.write("          <section class=\"description4\">\r\n");
      out.write("            <img src=\"images/b4.jpg\" alt=\"Bottom Background Image\" style=\"position:relative; bottom: 0;padding-bottom: 30px; left: 0; width: 2000px; height: 600px; z-index: -1;\">\r\n");
      out.write("            <div class=\"content4\">\r\n");
      out.write("              <h1>Thank You For Trusting<br> MEDIMART!</h1>\r\n");
      out.write("              <br>\r\n");
      out.write("                <p>Thank you for entrusting your wellness journey to MediMart, where care meets convenience! Your visit and choice to join us online is a sweet \r\n");
      out.write("                testament to our commitment to providing top-notch service and quality products. We're honored to be part of your health and well-being, and \r\n");
      out.write("                we look forward to serving you with dedication and warmth on every step of your healthcare voyage.</p>\r\n");
      out.write("                <button class=\"custom-button\">Start shopping With Us</button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </section>  \r\n");
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
