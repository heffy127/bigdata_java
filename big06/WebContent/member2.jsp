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
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String year = request.getParameter("year");
	String month = request.getParameter("month");
	String day = request.getParameter("day");
	String gender = request.getParameter("gender");
	String email = request.getParameter("email");
	%>
	<h2>당신의 회원 정보</h2>
	<hr>
	아이디 : <%=id %><br>
	비밀번호 : <%=pw %><br>
	이름 : <%=name %><br>
	생년월일 : <%=year %>년 <%=month %>월 <%=day %>일	<br>
	성별 : <%=gender %><br>
	이메일 : <%=email %><br>
</body>
</html>