<%-- 
    Document   : contact-us
    Created on : Mar 30, 2024, 11:09:51 AM
    Author     : dines
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Contact-Us</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/contact-us.css">
    </head>
    <body>
        <div>
            <jsp:include page="Header.jsp" /> 
        </div>
        <div class="container0">
            <div class="container2">
                <img src="images/vector1.png" alt="Vector 1" class="vector vector-1">
                <img src="images/vector2.png" alt="Vector 2" class="vector vector-2">
                <img src="images/vector3.png" alt="Vector 3" class="vector vector-3">
                <img src="images/vector4.png" alt="Vector 4" class="vector vector-4">
                <img src="images/vector5.png" alt="Vector 5" class="vector vector-5">
                <img src="images/vector6.png" alt="Vector 6" class="vector vector-6">
                <img src="images/vector7.png" alt="Vector 7" class="vector vector-7">
                <img src="images/vector8.png" alt="Vector 8" class="vector vector-8"> 
            </div>
        <div class="tableform" >
            <table >
                <tr>
                    <td class="image-column">
                        <!-- Your large image goes here -->
                        <img src="images/con 02.png" alt="Large Image" height="100%" width=100%>
                    </td>
                    <td class="form-column">
                        <form action="ContactServlet" method="post">
                            <h2>Get in Touch</h2>
                            <input type="text" name="name" placeholder="Your Name" required>
                            <input type="email" name="email" placeholder="Email Id" required>
                            <input type="text" name="phone" placeholder="Phone No." required>
                            <textarea name="message" rows="4" placeholder="How can we help you ?"></textarea>
                            <button type="submit" name="submit">Send</button> 
                        </form>
                    </td>
                </tr>
            </table>
        </div>
        </div>
    <div>
       <jsp:include page="footer.jsp" />  
    </div>       
    </body>
</html>
