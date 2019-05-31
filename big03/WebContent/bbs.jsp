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
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");
		String pw = request.getParameter("pw");
	%>
	<h2>게시판</h2>
	<hr width="1050" color="red" align="left">
	제목 : <%=title %><br>
	내용 : <%=content %><br>
	글쓴이 : <%=writer %><br>
	비밀번호 : <%=pw %><br>
</body>
</html>