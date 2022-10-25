<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Information</title>
</head>
<body>
<h1>Contact Information</h1>
<pre>
Username:  ${contact.username}
Email:     ${contact.email}
Mobile:    ${contact.mobile}

<a href="composeEmail?id=${contact.id}">Email</a>

</pre>



</body>
</html>