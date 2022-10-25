<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="menu.jsp" %>
<%@ taglib  prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List | Leads</title>
</head>
<body>
	<h1>List Of Leads</h1>
	<table border=2>
		<tr>
			<td>User Name</td>
			<td>Email</td>
			<td>Mobile</td>

		</tr>
		<c:forEach var="lead" items="${leads}">
		<tr>
		<td><a href = "findOneLead?id=${lead.id}">${lead.username}</a></td>
		<td>${lead.email}</td>
		<td>${lead.mobile}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>