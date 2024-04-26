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
