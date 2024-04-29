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
         <div class="column"> </div>
        
        </div>
        <div class="cart-item">
            <div class="column"><img src="image/1.jpg" alt="BRILINTA 90MG TAB 56S"></div>
            <div class="column" id="set">BRILINTA 90MG TAB 56S</div>
            <div class="column price" id="set">302.54 </div>
            <div class="column quantity">
                <button class="decrease">-</button>
                <input type="number" value="1">
                <button class="increase">+</button>
            </div>
            <div class="column total" id="set">302.54</div>
    <div class="column"><button class="remove-item">Remove</button></div> <!-- New column for remove button -->
        </div>
        <div class="cart-item">
            <div class="column"><img src="image/2.jpg" alt="PLAVIX 75MG TABS 28 S"></div>
            <div class="column" id="set">PLAVIX 75MG TABS 28 S</div>
            <div class="column price" id="set">34.72 </div>
            <div class="column quantity">
                <button class="decrease">-</button>
                <input type="number" value="1">
                <button class="increase">+</button>
            </div>
            <div class="column total"id="set" >34.72</div>
    <div class="column"><button class="remove-item">Remove</button></div> <!-- New column for remove button -->
        </div>
    
    <div class="cart-item">
            <div class="column"><img src="image/3.png" alt="CLOPIVAS 75MG"></div>
            <div class="column" id="set">CLOPIVAS 75MG</div>
            <div class="column price" id="set">15.87</div>
            <div class="column quantity">
                <button class="decrease">-</button>
                <input type="number" value="1">
                <button class="increase">+</button>
            </div>
            <div class="column total" id="set">15.87</div>
    <div class="column"><button class="remove-item">Remove</button></div> <!-- New column for remove button -->
        </div>
    
    
        <!-- Add more cart items as needed -->
    </div>
    <div> <span id="cart-total">00.00</span></div>
    
    
            </div>
        </div>
    
    <div class="checkout-box">
        <h2>Checkout</h2>
        <div class="subtotal">
            Subtotal: <span id="subtotal"></span>
        </div>
        <div class="delivery-charges">
            Delivery Charges: <span id="delivery-charges">250.00</span>
        </div>
        <div class="coupon">
            <label for="coupon-input">Enter Coupon:</label>
            <input type="text" id="coupon-input">
            <button id="apply-coupon">Apply</button>
        </div>
        <div class="grand-total">
            Grand Total: <span id="grand-total"></span>
        </div>
        <button id="checkout-button">Checkout</button>
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
            updateCartTotal();
            updateCheckoutBox(); // Update checkout box after updating item total
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
                }
            });
        });
    
        // Function to calculate subtotal
        function calculateSubtotal() {
            var subtotal = parseFloat(document.querySelector("#cart-total").innerText);
            return subtotal;
        }
    
       // Function to update checkout box
    function updateCheckoutBox() {
        document.querySelector("#subtotal").innerText = calculateSubtotal().toFixed(2);
        calculateGrandTotal(); // Call the function to calculate grand total
        // Add other necessary calculations here
    }
    
    
        // Initial update of checkout box
        updateCheckoutBox();
    });
    var removeButtons = document.querySelectorAll(".remove-item");
        removeButtons.forEach(function(button) {
            button.addEventListener("click", function() {
                var row = this.closest(".cart-item");
                row.remove();
                updateCartTotal();
                updateCheckoutBox();
            });
        });
    
   
    </script>
    </body>
    
    
    
</html>
