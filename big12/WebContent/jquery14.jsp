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
			var cmt = $("#comment").val()
			console.log(cmt)
			$("ul").before("<li>"+cmt+"</li>")
		})
	})
</script>

</head>
<body>
	원글<br>
	<hr>
	<input type="text" id="comment">
	<button>등록</button><br>
	<ul>
	</ul>
	
</body>
</html>