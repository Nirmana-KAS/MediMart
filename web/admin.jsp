<%-- 
    Document   : admiin
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
        <link rel="stylesheet" href="css/admin.css">
    </head>
    <body>
        <div class="container">
            <header class="header">
              <h1>Admin Panel</h1>
            </header>
            <nav class="sidebar">
              <ul>
                <li><a href="#">Products</a></li>
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
                <form id="product-form">
                  <label for="name">Name:</label>
                  <input type="text" id="name" name="name" required>
                  <label for="price">Price:</label>
                  <input type="number" id="price" name="price" required>
                  <button type="submit">Add Product</button>
                </form>
              </div>
            </main>
          </div>
    </body>
</html>
