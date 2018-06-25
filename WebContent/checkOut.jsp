<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CheckOUT</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 32%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 6px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
<!-- <div class="w3-section w3-bottombar w3-padding-16">
      <span class="w3-margin-right">Filter:</span>-->
      <a href="Home.jsp"><button class="w3-button w3-black">HOME</button></a>
      <a href="ShopServlet"><button class="w3-button w3-white"><i class="fa fa-diamond w3-margin-right"></i>Continue Shopping </button></a>

</head>
<body>
<!-- Show car(s) in cart that user has selected and CheckOut button. -->

  <h2>CART CHECKOUT</h2>
  
 <c:forEach var="cartCars" items="${cartCars}" >
<!--  <div class="gallery">-->
<%-- <a target="_blank"  href="DetailsServlet?carId=${car.carId}"></a> --%>


	<div class="gallery">
		<%-- <a target="_blank" href="DetailsServlet?carId=${car.carId}">  --%>
		<img src="${cartCars.image}" alt="${cartCars.make}" width="275" height="175">
		</a>
		<div class="desc">
			<table>
				<tr>
					<th>Product</th>
					<th>Specifics</th>

				</tr>
				<tr>
					<td>Year</td>
					<td><c:out value="${cartCars.year}" /></td>

				</tr>
				<tr>
					<td>Make</td>
					<td><c:out value="${cartCars.make}" /></td>

				</tr>
				<tr>
					<td>Model</td>
					<td><c:out value="${cartCars.model}" /></td>

				</tr>
				
				<tr>
					<td>Price</td>
					<td>$<c:out value="${cartCars.price}" /></td>

				</tr>
			</table>

</c:forEach>



<a target="_blank"  href="FinalServlet"><button  type="button" name="ckout" class="btn" value="">CheckOut</button></a>


</body>
</html>