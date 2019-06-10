<%@page import="bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<jsp:useBean id="dto" class="bean.MemberDTO" />
	<jsp:useBean id="dao" class="bean.MemberDAO" />
	<jsp:setProperty property="*" name="dto" />
	<%
		MemberDTO dto2 = dao.select(dto);
	%>
	검색결과
	<hr>
	<form action="update.jsp">
		수정할 ID : <input type="text" value="<%=dto2.getId()%>" name="id"> <br>
		수정할 PW : <input type="text" value="<%=dto2.getPw()%>" name="pw"> <br>
		수정할 NAME : <input type="text" value="<%=dto2.getName()%>" name="name"> <br>
		수정할 TEL : <input type="text" value="<%=dto2.getTel()%>" name="tel"> <br>
		<button type="submit" class="btn btn-danger" >서버로 전송</button>
	</form>
</body>
</html>