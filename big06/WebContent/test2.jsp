<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<%
		String col = request.getParameter("color");
	%>
</head>
<body bgcolor=<%=col%>>
	<%=col %>
</body>
</html>