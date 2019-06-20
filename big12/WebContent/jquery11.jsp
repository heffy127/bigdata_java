<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("li").css("background", "lime")

		/* 자식만 지우기 (li밑의 텍스트만) */
		$("li").empty()

		/* 자기자신까지 지우기 (자기자신인 li까지) */
		$("li").remove()
	})
</script>
</head>
<body>
	<ul>
		<li>감자</li>
		<li>고구마</li>
		<li>양파</li>
	</ul>
</body>
</html>