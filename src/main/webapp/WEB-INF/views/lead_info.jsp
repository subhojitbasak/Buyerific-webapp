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
<pre>
Username : ${lead.username }
Email :    ${lead.email}
Mobile:    ${lead.mobile}
<form action="convert">
<input type="hidden" name="id" value="${lead.id}"/>
<input type="submit" value="convert"/>
</form>


</pre>

</body>
</html>