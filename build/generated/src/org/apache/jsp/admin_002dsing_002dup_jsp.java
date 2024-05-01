package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002dsing_002dup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            <div class=\"background\"></div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("            <div class=\"image01\">\n");
      out.write("                <img src=\"images/login-and-sign up/5670.jpg\"style=\"position:relative;width: 800px; height: 580px; z-index: -1;\">\n");
      out.write("            </div>\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <h2 class=\"logo\">MediMart</h2>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"logreg-box\">\n");
      out.write("                    <div class=\"form-box login\">\n");
      out.write("                        <form action=\"loginServlet\" method=\"POST\" >\n");
      out.write("                            <h2>Admin Sign Up</h2>\n");
      out.write("                            \n");
      out.write("                            <div class=\"input-box\">\n");
      out.write("                                <span class=\"icon\"><i class='bx bxs-user'></i></span>\n");
      out.write("                                <input type=\"text\" name=\"aname\" required>\n");
      out.write("                                <label>Username</label>\n");
      out.write("                            </div>\n");
      out.write("    \n");
      out.write("                            <div class=\"input-box\">\n");
      out.write("                                <span class=\"icon\"><i class='bx bxs-envelope' ></i></span>\n");
      out.write("                                <input type=\"email\" name=\"aemail\" required>\n");
      out.write("                                <label>Email</label>\n");
      out.write("                            </div>\n");
      out.write("    \n");
      out.write("                            <div class=\"input-box\">\n");
      out.write("                                <span class=\"icon\"><i class='bx bxs-lock-alt'></i></span>\n");
      out.write("                                <input type=\"password\" name=\"apsw\" required>\n");
      out.write("                                <label>Password</label>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"input-box\">\n");
      out.write("                                <span class=\"icon\"><i class='bx bxs-lock-alt'></i></span>\n");
      out.write("                                <input type=\"password\" name=\"arpsw\"  required>\n");
      out.write("                                <label>Repeat Password</label>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"input-box\">\n");
      out.write("                                <span class=\"icon\"><i class='bx bxs-phone'></i></span>\n");
      out.write("                                <input type=\"tel\" name=\"acontact\" required>\n");
      out.write("                                <label>Contact Number</label>\n");
      out.write("                            </div>\n");
      out.write("    \n");
      out.write("                            <div class=\"remember-forget\">\n");
      out.write("                                <label><input type=\"checkbox\">Accept Terms and Conditions</label>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("    \n");
      out.write("                            <button type=\"submit\" class=\"btn\">Sign In</button>\n");
      out.write("    \n");
      out.write("                            \n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </body>\n");
      out.write("</html>\n");
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
