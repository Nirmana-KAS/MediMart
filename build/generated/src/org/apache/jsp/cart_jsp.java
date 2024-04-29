package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/cart.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write(" \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1>Your Cart</h1>\r\n");
      out.write("                      \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"cart-table\">\r\n");
      out.write("        <div class=\"cart-header\">\r\n");
      out.write("            <div class=\"column\">Product Image</div>\r\n");
      out.write("            <div class=\"column\">Product Name</div>\r\n");
      out.write("            <div class=\"column\">Price</div>\r\n");
      out.write("            <div class=\"column\">Quantity</div>\r\n");
      out.write("            <div class=\"column\">Total</div>\r\n");
      out.write("         <div class=\"column\"> </div>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("         <!--  cart items (this are example....link this to add to cart button......    @ harsha) -->\r\n");
      out.write("        <div class=\"cart-item\">\r\n");
      out.write("            <div class=\"column\"><img src=\"image/1.jpg\" alt=\"BRILINTA 90MG TAB 56S\"></div>\r\n");
      out.write("            <div class=\"column\" id=\"set\">BRILINTA 90MG TAB 56S</div>\r\n");
      out.write("            <div class=\"column price\" id=\"set\">302.54 </div>\r\n");
      out.write("            <div class=\"column quantity\">\r\n");
      out.write("                <button class=\"decrease\">-</button>\r\n");
      out.write("                <input type=\"number\" value=\"1\">\r\n");
      out.write("                <button class=\"increase\">+</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"column total\" id=\"set\">302.54</div>\r\n");
      out.write("    <div class=\"column\"><button class=\"remove-item\">Remove</button></div> \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"cart-item\">\r\n");
      out.write("            <div class=\"column\"><img src=\"image/2.jpg\" alt=\"PLAVIX 75MG TABS 28 S\"></div>\r\n");
      out.write("            <div class=\"column\" id=\"set\">PLAVIX 75MG TABS 28 S</div>\r\n");
      out.write("            <div class=\"column price\" id=\"set\">34.72 </div>\r\n");
      out.write("            <div class=\"column quantity\">\r\n");
      out.write("                <button class=\"decrease\">-</button>\r\n");
      out.write("                <input type=\"number\" value=\"1\">\r\n");
      out.write("                <button class=\"increase\">+</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"column total\"id=\"set\" >34.72</div>\r\n");
      out.write("    <div class=\"column\"><button class=\"remove-item\">Remove</button></div> \r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"cart-item\">\r\n");
      out.write("            <div class=\"column\"><img src=\"image/3.png\" alt=\"CLOPIVAS 75MG\"></div>\r\n");
      out.write("            <div class=\"column\" id=\"set\">CLOPIVAS 75MG</div>\r\n");
      out.write("            <div class=\"column price\" id=\"set\">15.87</div>\r\n");
      out.write("            <div class=\"column quantity\">\r\n");
      out.write("                <button class=\"decrease\">-</button>\r\n");
      out.write("                <input type=\"number\" value=\"1\">\r\n");
      out.write("                <button class=\"increase\">+</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"column total\" id=\"set\">15.87</div>\r\n");
      out.write("    <div class=\"column\"><button class=\"remove-item\">Remove</button></div> \r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("     <!--  //////////////////////////////////////////////////////////// -->\r\n");
      out.write("    \r\n");
      out.write("    <div> <span id=\"cart-total\">00.00</span></div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"checkout-box\">\r\n");
      out.write("        <h2>Checkout</h2>\r\n");
      out.write("        <div class=\"subtotal\">\r\n");
      out.write("            Subtotal: <span id=\"subtotal\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"delivery-charges\">\r\n");
      out.write("            Delivery Charges: <span id=\"delivery-charges\">250.00</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"coupon\">\r\n");
      out.write("            <label for=\"coupon-input\">Enter Coupon:</label>\r\n");
      out.write("            <input type=\"text\" id=\"coupon-input\">\r\n");
      out.write("            <button id=\"apply-coupon\">Apply</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"grand-total\">\r\n");
      out.write("            Grand Total: <span id=\"grand-total\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <button id=\"checkout-button\">Checkout</button>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("    document.addEventListener(\"DOMContentLoaded\", function() {\r\n");
      out.write("        // calculate total price for a single item\r\n");
      out.write("        function calculateItemTotal(price, quantity) {\r\n");
      out.write("            return price * quantity;\r\n");
      out.write("        }\r\n");
      out.write("    \r\n");
      out.write("        // update total price for a single item\r\n");
      out.write("        function updateItemTotal(row) {\r\n");
      out.write("            var price = parseFloat(row.querySelector(\".price\").innerText);\r\n");
      out.write("            var quantity = parseInt(row.querySelector(\".quantity input\").value);\r\n");
      out.write("            var total = calculateItemTotal(price, quantity);\r\n");
      out.write("            row.querySelector(\".total\").innerText = total.toFixed(2);\r\n");
      out.write("            updateCartTotal();\r\n");
      out.write("            updateCheckoutBox(); \r\n");
      out.write("        }\r\n");
      out.write("    \r\n");
      out.write("        //  update total price for all items \r\n");
      out.write("        function updateCartTotal() {\r\n");
      out.write("            var cartItems = document.querySelectorAll(\".cart-item\");\r\n");
      out.write("            var totalPrice = 0;\r\n");
      out.write("            cartItems.forEach(function(item) {\r\n");
      out.write("                totalPrice += parseFloat(item.querySelector(\".total\").innerText);\r\n");
      out.write("            });\r\n");
      out.write("            document.querySelector(\"#cart-total\").innerText = totalPrice.toFixed(2);\r\n");
      out.write("        }\r\n");
      out.write("    \r\n");
      out.write("        // Event listener for quantity input changes\r\n");
      out.write("        var quantityInputs = document.querySelectorAll(\".quantity input\");\r\n");
      out.write("        quantityInputs.forEach(function(input) {\r\n");
      out.write("            input.addEventListener(\"change\", function() {\r\n");
      out.write("                var row = this.closest(\".cart-item\");\r\n");
      out.write("                updateItemTotal(row);\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    \r\n");
      out.write("        // Event listeners for increase and decrease buttons\r\n");
      out.write("        var increaseButtons = document.querySelectorAll(\".quantity .increase\");\r\n");
      out.write("        increaseButtons.forEach(function(button) {\r\n");
      out.write("            button.addEventListener(\"click\", function() {\r\n");
      out.write("                var input = this.parentNode.querySelector(\"input\");\r\n");
      out.write("                input.value = parseInt(input.value) + 1;\r\n");
      out.write("                var row = this.closest(\".cart-item\");\r\n");
      out.write("                updateItemTotal(row);\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    \r\n");
      out.write("        var decreaseButtons = document.querySelectorAll(\".quantity .decrease\");\r\n");
      out.write("        decreaseButtons.forEach(function(button) {\r\n");
      out.write("            button.addEventListener(\"click\", function() {\r\n");
      out.write("                var input = this.parentNode.querySelector(\"input\");\r\n");
      out.write("                if (parseInt(input.value) > 1) {\r\n");
      out.write("                    input.value = parseInt(input.value) - 1;\r\n");
      out.write("                    var row = this.closest(\".cart-item\");\r\n");
      out.write("                    updateItemTotal(row);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    \r\n");
      out.write("        //  calculate subtotal\r\n");
      out.write("        function calculateSubtotal() {\r\n");
      out.write("            var subtotal = parseFloat(document.querySelector(\"#cart-total\").innerText);\r\n");
      out.write("            return subtotal;\r\n");
      out.write("        }\r\n");
      out.write("    \r\n");
      out.write("       //  update checkout box\r\n");
      out.write("    function updateCheckoutBox() {\r\n");
      out.write("        document.querySelector(\"#subtotal\").innerText = calculateSubtotal().toFixed(2);\r\n");
      out.write("        calculateGrandTotal(); \r\n");
      out.write("      \r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("       //-------------\r\n");
      out.write("        updateCheckoutBox();\r\n");
      out.write("    });\r\n");
      out.write("    var removeButtons = document.querySelectorAll(\".remove-item\");\r\n");
      out.write("        removeButtons.forEach(function(button) {\r\n");
      out.write("            button.addEventListener(\"click\", function() {\r\n");
      out.write("                var row = this.closest(\".cart-item\");\r\n");
      out.write("                row.remove();\r\n");
      out.write("                updateCartTotal();\r\n");
      out.write("                updateCheckoutBox();\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    \r\n");
      out.write("    function calculateGrandTotal() {\r\n");
      out.write("        var subtotal = parseFloat(document.querySelector(\"#cart-total\").innerText);\r\n");
      out.write("        var deliveryCharges = parseFloat(document.getElementById(\"delivery-charges\").innerText);\r\n");
      out.write("        var grandTotal = subtotal + deliveryCharges;\r\n");
      out.write("        document.getElementById(\"grand-total\").innerText = grandTotal.toFixed(2);\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
      out.write("    <div>\r\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("  \r\n");
      out.write("    </div>\r\n");
      out.write("    </body>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
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
