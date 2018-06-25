<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<title>Current Inventory</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="./styles/styles.css">
<style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", sans-serif}
</style>
<body class="w3-light-grey w3-content" style="max-width:1600px">

<!-- Sidebar/menu -->
<nav class="w3-sidebar w3-collapse w3-white w3-animate-left" style="z-index:3;width:300px;" id="mySidebar"><br>
  <div class="w3-container">
    <a href="#" onclick="w3_close()" class="w3-hide-large w3-right w3-jumbo w3-padding w3-hover-grey" title="close menu">
      <i class="fa fa-remove"></i>
    </a>
    <img src=".//images//2018.jpg" style="width:45%;" class="w3-round"><br><br>
    <h4><b>DJ's Deals</b></h4>
    <p class="w3-text-grey">Current Inventory</p>
  </div>
  <div class="w3-bar-block">
    <a href="#portfolio" onclick="w3_close()" class="w3-bar-item w3-button w3-padding w3-text-teal"><i class="fa fa-th-large fa-fw w3-margin-right"></i>PORTFOLIO</a> 
    <a href="#about" onclick="w3_close()" class="w3-bar-item w3-button w3-padding"><i class="fa fa-user fa-fw w3-margin-right"></i>ABOUT</a> 
    <a href="#contact" onclick="w3_close()" class="w3-bar-item w3-button w3-padding"><i class="fa fa-envelope fa-fw w3-margin-right"></i>CONTACT</a>
  </div>
  <div class="w3-panel w3-large">
    <i class="fa fa-facebook-official w3-hover-opacity"></i>
    <i class="fa fa-instagram w3-hover-opacity"></i>
    <i class="fa fa-snapchat w3-hover-opacity"></i>
    <i class="fa fa-pinterest-p w3-hover-opacity"></i>
    <i class="fa fa-twitter w3-hover-opacity"></i>
    <i class="fa fa-linkedin w3-hover-opacity"></i>
  </div>
</nav>

<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:300px">

  <!-- Header -->
  <header id="portfolio">
    <a href="#"><img src=".//images//Toy4Runner2.jpg" style="width:65px;" class="w3-circle w3-right w3-margin w3-hide-large w3-hover-opacity"></a>
    <span class="w3-button w3-hide-large w3-xxlarge w3-hover-text-grey" onclick="w3_open()"><i class="fa fa-bars"></i></span>
    <div class="w3-container">
    <h1><b>Current Inventory</b></h1>
    <div class="w3-section w3-bottombar w3-padding-16">
    	<a href="Home.jsp"><button class="w3-button w3-black">HOME</button></a>
      <a href="signIn.jsp"><button class="w3-button w3-white w3-hide-small"><i class="fa fa-map-pin w3-margin-right"></i>Sign In</button></a>
  <a href="AdminServlet"><button class="w3-button w3-white w3-hide-small"><i class="fa fa-map-pin w3-margin-right"></i>Admin</button></a>
      <a target="_blank"  href="CartServlet?carId=${car.carId}"><button class="w3-button w3-white w3-hide-small"><i class="fa fa-photo w3-margin-right"></i>CheckOut</button></a>
     
      
    </div>
    </div>
  </header>
  
  <!-- dynamically going through inventory of cars. -->

  
  
  <c:forEach var="car" items="${cars}" >
<div class="gallery">
<a target="_blank"  href="DetailsServlet?carId=${car.carId}"> 
<img src="${car.image}" alt="${car.make}" width="350" height="250" >
</a>
<div class="desc">
<c:out value="${car.year}" />
<c:out value="${car.make}" />
<br>
<c:out value="${car.model}" />
<br>
Price:** $<c:out value="${car.price}" />
<br>
<a target="_blank"  href="DetailsServlet?carId=${car.carId}"><button  type="button" name="detail" class="btn" value="">Details</button></a>
<c:if test = "${car.getcarAge()==true }">
	<a target="_blank"  href="DetailsServlet?bidCarId=${car.carId}"><button  type="button" name="bestoffer" class="btn" value="">Bid</button></a>
<!-- <button class="w3-button w3-teal w3-padding-large w3-hover-black">Details</button> -->
</c:if>
</div>
</div>
</c:forEach>

  

      </div>
    </div>
  </div>
  
  <!-- Contact Section -->
  <div class="w3-container w3-padding-large w3-grey">
    <h4 id="contact"><b>Contact Me</b></h4>
    <div class="w3-row-padding w3-center w3-padding-24" style="margin:0 -16px">
      <div class="w3-third w3-dark-grey">
        <p><i class="fa fa-envelope w3-xxlarge w3-text-light-grey"></i></p>
        <p>djudd0720@yahoo.com</p>
      </div>
      <div class="w3-third w3-teal">
        <p><i class="fa fa-map-marker w3-xxlarge w3-text-light-grey"></i></p>
        <p>St Louis, MO</p>
      </div>
      <div class="w3-third w3-dark-grey">
        <p><i class="fa fa-phone w3-xxlarge w3-text-light-grey"></i></p>
        <p>8042222222</p>
      </div>
    </div>
    <hr class="w3-opacity">
    <form action="/action_page.php" target="_blank">
      <div class="w3-section">
        <label>Name</label>
        <input class="w3-input w3-border" type="text" name="Name" required>
      </div>
      <div class="w3-section">
        <label>Email</label>
        <input class="w3-input w3-border" type="text" name="Email" required>
      </div>
      <div class="w3-section">
        <label>Message</label>
        <input class="w3-input w3-border" type="text" name="Message" required>
      </div>
      <button type="submit" class="w3-button w3-black w3-margin-bottom"><i class="fa fa-paper-plane w3-margin-right"></i>Send Message</button>
    </form>
  </div>

  <!-- Footer -->
  <footer class="w3-container w3-padding-32 w3-dark-grey">
  <div class="w3-row-padding">
    <div class="w3-third">
      <h3>FOOTER</h3>
      <p>Praesent tincidunt sed tellus ut rutrum. Sed vitae justo condimentum, porta lectus vitae, ultricies congue gravida diam non fringilla.</p>
      <p>Powered by <a href="https://denisejudd.com" target="_blank">denisejudd.com</a></p>
    </div>
  
   

    <div class="w3-third">
      <h3>POPULAR TAGS</h3>
      <p>
        <span class="w3-tag w3-black w3-margin-bottom">Travel</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">New York</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">London</span>
        <span class="w3-tag w3-grey w3-small w3-margin-bottom">IKEA</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">NORWAY</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">DIY</span>
        <span class="w3-tag w3-grey w3-small w3-margin-bottom">Ideas</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">Baby</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">Family</span>
        <span class="w3-tag w3-grey w3-small w3-margin-bottom">News</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">Clothing</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">Shopping</span>
        <span class="w3-tag w3-grey w3-small w3-margin-bottom">Sports</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">Games</span>
      </p>
    </div>

  </div>
  </footer>
  
  <div class="w3-black w3-center w3-padding-24">Powered by <a href="https://denisejudd.com" title="dj's deals" target="_blank" class="w3-hover-opacity">denisejudd.com</a></div>

<!-- End page content -->
</div>

<script>
// Script to open and close sidebar
function w3_open() {
    document.getElementById("mySidebar").style.display = "block";
    document.getElementById("myOverlay").style.display = "block";
}
 
function w3_close() {
    document.getElementById("mySidebar").style.display = "none";
    document.getElementById("myOverlay").style.display = "none";
}
</script>

</body>
</html>
