<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MediMart Checkout</title>
    <link rel="stylesheet" type="text/css" href="checkout.css">
</head>
<body background="images/checkout1.jpg">
    <div class="container">
        <div class="order-summary">
          <h2>Order Summary</h2>
          <p>Item Price: Rs:
            <span id="itemPrice">0.00</span></p>
             <p>Delivery Fee: Rs:
             <span id="deliveryFee">0.00</span></p>
             <p>Discount: Rs0.00</p>
        <hr>
            <p>Total: Rs:
            <span id="total">0.00</span></p>
</div>
<div class="checkout-form">
  <h2>Checkout</h2>
  <form id="checkoutForm">
    <input type="text" placeholder="Name" required>
    <input type="email" placeholder="Email" required>
    <input type="tel" placeholder="Telephone Number" required>
    <textarea placeholder="Shipping Address" required></textarea>
    <select id="deliveryMethod">
      <option value="standard">Standard Delivery</option>
      <option value="express">Express Delivery</option>
    </select>
    <select id="paymentMethod">
      <option value="credit">Credit Card</option>
      <option value="cashondelivery">Cash on Delivery</option>
      <option value="paypal">PayPal</option>
    </select>
    <button type="submit">Place Order</button>
  </form>
</div>
</div>
<script>
document.addEventListener('DOMContentLoaded', function() {
// Calculate total
var itemPrice = 1000.00; // Sample item price
var deliveryFee = 350.00; // Sample delivery fee
var total = itemPrice + deliveryFee;
document.getElementById('itemPrice').textContent = itemPrice.toFixed(2);
document.getElementById('deliveryFee').textContent = deliveryFee.toFixed(2);
document.getElementById('total').textContent = total.toFixed(2);
document.getElementById('checkoutForm').addEventListener('submit', function(event) {   // Handle form submission
event.preventDefault();
alert('Payment successful! Your order has been placed.');  // Simulate payment success
});
});
</script>
</body>
</html>