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
		ArrayList<BasketDTO> list = (ArrayList<BasketDTO>) session.getAttribute("basket");
		for (BasketDTO dto : list) {
	%>
	--------
	<br> pid :
	<%=dto.getpId()%><br> count :
	<%=dto.getCount()%><br> price :
	<%=dto.getPrice()%><br>
	<br>

	<%
		}
	%>


</body>
</html>