<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hero Section Example</title>
    <style>
      /* CSS styles for the hero section */
      .hero-section {
        position: relative;
        height: 800px;
        background-image: url('b1.jpg'); 
        background-size: cover;
        background-position: center;
        color:black;
        text-align:Center;
        display: flex;
        justify-content:right;
        align-items:center;
      }
    
      .hero-section h1 {
        font-size: 3em;
        margin-bottom: 20px;
        color:blue;
      }
    
      .hero-section p {
        font-size: 1.5em;
        margin-bottom: 30px;
      }
      .custom-button {
        background-color:blue;
        border: none;
        color:aliceblue;
        padding: 15px 32px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
        font-size: 16px;
        margin: 4px 2px;
        cursor:pointer;
        border-radius: 8px;
      }
    </style>
    </head>
    <body>
    
    <!-- Hero Section -->
    <section class="hero-section">
      <div class="hero-content">
        <h1>Welcome to MediMart</h1>
        <p>"Welcome to MediMart - Your Trusted Online Pharmacy Destination! Explore<br>
            a wide range of high-quality medications, health products, and wellness<br> 
            essentials, all conveniently available at your fingertips. With our seamless<br> 
            shopping experience, expert guidance, and reliable delivery, your journey to <br>
            better health begins here.
            <br><b>Start shopping with confidence at MediMart today!"</b></p>
            <button class="custom-button">Shop Now</button>
      </div>
    </section>    
    </body>
</html>
