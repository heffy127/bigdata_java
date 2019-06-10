<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bdto" class="bean.BbsDTO"/>
	<jsp:setProperty property="*" name="bdto"/>
	id : <%=bdto.getId() %><br>
	title : <%=bdto.getTitle() %><br>
	content : <%=bdto.getContent() %><br>
	writer : <%=bdto.getWriter() %><br>
</body>
</html>