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
	/* Post 방식의 요청은 따로 한글처리 필요 */
	request.setCharacterEncoding("UTF-8");
	String find = request.getParameter("find");
	%>
	검색 요청된 스트링 : <%=find %>
</body>
</html>