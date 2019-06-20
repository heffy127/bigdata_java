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
		$(":text").css("border", "2px dotted red")
		
		/* check 된것만 가져오기 (false로 바꾸기)*/
		/* tag 사이의 속성을 변경하거나 가져올때 */
		$(":checked").attr("checked",false)
		$(":selected").attr("selected",false)

	})
</script>
</head>
<body>
	이름 <input type="text" value="홍길동"><br>
	소속 <input type="text" value="kg"><br>
	아침을 먹었나요 <input type="checkbox" value="yes" checked="checked">네<input type="checkbox" value="no">아니요 <br>
	먹은음식종류<select id="food">
		<option value="짜장면">짜장면</option>
		<option value="짬뽕" selected="selected">짬뽕</option>
	</select>
</body>
</html>