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
				url: "xml/dataset.xml",
				dataType: "xml",
				success: function (result) {
					alert("xml문서 연결 성공")
					//                             태그이름 찾기
					/*				alert($(result).find("rank").length);		*/
					if ($(result).find("record").length > 0) {
						//rank를 하나씩 돌리기
						$(result).find("record").each(function () {
							/* alert($(this).find("name").text())
							alert($(this).find("tel").text()) */
							var name = $(this).find("first_name").text()
						$("#div").append(name + "<br>")
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