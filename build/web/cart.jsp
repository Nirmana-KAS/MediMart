<%-- 
    Document   : cart
    Created on : Mar 30, 2024, 11:10:31 AM
    Author     : dines
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/cart.css">
    </head>
    <body>
        <div>
            <jsp:include page="Header.jsp" /> 
        </div>
        <div class="container">
            <h1>Your Cart</h1>
                        <!-- Cart items will be dynamically added here -->
    
    <div class="cart-table">
        <div class="cart-header">
            <div class="column">Product Image</div>
            <div class="column">Product Name</div>
            <div class="column">Price</div>
            <div class="column">Quantity</div>
            <div class="column">Total</div>
        </div>
        <div class="cart-item">
            <div class="column"><img src="image/1.jpg" alt="Product 1"></div>
            <div class="column">Product 1</div>
            <div class="column price">10.00</div>
            <div class="column quantity">
                <button class="decrease">-</button>
                <input type="number" value="1">
                <button class="increase">+</button>
            </div>
            <div class="column total">10.00</div>
        </div>
        <div class="cart-item">
            <div class="column"><img src="image/2.jpg" alt="Product 2"></div>
            <div class="column">Product 2</div>
            <div class="column price">15.00</div>
            <div class="column quantity">
                <button class="decrease">-</button>
                <input type="number" value="1">
                <button class="increase">+</button>
            </div>
            <div class="column total">15.00</div>
        </div>
        <!-- Add more cart items as needed -->
    </div>
    <div>Total: <span id="cart-total">25.00</span></div>
    
    
            </div>
        </div>
    
    <script>
    document.addEventListener("DOMContentLoaded", function() {
        // Function to calculate total price for a single item
        function calculateItemTotal(price, quantity) {
            return price * quantity;
        }
    
        // Function to update total price for a single item
        function updateItemTotal(row) {
            var price = parseFloat(row.querySelector(".price").innerText);
            var quantity = parseInt(row.querySelector(".quantity input").value);
            var total = calculateItemTotal(price, quantity);
            row.querySelector(".total").innerText = total.toFixed(2);
        }
    
        // Function to update total price for all items in the cart
        function updateCartTotal() {
            var cartItems = document.querySelectorAll(".cart-item");
            var totalPrice = 0;
            cartItems.forEach(function(item) {
                totalPrice += parseFloat(item.querySelector(".total").innerText);
            });
            document.querySelector("#cart-total").innerText = totalPrice.toFixed(2);
        }
    
        // Event listener for quantity input changes
        var quantityInputs = document.querySelectorAll(".quantity input");
        quantityInputs.forEach(function(input) {
            input.addEventListener("change", function() {
                var row = this.closest(".cart-item");
                updateItemTotal(row);
                updateCartTotal();
            });
        });
    
        // Event listeners for increase and decrease buttons
        var increaseButtons = document.querySelectorAll(".quantity .increase");
        increaseButtons.forEach(function(button) {
            button.addEventListener("click", function() {
                var input = this.parentNode.querySelector("input");
                input.value = parseInt(input.value) + 1;
                var row = this.closest(".cart-item");
                updateItemTotal(row);
                updateCartTotal();
            });
        });
    
        var decreaseButtons = document.querySelectorAll(".quantity .decrease");
        decreaseButtons.forEach(function(button) {
            button.addEventListener("click", function() {
                var input = this.parentNode.querySelector("input");
                if (parseInt(input.value) > 1) {
                    input.value = parseInt(input.value) - 1;
                    var row = this.closest(".cart-item");
                    updateItemTotal(row);
                    updateCartTotal();
                }
            });
        });
    });
    
    </script>
    <div>
       <jsp:include page="footer.jsp" />  
    </div>
    </body>
    
</html>
