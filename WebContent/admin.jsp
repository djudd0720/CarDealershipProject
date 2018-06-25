<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
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

<title>Admin</title>
</head>
<body>
<h2>ADMIN REPORT</h2>
	

<div class="desc">

 <a target="_blank"  href="AdminServlet?carId=${car.carId}"> 

</a>
		 <table>

				<tr>
					<td>ID</td>
					<th>Year</th>
					<th>Make</th>
					<th>Model</th>
					<th>Price</th>
					<th>Status</th>

				</tr>
				<c:forEach var="car" items="${cars}" >
				<tr>
				
					
					<!-- <td>Year</td> -->
					<td>${car.carId}</td>
					<td>${car.year}</td> <td> ${car.make}</td> <td> ${car.model}</td>
					<%-- <td>${car.condition}</td><td> ${car.details} /></td> --%>
					<td>${car.price}</td>
					<td>${car.status}</td>
					</tr>
				</c:forEach>


				
			</table>
			
</div>

</body>
</html>

