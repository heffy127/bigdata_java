<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function () {
			$.ajax({
				url: "json/test2.json",
				dataType: "json",
				success: function (result) {
					alert("json문서 연결 성공")
					var list = result.student;
					if(list.length > 0){
						$(list).each(function (index, member) {	
							var id = member.id
							var name = member.name
							var tel = member.tel
							$.ajax({
								url: "jsondb2.jsp",
								data: {
									//이름       value
									"id" : id,
									"name" : name,
									"tel" : tel
								},
								success: function () {
									console.log("ok")
								}

							})
						})
					}
					
				}
			})
		})
	</script>
</head>

<body>
	인기검색어 순위
	<hr>
	<div id="div">
	</div>
</body>

</html>