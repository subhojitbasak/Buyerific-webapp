<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead Here......</title>
</head>
<body>
<h2>Create Lead Here</h2>
<form action="save">
<pre>
Username <input type="text" name="username"/>
Email    <input type="email" name="email"/>
Mobile   <input type="number" name="mobile"/>
<input type="submit" value="save"/>


</pre>

</form>
</body>
</html>