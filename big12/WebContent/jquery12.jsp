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
		$("#b1").click(function() {
			$("li").addClass("aqua")
			/* <li class = "aqua"> */
			})
		$("#b2").click(function() {
			$("li").removeClass("aqua")
			/* <li class = "aqua"> */
			})
		})
</script>

<style type="text/css">
.aqua {
	background: aqua;
}
</style>

</head>
<body>
	<button id="b1">클래스 o</button>
	<button id="b2">클래스 x</button>
	<ul>
		<li>감자</li>
		<li>고구마</li>
		<li>양파</li>
	</ul>
</body>
</html>