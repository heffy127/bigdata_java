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
		$("#b1").mouseover(function() {
			alert("내 위에 마우스가 있습니다.")
		})
		
		$("#b2").mouseout(function() {
			alert("나를 떠났군요.")
		})
		
		$("#data").keyup(function() { //키보드 키가 올라갔을때 실행(실시간 체크 가능)
			if($("#data").val().length < 5){
				$("#result").text("5글자 이상 입력해주세요.")
			} else {
				$("#result").text($("#data").val())
			}
		})
	})
</script>
</head>
<body>
	<button id="b1">내 위로 올려요</button>
	<button id="b2">나를 떠나요</button><br>
	<input type="text" id="data">
	<div id="result">
	</div>
	
</body>
</html>