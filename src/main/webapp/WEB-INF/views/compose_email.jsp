<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email</title>
</head>
<body>
	<form action="send" method="post">
		<pre>

	To : <input type="email" name="to" value="${contact.email}" />
    Subject:<input type="text" name="sub" />
    Body:
	     <textarea name="body" rows="4" cols="50"></textarea>
	<br>
	<input type="submit" value="send" />


</pre>


	</form>
	${msg}
</body>
</html>