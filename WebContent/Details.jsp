<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 55%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>

	<h2>DETAILS</h2>
	<div class="gallery">
		<a target="_blank" href="DetailsServlet?carId=${car.carId}"> <img
			src="${car.image}" alt="${car.make}" width="400" height="300">
		</a>
		<div class="desc">
			<table>
				<tr>
					<th>Product</th>
					<th>Specifics</th>

				</tr>
				<tr>
					<td>Year</td>
					<td><c:out value="${car.year}" /></td>

				</tr>
				<tr>
					<td>Make</td>
					<td><c:out value="${car.make}" /></td>

				</tr>
				<tr>
					<td>Model</td>
					<td><c:out value="${car.model}" /></td>

				</tr>
				<tr>
					<td>Condition</td>
					<td><c:out value="${car.condition}" /></td>

				</tr>
				<tr>
					<td>Description</td>
					<td><c:out value="${car.description}" /></td>

				</tr>
				<tr>
					<td>Price</td>
					<td>$<c:out value="${car.price}" /></td>

				</tr>
			</table>
			<a href="CartServlet?carId=${car.carId}"><button type="submit"
					name="addcart" class="btn" value="">Add to Cart</button></a>
			<%-- <a href="CartServlet?cart=${car.carId}"><button class="w3-button w3-white"><i class="fa fa-diamond w3-margin-right"></i>Add to Cart</button></a> --%>

</body>
</html>