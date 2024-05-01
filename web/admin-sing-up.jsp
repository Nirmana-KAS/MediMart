<%-- 
    Document   : admin-sing-up
    Created on : May 1, 2024, 12:35:53 PM
    Author     : dines
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
        <link rel="stylesheet" href="css/admin-sing-up.css">
    </head>
    <body>
            <div class="background"></div>
            <div class="container">
            <div class="image01">
                <img src="images/admin/signup.jpg"style="position:relative;width: 600px; height: 600px; z-index: -1;">
            </div>
                <div class="content">
                    <h2 class="logo">MediMart</h2>
                    
                    
                </div>
                
                <div class="logreg-box">
                    <div class="form-box login">
                        <form action="loginServlet" method="POST" >
                            <h2>Admin Sign Up</h2>
                            
                            <div class="input-box">
                                <span class="icon"><i class='bx bxs-user'></i></span>
                                <input type="text" name="aname" required>
                                <label>Username</label>
                            </div>
    
                            <div class="input-box">
                                <span class="icon"><i class='bx bxs-envelope' ></i></span>
                                <input type="email" name="aemail" required>
                                <label>Email</label>
                            </div>
    
                            <div class="input-box">
                                <span class="icon"><i class='bx bxs-lock-alt'></i></span>
                                <input type="password" name="apsw" required>
                                <label>Password</label>
                            </div>
                            
                            <div class="input-box">
                                <span class="icon"><i class='bx bxs-lock-alt'></i></span>
                                <input type="password" name="arpsw"  required>
                                <label>Repeat Password</label>
                            </div>
                            
                            <div class="input-box">
                                <span class="icon"><i class='bx bxs-phone'></i></span>
                                <input type="tel" name="acontact" required>
                                <label>Contact Number</label>
                            </div>
    
                            <div class="remember-forget">
                                <label><input type="checkbox">Accept Terms and Conditions</label>
                                
                            </div>
    
                            <button type="submit" class="btn">Sign In</button>
    
                            
                        </form>
                    </div>
                </div>
            </div>
        </body>
</html>
