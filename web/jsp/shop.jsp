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
        <div id="filterBox">
            <h2>Category</h2>
            <div id="catetorylist">
            <div>
                <label for="">
                    <input type="checkbox"> AYURVEDIC
                </label> 
                  <label for="">
                    <input type="checkbox"> BABY CARE
                </label> 
                  <label for="">
                    <input type="checkbox"> HELTHCARE
                </label> 
            </div>
            </div>
        </div>
        <table border="0">
           
            <tbody>
                <tr >
                    <td rowspan="3">
                        Categories
                        <a href="">Ayurvedic Care</a>
                        <a href="">Baby Care</a>
                        <a href="">Dental Care</a>
                        <a href="">Diabetes Care</a>
                        <a href="">Blood Pressure Monitor</a>
                        <a href="">First aid item</a>
                            
                        <select name="sort by">
                            <option disabled="disabled">sort bye</option>
                           <option>price low to high</option>
                            <option>price high to low</option>
                            <option>best seller</option>
                            <option>availability</option>
                        </select>  
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
                <tr><td colspan="4>"
          <div id="container">
                <a href="#" id="previous">&laquo;Previous</a>
                <a href="#" id="next">&raquo;Next</a>
 </div>
        </tr>
            </tbody>
             
            
        </table>
    </body>
</html>
