package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/admin.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <header class=\"header\">\r\n");
      out.write("              <h1>Admin Panel</h1>\r\n");
      out.write("            </header>\r\n");
      out.write("            <nav class=\"sidebar\">\r\n");
      out.write("              <ul>\r\n");
      out.write("                <li><a href=\"#\">Products</a></li>\r\n");
      out.write("                <li><a href=\"#\">Users</a></li>\r\n");
      out.write("                <li><a href=\"#\">Settings</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <main class=\"content\">\r\n");
      out.write("              <h2>Products</h2>\r\n");
      out.write("              <div class=\"product-list\">\r\n");
      out.write("                <table>\r\n");
      out.write("                  <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <th>ID</th>\r\n");
      out.write("                      <th>Name</th>\r\n");
      out.write("                      <th>Price</th>\r\n");
      out.write("                      <th>Action</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                  </thead>\r\n");
      out.write("                  <tbody>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"product-form\">\r\n");
      out.write("                <h3>Add Product</h3>\r\n");
      out.write("                <form id=\"product-form\">\r\n");
      out.write("                  <label for=\"pid\">Product ID:</label>\r\n");
      out.write("                  <input type=\"text\" name=\"pid\" required>\r\n");
      out.write("                  \r\n");
      out.write("                  <label for=\"pname\">Name</label>\r\n");
      out.write("                  <input type=\"text\"  name=\"pname\" required>\r\n");
      out.write("                  \r\n");
      out.write("                  <label for=\"pprice\">Price:</label>\r\n");
      out.write("                  <input type=\"number\" name=\"pprice\" required>\r\n");
      out.write("                  \r\n");
      out.write("                  <label for=\"pdescription\">Description:</label>\r\n");
      out.write("                  <input type=\"text\" name=\"pdescription\" required>\r\n");
      out.write("                  \r\n");
      out.write("                  <label for=\"pquantity\">Quantity:</label>\r\n");
      out.write("                  <input type=\"number\" name=\"pquantity\" required>\r\n");
      out.write("                  \r\n");
      out.write("                  <label for=\"ptype\">Type:</label>\r\n");
      out.write("                  <input type=\"text\" name=\"ptype\" required>\r\n");
      out.write("                  \r\n");
      out.write("                  <button type=\"submit\">Add Product</button>\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"product-form\">\r\n");
      out.write("                <h3>Delete Product</h3>\r\n");
      out.write("                <form id=\"product-form\">\r\n");
      out.write("                  <label for=\"pid\">Product ID:</label>\r\n");
      out.write("                  <input type=\"text\" name=\"pid\" required> \r\n");
      out.write("                  \r\n");
      out.write("                  <button type=\"submit\">Delete Product</button>\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"product-form\">\r\n");
      out.write("                <h3>Edit Product</h3>\r\n");
      out.write("                <form id=\"product-form\">\r\n");
      out.write("                 <label for=\"pid\">Product ID:</label>\r\n");
      out.write("                  <input type=\"text\" name=\"pid\" required>\r\n");
      out.write("                  \r\n");
      out.write("                  <label for=\"pname\">Name</label>\r\n");
      out.write("                  <input type=\"text\"  name=\"pname\" required>\r\n");
      out.write("                  \r\n");
      out.write("                  <label for=\"pprice\">Price:</label>\r\n");
      out.write("                  <input type=\"number\" name=\"pprice\" required>\r\n");
      out.write("                  \r\n");
      out.write("                  <label for=\"pdescription\">Description:</label>\r\n");
      out.write("                  <input type=\"text\" name=\"pdescription\" required>\r\n");
      out.write("                  \r\n");
      out.write("                  <label for=\"pquantity\">Quantity:</label>\r\n");
      out.write("                  <input type=\"number\" name=\"pquantity\" required>\r\n");
      out.write("                  \r\n");
      out.write("                  <label for=\"ptype\">Type:</label>\r\n");
      out.write("                  <input type=\"text\" name=\"ptype\" required>\r\n");
      out.write("                  \r\n");
      out.write("                  <button type=\"submit\">Edit Product</button>\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("            </main>\r\n");
      out.write("          </div>\r\n");
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
