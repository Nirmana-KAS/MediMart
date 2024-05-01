<%-- 
    Document   : login
    Created on : Mar 30, 2024, 11:09:51 AM
    Author     : dines
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/login.css">
    </head>
    <body>
            
        <div class="background"></div>

            <div class="container">
            <div class="image01">
                <img src="images/login-and-sign up/5675.png"style="position:relative;width: 800px; height: 550px; z-index: -1;">
            </div>
                <div class="content">
                    <h2 class="logo">MediMart</h2>
                </div>
                
                <div class="logreg-box">
                    <div class="form-box login">
                        <form action="checkLoginInfoServlet" method="POST">
                            <h2>Sign In</h2>
    
                            <div class="input-box">
                                <span class="icon"><i class='bx bxs-envelope' ></i></span>
                                <input type="email" name="lemail" required>
                                <label>Email</label>
                            </div>
    
                            <div class="input-box">
                                <span class="icon"><i class='bx bxs-lock-alt'></i></span>
                                <input type="password" name="lpsw" required>
                                <label>Password</label>
                            </div>
    
                            <div class="remember-forget">
                                <label><input type="checkbox">Remember me</label>
                                <a href="#">Forget Password</a>
                            </div>
    
                            <button type="submit" class="btn">Sign In</button>
    
                            <div class="login-register">
                                <p>Don't have an account ?<a href="sign up.jsp" class="register-link"> Sign Up</a></p>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        
    </body>
</html>
