package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Hero Section</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/hero.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write(" \r\n");
      out.write("        </div>\r\n");
      out.write("      <section class=\"hero-section\">\r\n");
      out.write("        <img src=\"images/b3.jpg\" alt=\"hero Background Image\" style=\"position:relative;width: 2000px; height: 1000px; z-index: -1;\">\r\n");
      out.write("        <div class=\"hero-content\">\r\n");
      out.write("          <h1>WELCOME TO MEDIMART</h1>\r\n");
      out.write("          <p><b>Your Trusted Online Pharmacy Destination!</b><br>\r\n");
      out.write("            <br>\r\n");
      out.write("              Explore a wide range of high - quality <br>\r\n");
      out.write("              medications, health products & wellness<br>\r\n");
      out.write("              essentials, all conveniently available at<br>\r\n");
      out.write("              your fingertips.With our seamless shopping<br>\r\n");
      out.write("              experience,expert guidance & reliable delivery,<br> \r\n");
      out.write("              your journey to better health begins here.\r\n");
      out.write("              <br>\r\n");
      out.write("              <br><b>Start shopping with confidence at MediMart today!</b></p>\r\n");
      out.write("              <button class=\"custom-button\">Shop Now</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section> \r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"section2\">\r\n");
      out.write("      <div class=\"slide\">\r\n");
      out.write("        <img src=\"images/nfoods.jpg\" alt=\"Image 1\">\r\n");
      out.write("        <div class=\"info-box\">\r\n");
      out.write("          <h2>Naturally<br> Good</h2>\r\n");
      out.write("          <p><b>Up To 25% OFF</b><br><br><button class=\"custom-button\">Shop Now</button></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"slide\">\r\n");
      out.write("        <img src=\"images/daily essentials.jpg\" alt=\"Image 2\">\r\n");
      out.write("        <div class=\"info-box\">\r\n");
      out.write("          <h2>Daily Health<br> Essentials</h2>\r\n");
      out.write("          <p><b>Up To 15% OFF</b><br><br><button class=\"custom-button\">Shop Now</button></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"slide\">\r\n");
      out.write("        <img src=\"images/medicine.jpg\" alt=\"Image 3\">\r\n");
      out.write("        <div class=\"info-box\">\r\n");
      out.write("          <h2>High Quality Medicines</h2>\r\n");
      out.write("          <p><b>Up To 5% OFF</b><br><br><button class=\"custom-button\">Shop Now</button></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"slide\">\r\n");
      out.write("        <img src=\"images/healthcare.jpg\" alt=\"Image 4\">\r\n");
      out.write("        <div class=\"info-box\">\r\n");
      out.write("          <h2>Healthcare <br>Products</h2>\r\n");
      out.write("          <p><b>Up To 30% OFF</b><br><br><button class=\"custom-button\">Shop Now</button></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>   \r\n");
      out.write("    <div class =\"description\">\r\n");
      out.write("      <div class=\"content\">\r\n");
      out.write("        <h2><b>Our Services</b></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("    <div class =\"description1\">\r\n");
      out.write("    <div class = \"info-content\">\r\n");
      out.write("     <img src=\"images/a.jpg\" alt=\"Image 5\">  \r\n");
      out.write("     <div class=\"info-box\" >     \r\n");
      out.write("       <h2>Best In Pharma Service</h2>\r\n");
      out.write("       <p>Best In Pharma Service offers top-tier pharmaceutical solutions, delivering excellence in quality, reliability, and innovation to meet diverse healthcare needs.</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>  \r\n");
      out.write("    <div class = \"info-content\">\r\n");
      out.write("      <img src=\"images/c.jpg\" alt=\"Image 6\">\r\n");
      out.write("      <div class=\"info-box\">  \r\n");
      out.write("        <h2>Consult A Doctor Now</h2>\r\n");
      out.write("        <p>Instant access to professional medical advice anytime, anywhere. Consult a Doctor Now for quick, personalized assistance.</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>    \r\n");
      out.write("  <div class = \"info-content\">\r\n");
      out.write("    <img src=\"images/b.jpg\" alt=\"Image 7\">\r\n");
      out.write("    <div class=\"info-box\">  \r\n");
      out.write("       <h2>Generic Medicines & Prescription Drugs</h2>\r\n");
      out.write("       <p>Quality medicine ensures safe and effective treatment. Trust in your prescription's efficacy and safety with rigorously tested medications meeting stringent quality standards.</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("    <h2><b>Online pharmaceuticals available 24/7</b></h2>\r\n");
      out.write("    <p>Conveniently access prescription medications and healthcare essentials from the comfort of your home with our online pharmacy.\r\n");
      out.write("      Browse a <br>wide selection of trusted medications, wellness products, and expert advice, all delivered straight to your doorstep.\r\n");
      out.write("      Enjoy secure transactions,<br> discreet packaging,and personalized support, ensuring your health needs are met with convenience\r\n");
      out.write("      and peace of mind.</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class =\"description2\">\r\n");
      out.write("    <div class = \"info-content2\">\r\n");
      out.write("      <img src=\"images/delivery.jpg\" alt=\"Image 8\">  \r\n");
      out.write("      <div class=\"info-box1\" >     \r\n");
      out.write("      <h2>Free & Fast Delivery</h2>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>  \r\n");
      out.write("  <div class = \"info-content2\">\r\n");
      out.write("    <img src=\"images/save money.jpg\" alt=\"Image 9\">\r\n");
      out.write("    <div class=\"info-box1\">  \r\n");
      out.write("    <h2>Saving Money</h2>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>  \r\n");
      out.write("<div class = \"info-content2\">\r\n");
      out.write("    <img src=\"images/time saving.jpg\" alt=\"Image 10\">\r\n");
      out.write("    <div class=\"info-box1\">  \r\n");
      out.write("    <h2>Saving Time</h2>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"description6\">\r\n");
      out.write("  <div class=\"content6\">\r\n");
      out.write("    <h2><b>High Quality Medicines & Products</b></h2>\r\n");
      out.write("    <p>Discover a world where excellence meets health in our collection of high-quality products and medicines. Crafted with precision and care,each item embodies\r\n");
      out.write("        a commitment to your well-being, offering a blend of efficacy, safety, and reliability. From cutting-edge pharmaceuticals to premium wellness essentials,\r\n");
      out.write("        our online pharmacy site curates a selection that elevates your health journey. Embrace confidence in every purchase, knowing that we prioritize your health\r\n");
      out.write("        above all else, delivering nothing short of excellence straight to your doorstep.</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"slide6\">\r\n");
      out.write("    <img src=\"images/c1.jpg\" alt=\"Image 11\">\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"description5\">\r\n");
      out.write("  <div class=\"content5\">\r\n");
      out.write("    <h2><b>Our Shipping Products</b></h2> \r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"section5\">\r\n");
      out.write("  <div class=\"slide\">\r\n");
      out.write("    <img src=\"images/img1.jpg\" alt=\"Image 12\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"slide\">\r\n");
      out.write("    <img src=\"images/img 2.jpg\" alt=\"Image 13\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"slide\">\r\n");
      out.write("    <img src=\"images/img3.jpg\" alt=\"Image 14\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"slide\">\r\n");
      out.write("    <img src=\"images/img4.jpg\" alt=\"Image 15\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"slide\">\r\n");
      out.write("    <img src=\"images/img5.jpg\" alt=\"Image 16\">\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"section6\">\r\n");
      out.write("    <button class=\"custom-button\">See More Products</button>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("<div class=\"description3\">\r\n");
      out.write("  <div class=\"content3\">\r\n");
      out.write("    <h2><b>Latest News</b></h2>\r\n");
      out.write("    <p>Keep up to date with latest pharmacy news, learning and insights. Read the latest pharmacy news written by experts in the field, updated regularly.</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"description4\">\r\n");
      out.write("    <div class=\"info-content3\">\r\n");
      out.write("      <img src=\"images/covid-19.jpg\" alt=\"Image 17\">  \r\n");
      out.write("      <div class=\"info-box3\" >     \r\n");
      out.write("        <h2>4 Years In, a Sobering Look at Long COVID Progress</h2>\r\n");
      out.write("        <p>Four years ago in the spring of 2020, physicians and patients coined the term \"long COVID\" to describe \r\n");
      out.write("          a form of the viral infection from which recovery seemed impossible. (And the old nickname \"long-haulers\" seems so quaint now.)\r\n");
      out.write("          What started as a pandemic that killed nearly 3 million people globally in 2020 alone would turn into a chronic disease causing\r\n");
      out.write("           a long list of symptoms â from extreme fatigue, to brain fog, tremors, nausea, headaches, rapid heartbeat, and more.\r\n");
      out.write("          Today, 6.4% of Americans report symptoms of long COVID, and many have never recovered.\r\n");
      out.write("        <br>\r\n");
      out.write("        <a href=\"https://www.medscape.com/viewarticle/years-sobering-look-long-covid-progress-2024a10007a8?form=fpf\">Read More</a></p>\r\n");
      out.write("     </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"info-content3\">\r\n");
      out.write("      <img src=\"images/future.jpg\" alt=\"Image 18\">  \r\n");
      out.write("      <div class=\"info-box3\" >     \r\n");
      out.write("        <h2>The Future of Pharmacy: How Advancements in Technology Are Transforming the Field</h2>\r\n");
      out.write("        <p>Rapid technological advancements have reshaped various aspects of our world, prompting discussions on the value of human connection, \r\n");
      out.write("          particularly in patient care within the field of pharmacy. Interestingly, many technological innovations in pharmacy not only preserve but also enhance \r\n");
      out.write("          the pharmacistâs ability to connect with patients, fostering compassion, which is crucial for positive health outcomes.\r\n");
      out.write("           These advancements have significantly expanded pharmacistsâ capacity for direct patient care.\r\n");
      out.write("          <br>\r\n");
      out.write("        <a href=\"https://www.pharmacytimes.com/view/the-future-of-pharmacy-how-advancements-in-technology-are-transforming-the-field\">Read More</a></p>\r\n");
      out.write("     </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"info-content3\">\r\n");
      out.write("      <img src=\"images/migraine.jpeg\" alt=\"Image 19\">  \r\n");
      out.write("      <div class=\"info-box3\" >     \r\n");
      out.write("        <h2>Extension Trial Analysis Shows Long-Term Safety, Efficacy of Atogepant in Patients With Migraines</h2>\r\n");
      out.write("        <p>Results from the open-label, 156-week extension phase 3 trial (NCT04686136) that evaluated the long-term safety and tolerability \r\n");
      out.write("          of atogepant (Qulipta; AbbVie) for the prevention of migraines in patients with chronic or episodic migraine were announced. The findings demonstrated that atogepantâs \r\n");
      out.write("          safety profile was consistent with previous data and no new safety signals were detected. The findings will be presented at the American Academy of \r\n");
      out.write("          Neurology Annual Meeting from April 13, 2024, to April 18, 2024, in Denver, Colorado.\r\n");
      out.write("        <br>\r\n");
      out.write("      <a href=\"https://www.pharmacytimes.com/view/extension-trial-analysis-shows-long-term-safety-efficacy-of-atogepant-in-patients-with-migraines\">Read More</a></p>\r\n");
      out.write("     </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write(" \r\n");
      out.write("</body>\r\n");
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
