<%-- 
    Document   : sign up
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
        <link rel="stylesheet" href="css/sign-up.css">
    </head>
    
        
        <body>
        
            <header class="header">
                
            </header>
            
            <div class="background"></div>
            <div class="container">
            <div class="image01">
                <img src="images/login-and-sign up/5670.jpg"style="position:relative;width: 800px; height: 580px; z-index: -1;">
            </div>
                <div class="content">
                    <h2 class="logo">MediMart</h2>
                    
                    
                </div>
                
                <div class="logreg-box">
                    <div class="form-box login">
                        <form action="loginServlet" method="POST" >
                            <h2>Sign Up</h2>
                            
                            <div class="input-box">
                                <span class="icon"><i class='bx bxs-user'></i></span>
                                <input type="text" name="uname" required>
                                <label>Username</label>
                            </div>
    
                            <div class="input-box">
                                <span class="icon"><i class='bx bxs-envelope' ></i></span>
                                <input type="email" name="uemail" required>
                                <label>Email</label>
                            </div>
    
                            <div class="input-box">
                                <span class="icon"><i class='bx bxs-lock-alt'></i></span>
                                <input type="password" name="upsw" required>
                                <label>Password</label>
                            </div>
                            
                            <div class="input-box">
                                <span class="icon"><i class='bx bxs-lock-alt'></i></span>
                                <input type="password" name="urpsw"  required>
                                <label>Repeat Password</label>
                            </div>
                            
                            <div class="input-box">
                                <span class="icon"><i class='bx bxs-phone'></i></span>
                                <input type="tel" name="ucontact" required>
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
