<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="errorPage.jsp"
	import="com.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		User user = new User();
		user.setUserName(uname);
		user.setPassword(pwd);
		request.setAttribute("user", user);
		
		if (uname == null || uname.equals("")) {
			throw new Exception();
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
		}
	%>
</body>
</html>