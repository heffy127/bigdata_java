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

			$("ul").append("<img src='1234.jpg' width='100px' height='50px'>")
		})
	})
</script>

</head>
<body>
	<button>나를 눌러요</button>
	<ul>
	</ul>
</body>
</html>