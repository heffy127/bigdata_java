<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<script type="text/javascript">
	$(function() {
		var check1 = false;
		var check2 = false;
		
		$("#food").change(function() {
			if (check1 == false) {
				$("#food2 input").attr("checked", true)
				check1 = true
			} else {
				$("#food2 input").attr("checked", false)
				check1 = false
			}
		})

		$("#place").change(function() {
			if (check2 == false) {
				$("#place2 input").attr("checked", true)
				check2 = true
			} else {
				$("#place2 input").attr("checked", false)
				check2 = false
			}
		})
	})
	
</script>

</head>
<body>
	<input type="checkbox" value="음식" id="food">음식
	<br>
	<ul id="food2">
		<li><input type="checkbox" value="감자">감자</li>
		<li><input type="checkbox" value="고구마">고구마</li>
	</ul>
	<br>
	<input type="checkbox" value="장소" id="place">장소
	<br>
	<ul id="place2">
		<li><input type="checkbox" value="공원">공원</li>
		<li><input type="checkbox" value="주차장">주차장</li>
	</ul>
</body>
</html>