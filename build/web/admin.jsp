<%-- 
    Document   : admin
    Created on : Mar 30, 2024, 11:09:51 AM
    Author     : dines
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin Panel</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/admin.css">
    </head>
    <body>
        <div class="container">
            <header class="header">
              <h1>Admin Panel</h1>
            </header>
            <nav class="sidebar">
              <ul>
                <li><a href="shop.jsp">Products</a></li>
                <li><a href="#">Users</a></li>
                <li><a href="#">Settings</a></li>
              </ul>
            </nav>
            <main class="content">
              <h2>Products</h2>
              <div class="product-list">
                <table>
                  <thead>
                    <tr>
                      <th>ID</th>
                      <th>Name</th>
                      <th>Price</th>
                      <th>Action</th>
                    </tr>
                  </thead>
                  <tbody>
                    </tbody>
                </table>
              </div>
              <div class="product-form">
                <h3>Add Product</h3>
                <form action="productAddServlet" method="POST" id="product-form">
                  <label for="pid">Product ID:</label>
                  <input type="text" name="pid" required>
                  
                  <label for="pname">Name</label>
                  <input type="text"  name="pname" required>
                  
                  <label for="pprice">Price:</label>
                  <input type="number" name="pprice" required>
                  
                  <label for="pdescription">Description:</label>
                  <input type="text" name="pdescription" required>
                  
                  <label for="pquantity">Quantity:</label>
                  <input type="number" name="pquantity" required>
                  
                  <label for="ptype">Type:</label>
                  <input type="text" name="ptype" required>
                  
                  <label for="pbrand">Brand:</label>
                  <input type="text" name="pbrand" required>
                  
                  <button type="submit">Add Product</button>
                </form>
              </div>
              <div class="product-form">
                <h3>Delete Product</h3>
                <form action="productAddServlet" method="POST" id="product-form">
                  <label for="pid">Product ID:</label>
                  <input type="text" name="pid" required> 
                  
                  <button type="submit">Delete Product</button>
                </form>
              </div>
              <div class="product-form">
                <h3>Edit Product</h3>
                <form action="productUpdateServlet" method="POST" id="product-form">
                 <label for="pid">Product ID:</label>
                  <input type="text" name="pid" required>
                  
                  <label for="pname">Name</label>
                  <input type="text"  name="pname" required>
                  
                  <label for="pprice">Price:</label>
                  <input type="number" name="pprice" required>
                  
                  <label for="pdescription">Description:</label>
                  <input type="text" name="pdescription" required>
                  
                  <label for="pquantity">Quantity:</label>
                  <input type="number" name="pquantity" required>
                  
                  <label for="ptype">Type:</label>
                  <input type="text" name="ptype" required>
                  
                  <label for="pbrand">Brand:</label>
                  <input type="text" name="pbrand" required>
                  
                  <button type="submit">Edit Product</button>
                </form>
              </div>
            </main>
          </div>
    </body>
</html>
