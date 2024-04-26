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
     const carousel = document.querySelector('.carousel');
        const images = document.querySelector('.carousel-images');

        let counter = 1;
        const size = carousel.clientWidth;

        function slide() {
            if (counter >= images.children.length) {
                counter = 0;
            }
            images.style.transition = 'transform 0.5s ease-in-out';
            images.style.transform = `translateX(-${counter * size}px)`;
            counter++;
        }

        setInterval(slide, 3000);


        document.getElementById('sort').addEventListener('change', function() {
        const sortBy = this.value;
        let sortedProducts = [];

        switch (sortBy) {
            case 'price_low_to_high':
                sortedProducts = products.slice().sort((a, b) => a.price - b.price);
                break;
            case 'price_high_to_low':
                sortedProducts = products.slice().sort((a, b) => b.price - a.price);
                break;
            case 'name_a_to_z':
                sortedProducts = products.slice().sort((a, b) => a.name.localeCompare(b.name));
                break;
            case 'name_z_to_a':
                sortedProducts = products.slice().sort((a, b) => b.name.localeCompare(a.name));
                break;
            default:
                sortedProducts = products.slice();
                break;
        }

    </script>