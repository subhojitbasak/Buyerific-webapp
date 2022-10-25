<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact List</title>
</head>
<body>
	<h1>Contact List</h1>
	<table border=2>
		<tr>
			<td>Username</td>
			<td>Email</td>
			<td>Mobile</td>
			<td>GenerateBill</td>
		</tr>
		<c:forEach var="contact" items="${contact}">
			<tr>
	
				<td><a href ="contactInfo?id=${contact.id}">${contact.username}</a></td>
				<td>${contact.email}</td>
				<td>${contact.mobile}</td>
				<td><a href="generateBill?id=${contact.id}">Generate</a></td>
				<td></td>

			</tr>



		</c:forEach>

	</table>

</body>
</html>