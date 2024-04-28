<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/contact-us.css">
    </head>
    <body>
        <div class="container">
            <div class="container2">
                <img src="vector1.png" alt="Vector 1" class="vector vector-1">
                <img src="vector2.png" alt="Vector 2" class="vector vector-2">
                <img src="vector3.png" alt="Vector 3" class="vector vector-3">
                <img src="vector1.png" alt="Vector 4" class="vector vector-4">
                <img src="vector2.png" alt="Vector 5" class="vector vector-5">
                <img src="vector3.png" alt="Vector 6" class="vector vector-6">
                <img src="vector3.png" alt="Vector 7" class="vector vector-7">
                <img src="vector3.png" alt="Vector 8" class="vector vector-8"> 
            </div>

            <form action="ContactServlet" method="post">
                <h2>Get in Touch</h2>
                <input type="text" name="name" placeholder="Your Name" required>
                <input type="email" name="email" placeholder="Email Id" required>
                <input type="text" name="phone" placeholder="Phone No." required>
                <textarea name="message" rows="4" placeholder="How can we help you ?"></textarea>
                <button type="submit" name="submit">Send</button>  
            </form>
        </div> 
    </body>
</html>
