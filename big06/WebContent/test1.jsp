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
		int num1 = Integer.parseInt(request.getParameter("num1")); 
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int sum = 0;
		for(int i = num1 ; i <= num2 ; i++) {
			sum += i;
		}
	%>
	두 수 사이의 합 = <%=sum %>
</body>
</html>