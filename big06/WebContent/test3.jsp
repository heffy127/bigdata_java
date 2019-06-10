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
		String country = request.getParameter("country");
		int count = Integer.parseInt(request.getParameter("count"));
		if(count >= 3){
			out.print(country + "을 그만가셔야겠군요." );
		} else {
			out.print(country + "을 더 갈 수 있겠군요.");
		}
	%>

</body>
</html>