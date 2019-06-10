<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="bean.MemberDTO"/>
<jsp:useBean id="dao" class="bean.MemberDAO"/>
<jsp:setProperty property="*" name="dto"/>
<%
	dao.insert(dto);
%>
회원가입 신청이 완료되었습니다.

</body>
</html>