<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<h1>Login</h1>
${SPRING_SECURITY_LAST_EXCEPTION.message}
<form action="login" method="post">

<pre>
UserName <input type="text" name="username"/>
PassWord <input type="password" name="password"/>

<input type="submit" value="submit"/>


</pre>
 
</form>


</body>
</html>