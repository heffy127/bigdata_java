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
	<script type="text/javascript">
		function del() {
			document.f.action = "bbs_delete.jsp"
			document.f.submit()
		}
		
		function up() {
			document.f.action = "bbs_update.jsp"
			document.f.submit()
		}
	</script>
</head>
<body>
	<jsp:useBean id="dto" class="bean.BbsDTO" />
	<jsp:useBean id="dto2" class="bean.BbsDTO" />
	<jsp:useBean id="dao" class="bean.BbsDAO" />
	<jsp:setProperty property="*" name="dto" />
	<%
		dto2 = dao.select(dto.getTitle());
	%>
	<form name="f">
			<span class="badge badge-pill badge-primary">ID</span>
			<input class="form-control" type="text" placeholder="input id" value=<%=dto2.getId() %> name = "id">
			<br>
			<span class="badge badge-pill badge-secondary">Title</span>
			<input class="form-control form-control-sm" type="text" placeholder="input title" value=<%=dto2.getTitle() %> name="title">
			<input type="hidden" name = "title2" value="<%=dto2.getTitle() %>">
			<br>
			<div class="form-group">
				<span class="badge badge-pill badge-success">Content</span>
				<textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="content"><%=dto2.getContent() %>
				</textarea>
			</div>
			<br>
			<span class="badge badge-pill badge-danger">Etc</span>
			<input class="form-control form-control-sm" type="text" placeholder="etc" value=<%=dto2.getEtc() %> name = "etc">
			<br>
			<button type="button" class="btn btn-secondary btn-lg" onclick="javascript:up()">수정하기</button>
			<button type="button" class="btn btn-danger" onclick="javascript:del()">삭제하기</button>
	</form>
	
</body>
</html>