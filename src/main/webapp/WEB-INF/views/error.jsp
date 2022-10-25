<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>This is Error Page</h2>
<pre>
Timestamp:   ${timestamp }
Status Code: ${status}
Error:       ${error}
Reason:      ${message}

</pre>


</body>
</html>