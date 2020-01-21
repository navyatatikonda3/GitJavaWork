<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("Welcome to jsp");

%>
<form action="/servlet/greeting" method="post">
<input type="submit" value="Greet Me!">
</form>
</body>
</html>