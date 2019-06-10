<%@page import="bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<!-- 액션태그 -->
	<jsp:useBean id="dto" class="bean.MemberDTO"/><!-- import와 new 역할 -->
	<jsp:setProperty property="*" name="dto"/><!-- parameter다 받은 후 dto 객체에 넣어줌-->
											  <!-- dto변수와 parameter의 이름이 같아야 함 -->	
											  
	DTO에 들어간 값 출력
	<hr>
	id : <%=dto.getId() %><br>
	pw : <%=dto.getPw() %><br>
	name : <%=dto.getName() %><br>
	tel : <%=dto.getTel() %>
</body>
</html>