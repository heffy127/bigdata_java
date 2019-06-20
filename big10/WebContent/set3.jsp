<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	세션 값 : ${id }<br>
	어플리케이션 값 : ${count }
	<hr>
	<%
	int c = (int)application.getAttribute("count");
	int total = c + 1;
	application.setAttribute("count", total); /* id는 "count" value는 102 */
	%>

</body>
</html>