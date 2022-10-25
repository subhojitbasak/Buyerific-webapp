<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing Page</title>
</head>
<body>

<form action="generate">
<pre>
Username:     <input type="text" value = "${contact.username}" name ="username">

Email:       <input type="text" value = "${contact.email}" name ="email"> 

Mobile:       <input type="text" value = "${contact.mobile}" name ="username">

Product Name: <input type ="text" name ="prodname">

Product Amount: <input type="text" name ="amount">
<input type="submit" value="generate">

</pre>

</form>

</body>
</html>