<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="bean.MemberDTO" />
	<jsp:useBean id="dao" class="bean.MemberDAO" />
	<jsp:setProperty property="*" name="dto" />
	<%=dto.getId() %>
	<%
		dao.update(dto);
	%>
	회원수정 신청이 완료되었습니다.<br>
	검색하시겠어요?<br><a href="find.jsp?id=<%=dto.getId()%>">수정된 내용 확인</a>
</body>
</html>