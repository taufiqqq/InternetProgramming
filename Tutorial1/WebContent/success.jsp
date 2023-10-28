<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>You are successfully logged in</h1>
	<%
		User user = (User) request.getAttribute("user");
		out.println("Welcome my beloved " + user.getUserName());
	%>
</body>
</html>