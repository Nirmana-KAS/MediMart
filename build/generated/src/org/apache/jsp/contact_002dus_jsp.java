package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_002dus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/contact-us.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write(" \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"container2\">\r\n");
      out.write("                <img src=\"images/vector1.png\" alt=\"Vector 1\" class=\"vector vector-1\">\r\n");
      out.write("                <img src=\"images/vector2.png\" alt=\"Vector 2\" class=\"vector vector-2\">\r\n");
      out.write("                <img src=\"images/vector3.png\" alt=\"Vector 3\" class=\"vector vector-3\">\r\n");
      out.write("                <img src=\"images/vector4.png\" alt=\"Vector 4\" class=\"vector vector-4\">\r\n");
      out.write("                <img src=\"images/vector5.png\" alt=\"Vector 5\" class=\"vector vector-5\">\r\n");
      out.write("                <img src=\"images/vector6.png\" alt=\"Vector 6\" class=\"vector vector-6\">\r\n");
      out.write("                <img src=\"images/vector7.png\" alt=\"Vector 7\" class=\"vector vector-7\">\r\n");
      out.write("                <img src=\"images/vector8.png\" alt=\"Vector 8\" class=\"vector vector-8\"> \r\n");
      out.write("            </div>\r\n");
      out.write("        <div class=\"tableform\" >\r\n");
      out.write("            <table >\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"image-column\">\r\n");
      out.write("                        <!-- Your large image goes here -->\r\n");
      out.write("                        <img src=\"images/con 02.png\" alt=\"Large Image\" height=\"100%\" width=100%>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td class=\"form-column\">\r\n");
      out.write("                        <form action=\"ContactServlet\" method=\"post\">\r\n");
      out.write("                            <h2>Get in Touch</h2>\r\n");
      out.write("                            <input type=\"text\" name=\"name\" placeholder=\"Your Name\" required>\r\n");
      out.write("                            <input type=\"email\" name=\"email\" placeholder=\"Email Id\" required>\r\n");
      out.write("                            <input type=\"text\" name=\"phone\" placeholder=\"Phone No.\" required>\r\n");
      out.write("                            <textarea name=\"message\" rows=\"4\" placeholder=\"How can we help you ?\"></textarea>\r\n");
      out.write("                            <button type=\"submit\" name=\"submit\">Send</button> \r\n");
      out.write("                        </form>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div>\r\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("  \r\n");
      out.write("    </div>       \r\n");
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
