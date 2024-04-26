<%-- 
    Document   : shop
    Created on : Mar 30, 2024, 11:09:51 AM
    Author     : dines
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/shop.css">
    </head>
    <body>
  

        <table id="table">
           <thead>
        <tr>
          <th colspan="4">
            <div class="carousel">
                <div class="carousel-images">
                    <img src="C:\Users\sakun\OneDrive\Desktop\New folder\1.jpg" alt="Image 1">
                    <img src="image2.jpg" alt="Image 2">
                    <img src="image3.jpg" alt="Image 3">
                </div>
            </div>
            <!-- Container for sort by, filter section, and quantity controls -->
            <div class="options-container">
                <!-- Sort by list -->
                <div class="sort-by">
                    <label for="sort">Sort By:</label>
                    <select name="sort" id="sort">
                        <option value="price_low_to_high">Price Low to High</option>
                        <option value="price_high_to_low">Price High to Low</option>
                        <option value="name_a_to_z">Name A to Z</option>
                        <option value="name_z_to_a">Name Z to A</option>
                    </select>
                </div>
        
                <!-- Filter section -->
                <div class="filter-section">
                    <h3>Filter By:</h3>
                    <label for="filter1" class="filter-checkbox"><input type="checkbox" id="filter1"> Option 1</label>
                    <label for="filter2" class="filter-checkbox"><input type="checkbox" id="filter2"> Option 2</label>
                    <label for="filter3" class="filter-checkbox"><input type="checkbox" id="filter3"> Option 3</label>
                    <!-- Add more checkboxes as needed -->
                </div>
        
          </th>
        </tr>
            <tbody>
                <tr>
                  <td rowspan="3" id="leftbox">
                    <div id="a">
                      <h5> Sort By</h5>
                      <select name="sory by" id="sort">
                         <option>Default</option>
                         <option>price law to high</option>
                         <option></option>
                         <option></option>
                       </select>
                    </div>
                       
                    <div id="filterBox">
                      <h2>Product Catalog</h2>
                        <label>
                            <input type="checkbox" class="filter-checkbox" value="category1"> Category 1<br>
                        </label>
                        <label>
                            <input type="checkbox" class="filter-checkbox" value="category1"> Category 1<br>
                        </label>
                        <label>
                            <input type="checkbox" class="filter-checkbox" value="category1"> Category 1<br>
                        </label>
                    </div>
                  </td>
                    
                        <td><div id="card"><img id="img" src="https://unionchemistspharmacy.lk/wp-content/uploads/2023/09/cosmed_urun_750x1000_24-300x300.jpg"/><div id="medname">Vitemin C</div><div id="medprice">Rs.24545.00</div><div id="center"><input type="submit" value="Add to Cart" id="addcart" /></div></div></td>
                        <td><div id="card"><img id="img" src="https://unionchemistspharmacy.lk/wp-content/uploads/2023/09/cosmed_urun_750x1000_24-300x300.jpg"/><div id="medname">Vitemin C</div><div id="medprice">Rs.24545.00</div><div id="center"><input type="submit" value="Add to Cart" id="addcart" /></div></div></td> 
                        <td><div id="card"><img id="img" src="https://unionchemistspharmacy.lk/wp-content/uploads/2023/09/cosmed_urun_750x1000_24-300x300.jpg"/><div id="medname">Vitemin C</div><div id="medprice">Rs.24545.00</div><div id="center"><input type="submit" value="Add to Cart" id="addcart" /></div></div></td>
                    </tr>
    
                
                <tr>
                    
                    
                        <td><div id="card"><img id="img" src="https://unionchemistspharmacy.lk/wp-content/uploads/2023/09/cosmed_urun_750x1000_24-300x300.jpg"/><div id="medname">Vitemin C</div><div id="medprice">Rs.24545.00</div><div id="center"><input type="submit" value="Add to Cart" id="addcart" /></div></div></td>
                        <td><div id="card"><img id="img" src="https://unionchemistspharmacy.lk/wp-content/uploads/2023/09/cosmed_urun_750x1000_24-300x300.jpg"/><div id="medname">Vitemin C</div><div id="medprice">Rs.24545.00</div><div id="center"><input type="submit" value="Add to Cart" id="addcart" /></div></div></td> 
                        <td><div id="card"><img id="img" src="https://unionchemistspharmacy.lk/wp-content/uploads/2023/09/cosmed_urun_750x1000_24-300x300.jpg"/><div id="medname">Vitemin C</div><div id="medprice">Rs.24545.00</div><div id="center"><input type="submit" value="Add to Cart" id="addcart" /></div></div></td>
                  
    
                </tr>
                <tr>
                    
                   
                        <td><div id="card"><img id="img" src="https://unionchemistspharmacy.lk/wp-content/uploads/2023/09/cosmed_urun_750x1000_24-300x300.jpg"/><div id="medname">Vitemin C</div><div id="medprice">Rs.24545.00</div><div id="center"><input type="submit" value="Add to Cart" id="addcart" /></div></div></td>
                        <td><div id="card"><img id="img" src="https://unionchemistspharmacy.lk/wp-content/uploads/2023/09/cosmed_urun_750x1000_24-300x300.jpg"/><div id="medname">Vitemin C</div><div id="medprice">Rs.24545.00</div><div id="center"><input type="submit" value="Add to Cart" id="addcart" /></div></div></td> 
                        <td><div id="card"><img id="img" src="https://unionchemistspharmacy.lk/wp-content/uploads/2023/09/cosmed_urun_750x1000_24-300x300.jpg"/><div id="medname">Vitemin C</div><div id="medprice">Rs.24545.00</div><div id="center"><input type="submit" value="Add to Cart" id="addcart" /></div></div></td>
                  
                </tr>
            </tbody>
        </table>
       <script>
      $(document).ready(function(){
        $('.slick-carousel').slick({
          autoplay: true,
          autoplaySpeed: 2000, // Adjust as needed
          arrows: true, // Enable navigation arrows
          dots: true // Enable navigation dots
        });
      });
    </script>