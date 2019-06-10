<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="dto" class="board.BoardDTO"/>
	<jsp:useBean id="dto2" class="board.BoardDTO"/>
	<jsp:useBean id="dao" class="board.BoardDAO"/>
	<jsp:setProperty property="*" name="dto"/>
	<%
	dao.insert(dto);
	dto2 = dao.select("asdf");
	%>
	id = <%=dto2.getId() %><br>
	title = <%=dto2.getTitle() %><br>
	contents = <%=dto2.getContents() %>
	
</body>
</html>