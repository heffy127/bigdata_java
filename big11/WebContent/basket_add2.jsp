<%@page import="bean.BasketDTO"%>
<%@page import="java.util.ArrayList"%>
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
		String pId = request.getParameter("pId");
		Cookie c1 = new Cookie(pId, pId);
		String price = request.getParameter("price");
		Cookie c2 = new Cookie(price, price);
		
		response.addCookie(c1);
		response.addCookie(c2);
	%>
<jsp:forward page="basket_view2.jsp"/>


</body>
</html>