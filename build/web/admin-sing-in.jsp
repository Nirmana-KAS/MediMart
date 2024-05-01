<%-- 
    Document   : admin-sing-in
    Created on : May 1, 2024, 12:35:09 PM
    Author     : dines
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
        <link rel="stylesheet" href="css/admin-sing-in.css">
    </head>
        <body>
            
        <div class="background"></div>

            <div class="container">
            <div class="image01">
                <img src="images/admin/signin.jpg"style="position:relative;width: 550px; height: 550px; z-index: -1;">
            </div>
                <div class="content">
                    <h2 class="logo">MediMart</h2>
                </div>
                
                <div class="logreg-box">
                    <div class="form-box login">
                        <form action="#">
                            <h2>Admin Login</h2>
    
                            <div class="input-box">
                                <span class="icon"><i class='bx bxs-envelope' ></i></span>
                                <input type="email" required>
                                <label>Email</label>
                            </div>
    
                            <div class="input-box">
                                <span class="icon"><i class='bx bxs-lock-alt'></i></span>
                                <input type="password" required>
                                <label>Password</label>
                            </div>
    
                            <div class="remember-forget">
                                <label><input type="checkbox">Remember me</label>
                                <a href="#">Forget Password</a>
                            </div>
    
                            <button type="submit" class="btn">Sign In</button>
    
                            <div class="login-register">
                                <p>Don't have an account?<a href="sign up.jsp" class="register-link">Sign Up</a></p>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        
    </body>
</html>
