<%-- 
    Document   : Header
    Created on : Mar 30, 2024, 11:09:51 AM
    Author     : dines
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>MediMart-Header-Section</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="icon" href="images/header-and-footer/MediMartLogoF.png">
        <link rel="stylesheet" href="css/header.css">
    </head>
    <body>
        <div class="container">
            <!-- Header section Start -->
                <div class="header">
                    <!-- Topbar start -->
                        <div class="topbar">
                            <div class="left-side">
                                <a href="http://"><img class="logo24-7" src="images/header-and-footer/24_7.png" alt="logo24-7"> Online Service</a>
                                <a href="http://"><img class="openhours-logo" src="images/header-and-footer/openhours.png" alt="openhours-logo"> Open Hours: Mon to Sat 8.00 A.M. - 9.00 P.M. </a>
                                <a href="http://"><img class="location-logo" src="images/header-and-footer/location.png" alt="location-logo"> NO:121/2, High level Road, Homagama </a>
                            </div>
                            <div class="right-side">
                                <a href="http://"><img class="hotline-logo" src="images/header-and-footer/hotline.png" alt="hotline-logo"> HOTLINE: +9411 222 333 444 </a>
                                <a href="http://"><img class="email-logo" src="images/header-and-footer/email.png" alt="email-logo"> medimartonlinesl@gmail.com </a>
                                <div class="social-links">
                                    <a href="http://" class="follow">FOLLOW ON</a>
                                    <a href="http://"><img class="facebook-logo" src="images/header-and-footer/facebook.png" alt="facebook-logo"> </a>
                                    <a href="http://"><img class="messenger-logo" src="images/header-and-footer/messenger.png" alt="messenger-logo"> </a>
                                    <a href="http://"><img class="whatsapp-logo" src="images/header-and-footer/whatsapp.png" alt="whatsapp-logo"> </a>
                                </div>
                            </div>
                        </div>
                    <!-- Topbar end -->
                    <!-- Logo area start -->
                    <div class="logo-area" style="display: flex; align-items: center; align-content: space-between; width: 100%; justify-content: space-around;">
                        <div class="logo-area-left">
                            <marquee direction="left" behavior="scroll" loop="0" scrollamount="5" style="width: 800px;">
                                <img class="shopping-cart" src="images/header-and-footer/ShoppingCartBlack.png" alt="shopping-cart" style="margin-right: 100px;">
                                <img class="shopping-cart" src="images/header-and-footer/ShoppingCartBlack.png" alt="shopping-cart" style="margin-right: 100px;">
                                <img class="shopping-cart" src="images/header-and-footer/ShoppingCartBlack.png" alt="shopping-cart" style="margin-right: 100px;">
                                <img class="shopping-cart" src="images/header-and-footer/ShoppingCartBlack.png" alt="shopping-cart" style="margin-right: 100px;">
                                <img class="shopping-cart" src="images/header-and-footer/ShoppingCartBlack.png" alt="shopping-cart" style="margin-right: 100px;">
                                <img class="shopping-cart" src="images/header-and-footer/ShoppingCartBlack.png" alt="shopping-cart" style="margin-right: 100px;">
                                <img class="shopping-cart" src="images/header-and-footer/ShoppingCartBlack.png" alt="shopping-cart" style="margin-right: 100px;">
                                <img class="shopping-cart" src="images/header-and-footer/ShoppingCartBlack.png" alt="shopping-cart" style="margin-right: 100px;">
                            </marquee>
                        </div>
                        <center>
                            <p>
                                <img class="MainLogo" src="images/header-and-footer/MediMartLogoF.png" alt="MainLogo">
                            </p>
                        </center>
                        <div class="logo-area-right">
                            <marquee direction="right" behavior="scroll" loop="0" scrollamount="5" style="width: 800px;">
                                <img class="shopping-cart" src="images/header-and-footer/ShoppingCartBlack.png" alt="shopping-cart" style="margin-left: 100px;">
                                <img class="shopping-cart" src="images/header-and-footer/ShoppingCartBlack.png" alt="shopping-cart" style="margin-left: 100px;">
                                <img class="shopping-cart" src="images/header-and-footer/ShoppingCartBlack.png" alt="shopping-cart" style="margin-left: 100px;">
                                <img class="shopping-cart" src="images/header-and-footer/ShoppingCartBlack.png" alt="shopping-cart" style="margin-left: 100px;">
                                <img class="shopping-cart" src="images/header-and-footer/ShoppingCartBlack.png" alt="shopping-cart" style="margin-left: 100px;">
                                <img class="shopping-cart" src="images/header-and-footer/ShoppingCartBlack.png" alt="shopping-cart" style="margin-left: 100px;">
                                <img class="shopping-cart" src="images/header-and-footer/ShoppingCartBlack.png" alt="shopping-cart" style="margin-left: 100px;">
                                <img class="shopping-cart" src="images/header-and-footer/ShoppingCartBlack.png" alt="shopping-cart" style="margin-left: 100px;">
                            </marquee>
                        </div>
                    </div>
                    <!-- Logo area end -->
                    <!-- Navbar start -->
                        <div class="topnav">
                            <!-- Centered area on Navbar -->
                                <div class="topnav-centered">
                                    <div class="search-container">
                                        <form action="/action_page.php">
                                            <input type="text" placeholder="Search.." name="search">
                                            <button type="submit"><i class="fa fa-search"></i></button>
                                        </form>
                                    </div>
                                </div>
                            <!-- Left area on Navbar -->
                                <div class="topnav-left">
                                    <a href="index.jsp" class="active">Home</a>
                                    <a href="shop.jsp">Shop</a>
                                    <div class="dropdown">
                                        <button class="dropbtn">Products
                                            <i class="fa fa-caret-down"></i>
                                        </button>
                                        <div class="dropdown-content">
                                            <div class="header">
                                                <h2>All Categary</h2>
                                            </div>   
                                            <div class="row">
                                                <div class="column">
                                                    <h3>Category 1</h3>
                                                    <a href="#">Link 1</a>
                                                    <a href="#">Link 2</a>
                                                    <a href="#">Link 3</a>
                                                </div>
                                                <div class="column">
                                                    <h3>Category 2</h3>
                                                    <a href="#">Link 1</a>
                                                    <a href="#">Link 2</a>
                                                    <a href="#">Link 3</a>
                                                </div>
                                                <div class="column">
                                                    <h3>Category 3</h3>
                                                    <a href="#">Link 1</a>
                                                    <a href="#">Link 2</a>
                                                    <a href="#">Link 3</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div> 
                                    <div class="dropdown">
                                        <button class="dropbtn">Brands 
                                            <i class="fa fa-caret-down"></i>
                                        </button>
                                        <div class="dropdown-content">
                                            <div class="header">
                                                <h2>Brand Menu</h2>
                                            </div>   
                                            <div class="row">
                                                <div class="column">
                                                    <h3>Category 1</h3>
                                                    <a href="#">Link 1</a>
                                                    <a href="#">Link 2</a>
                                                    <a href="#">Link 3</a>
                                                </div>
                                                <div class="column">
                                                    <h3>Category 2</h3>
                                                    <a href="#">Link 1</a>
                                                    <a href="#">Link 2</a>
                                                    <a href="#">Link 3</a>
                                                </div>
                                                <div class="column">
                                                    <h3>Category 3</h3>
                                                    <a href="#">Link 1</a>
                                                    <a href="#">Link 2</a>
                                                    <a href="#">Link 3</a>
                                                 </div>
                                            </div>
                                        </div>
                                    </div> 
                                    <a href="about-us.jsp">About Us</a>
                                    <a href="contact-us.jsp">Contact</a>
                                </div>
                            <!-- Right area on Navbar -->
                                <div class="topnav-right">
                                    <div class="shoppingcart-link">
                                        <a href="cart.jsp" class=""><img class="shopping-cart" src="images/header-and-footer/ShoppingCartBlack.png" alt="shopping-cart"></a>
                                    </div>
                                    <div class="Sign-links">
                                        <a href="login.jsp" class="active">SIGN IN / UP</a>
                                    </div>
                                </div>
                        </div>
                    <!-- Navbar end -->
                </div>
            <!-- Header section end -->
        </div>
    </body>
</html>
 