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
	<jsp:useBean id="dto" class="bean.BbsDTO" />
	<jsp:useBean id="dao" class="bean.BbsDAO" />
	<jsp:setProperty property="*" name="dto" />
	<%
		String title = request.getParameter("title2");
		dao.update(title, dto);
	%>
	<div class="alert alert-danger" role="alert">게시글 수정 완료</div>
	<div class="form-group">
		<form action="bbs_search.jsp">
			<label for="exampleInputEmail1">게시글 검색</label> 
			<input class="form-control form-control-lg" type="text" placeholder="title 입력" name = "title">
			<button type="submit" class="btn btn-secondary btn-lg">검색</button>
		</form>
	</div>
</body>
</html>