<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	/* document를 읽어왔을때 function을 실행하세요 */
	/* $(document).ready(function(){
		
	})
	 */
	 
	/* 위는 옛날 코드*/
	
	$(function() {
		console.log("문서 load OK")
		
		/* getText 한것 */
		var h2 = $("h2").text(); // 태그 사이의 content를 가지고 오는것
		console.log(h2)
		
		/* setText 한것 */
		$("h1").text(h2);		
		
				/*    속성의 이름          속성의 값      */
		$("h1").css("background","yellow")
	})
</script>
</head>
<body>
	<h2>안녕하세요</h2>
	<h1></h1>
</body>
</html>