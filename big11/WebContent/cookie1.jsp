<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Cookie c1 = new Cookie("hi", "hello");
	c1.setMaxAge(0);
	response.addCookie(c1);

	Cookie c2 = new Cookie("name", "hong");
	c2.setMaxAge(0);
	response.addCookie(c2);
	%>
<jsp:forward page="cookie2.jsp"></jsp:forward>
</body>
</html>