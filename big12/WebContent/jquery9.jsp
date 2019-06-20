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
		$("button").click(function() {
			$("img").attr("width","100px")
			$("img").attr("heigh","200px")
			$("img").css("border","4px dotted red")
		})
	})
</script>
</head>
<body>
	<button>나를 눌러요</button>
	<img src="1234.jpg">
</body>
</html>