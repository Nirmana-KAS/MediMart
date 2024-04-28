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
        <div class="carousel">
            <div class="carousel-images">
                <div class="carousel-image">
                <img src="images/carosal2.jpg" alt="Image 1">
            </div>
            <div class="carousel-image">
                <img src="images/carosal4.jpg" alt="Image 2">
            </div>
            <div class="carousel-image">
                <img src="images/carosal3.jpg" alt="Image 3">
            </div>
            </div>
    <div class="slogan-head">Your Wellness, Our Priority</div>
    <div class="slogan-description">"We prioritize your health and well-being by delivering quality medications and healthcare essentials directly to you, ensuring a seamless experience."</div>
        </div>
        <!-- Container for sort by, filter section, and quantity controls -->
        <div class="options-container">
            <!-- Sort by list -->
            <div class="sort-by">
                <label for="sort">Sort By:</label>
                <select name="sort" id="sort">
            <option value="default">Default</option>
                    <option value="price_low_to_high">Price Low to High</option>
                    <option value="price_high_to_low">Price High to Low</option>
                    <option value="name_a_to_z">Name A to Z</option>
                    <option value="name_z_to_a">Name Z to A</option>
                </select>
            </div>
    
            <!-- Filter section -->
            <div class="filter-section">
                <h3>Filter By:</h3>
                <label for="filter1" class="filter-checkbox"><input type="checkbox" id="filter1"> Analgesics</label>
                <label for="filter2" class="filter-checkbox"><input type="checkbox" id="filter2"> Antibiotics</label>
                <label for="filter3" class="filter-checkbox"><input type="checkbox" id="filter3"> Antidepressants</label>
            <label for="filter4" class="filter-checkbox"><input type="checkbox" id="filter1"> Antivirals</label>
                <label for="filter5" class="filter-checkbox"><input type="checkbox" id="filter2"> Cardiovascular Medications</label>
                <label for="filter6" class="filter-checkbox"><input type="checkbox" id="filter3"> Gastrointestinal Medications</label>
            <label for="filter7" class="filter-checkbox"><input type="checkbox" id="filter2"> Topical Medications</label>
                <label for="filter8" class="filter-checkbox"><input type="checkbox" id="filter3"> Vitamins and Supplements</label>
                <!-- Add more checkboxes as needed -->
            </div>
    </div>
            <!-- Product grid -->
            <div class="product-grid">
                <!-- Products will be dynamically generated here -->
            </div>
            <div class="pagination">
                <button id="prevPageBtn"> <<.Previous Page </button>
                <button id="nextPageBtn">Next Page>></button>
            </div>
        </div>
    
        <!-- JavaScript code -->
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
    
            setInterval(slide, 3000); // Change slide every 3 seconds
        
        
        // Function to handle sorting
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
                    sortedProducts = products.slice(); // Default to original order
                    break;
            }
    
            displayProducts(sortedProducts);
        });
    
        // Function to handle filtering
        document.querySelectorAll('.filter-checkbox input').forEach(checkbox => {
            checkbox.addEventListener('change', function() {
                const checkedFilters = Array.from(document.querySelectorAll('.filter-checkbox input:checked'))
                                                .map(checkbox => checkbox.id);
    
                const filteredProducts = products.filter(product => {
                    // Example: Filter products based on checkbox IDs
                    return checkedFilters.includes('filter1') ? product.name.includes('Product 1') : true;
                    // Add more conditions as needed for other filter options
                });
    
                displayProducts(filteredProducts);
            });
        });
    
    
    
            // Sample product data (replace with your actual data)
            const products = [
    
    
    { image: 'images/1.jpg', name: "BRILINTA 90MG TAB 56S", description: "This medication is used to treat high blood pressure (hypertension). Side Effects, Dizziness or lightheadedness may occur as your body adjusts to the medication. When not to use, It is contraindicated in patients with known hypersensitivity to the drug.", price: 302.54 },
                { image: 'images/2.jpg', name: "PLAVIX 75MG TABS 28 S", description: "Active ingredient clopidogrel hydrogen sulfate. Plavix 75 mg film-coated tablets Each film-coated tablet contains 75 mg of clopidogrel (as hydrogen sulphate).", price: 34.72  },
    
     { image: 'images/3.png', name: "CLOPIVAS 75MG", description: "Principal Novartis, Therapeutic Group Cardio Antihypertensive, Generic Name Valsartan. Diovan (Valsartan) - 80mg (28 Tablets) Diovan (Valsartan) Uses,", price: 15.87 },
    { image: 'images/4.jpg', name: "DIOVAN CAP 80MG", description: "This medication is used to treat high blood pressure (hypertension). Side Effects, Dizziness or lightheadedness may occur as your body adjusts to the medication", price:199.44 },
    { image: 'images/5.jpg', name: "CLOPIVAS 75MG", description: "This medication is used to treat high blood pressure (hypertension). Side Effects, Dizziness or lightheadedness may occur as your body adjusts to the medication", price: 15.87 },
    { image: 'images/6.jpg', name: "CLOPIVAS 75MG", description: "This medication is used to treat high blood pressure (hypertension). Side Effects, Dizziness or lightheadedness may occur as your body adjusts to the medication", price: 15.87 },
    { image: 'images/7.jpeg', name: "CLOPIVAS 75MG", description: "This medication is used to treat high blood pressure (hypertension). Side Effects, Dizziness or lightheadedness may occur as your body adjusts to the medication", price: 15.87 },
    { image: 'images/8.jpg', name: "CLOPIVAS 75MG", description: "This medication is used to treat high blood pressure (hypertension). Side Effects, Dizziness or lightheadedness may occur as your body adjusts to the medication", price: 15.87 },
    { image: 'images/9.jpg', name: "CLOPIVAS 75MG", description: "This medication is used to treat high blood pressure (hypertension). Side Effects, Dizziness or lightheadedness may occur as your body adjusts to the medication", price: 15.87 },
    { image: 'images/10.png', name: "CLOPIVAS 75MG", description: "This medication is used to treat high blood pressure (hypertension). Side Effects, Dizziness or lightheadedness may occur as your body adjusts to the medication", price: 15.87 },
    { image: 'images/11.png', name: "CLOPIVAS 75MG", description: "This medication is used to treat high blood pressure (hypertension). Side Effects, Dizziness or lightheadedness may occur as your body adjusts to the medication", price: 15.87 },
    { image: 'images/12.jpg', name: "CLOPIVAS 75MG", description: "This medication is used to treat high blood pressure (hypertension). Side Effects, Dizziness or lightheadedness may occur as your body adjusts to the medication", price: 15.87 },
              
                   ];
    
            const productsPerPage = 9; // Number of products per page
            let currentPage = 1; // Current page
    
            // Function to display products
            function displayProducts(products) {
                const productGrid = document.querySelector('.product-grid');
                productGrid.innerHTML = ''; // Clear existing products
                const startIndex = (currentPage - 1) * productsPerPage;
                const endIndex = startIndex + productsPerPage;
                const currentProducts = products.slice(startIndex, endIndex);
    
                currentProducts.forEach(product => {
                    const productCard = document.createElement('div');
                    productCard.classList.add('product-card');
                    productCard.innerHTML = `
                       <div class="card-content"> <img src="${product.image}" alt="${product.name}" class="product-image">
                        <h3>${product.name}</h3>
                        <p class="description">${product.description}</p>
                        <p>LKR: ${product.price.toFixed(2)}</p>
                                           <!-- Add to cart button -->
                        <button class="add-to-cart-btn">Add to Cart</button></div>
                    `;
                    productGrid.appendChild(productCard);
                });
    
             // Initial display of random 9 products
            const randomProducts = products.sort(() => Math.random() - 0.5).slice(0, 9);
            displayProducts(randomProducts); // Attach event listeners to quantity increase buttons
                const increaseBtns = document.querySelectorAll('.increase-btn');
                increaseBtns.forEach(increaseBtn => {
                    increaseBtn.addEventListener('click', () => {
                        const quantityDisplay = increaseBtn.parentElement.querySelector('.quantity-display');
                        increaseQuantity(quantityDisplay);
                    });
                });
    
                // Attach event listeners to quantity decrease buttons
                const decreaseBtns = document.querySelectorAll('.decrease-btn');
                decreaseBtns.forEach(decreaseBtn => {
                    decreaseBtn.addEventListener('click', () => {
                        const quantityDisplay = decreaseBtn.parentElement.querySelector('.quantity-display');
                        decreaseQuantity(quantityDisplay);
                    });
                });
            }
    
            // Function to handle quantity increase
            function increaseQuantity(quantityDisplay) {
                let quantity = parseInt(quantityDisplay.textContent);
                quantity++;
                quantityDisplay.textContent = quantity;
            }
    
            // Function to handle quantity decrease
            function decreaseQuantity(quantityDisplay) {
                let quantity = parseInt(quantityDisplay.textContent);
                if (quantity > 1) {
                    quantity--;
                    quantityDisplay.textContent = quantity;
                }
            }
    
            // Initial display of products on the first page
            const initialProducts = products.slice(0, productsPerPage);
            displayProducts(initialProducts);
    
            // Pagination functionality
            const prevPageBtn = document.getElementById('prevPageBtn');
            const nextPageBtn = document.getElementById('nextPageBtn');
    
            prevPageBtn.addEventListener('click', () => {
                if (currentPage > 1) {
                    currentPage--;
                    displayProducts(products);
                }
            });
    
            nextPageBtn.addEventListener('click', () => {
                const totalPages = Math.ceil(products.length / productsPerPage);
                if (currentPage < totalPages) {
                    currentPage++;
                    displayProducts(products);
                }
            });
    
     // Function to add product to cart and redirect to cart page
            function addToCart() {
                // Get product details
                const productName = this.parentElement.querySelector('h3').textContent;
                const productPrice = this.parentElement.querySelector('p:nth-of-type(3)').textContent;
    
                // Get quantity
                const quantity = parseInt(this.parentElement.querySelector('.quantity-display').textContent);
    
                // Construct cart item object
                const cartItem = {
                    name: productName,
                    price: parseFloat(productPrice.replace('$', '')),
                    quantity: quantity
                };
    
                // Get existing cart items from localStorage
                let cartItems = JSON.parse(localStorage.getItem('cart')) || [];
    
                // Add new item to cart
                cartItems.push(cartItem);
    
                // Update cart in localStorage
                localStorage.setItem('cart', JSON.stringify(cartItems));
    
                // Redirect to cart page
                window.location.href = "cart.jsp";
            }
    
            // Attach event listener to Add to Cart buttons
            const addToCartBtns = document.querySelectorAll('.add-to-cart-btn');
            addToCartBtns.forEach(btn => {
                btn.addEventListener('click', addToCart);
            });
        </script>
    
        
    </body>
</html>    