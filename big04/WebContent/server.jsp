<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="style2.css" />
	</head>
	<body>
		<div id="total" align="center">
			<div id="top" align="left">
				<ul>
					<li><a href="css1.html">회사소개</a></li>
					<li><a href="css2.html">회사제품</a></li>
					<li><a href="css3.html">게시판</a></li>
					<li><a href="css4.html">회사연락처</a></li>
				</ul>
			</div>
			<div id="top2" >
				<ul>
					<li><a href="css1.html">회사소개</a></li>
					<li><a href="css2.html">회사제품</a></li>
					<li><a href="css3.html">게시판</a></li>
					<li><a href="css4.html">회사연락처</a></li>
				</ul>
			</div>
			<div id="title" align="center">
				당신의 회원정보 입니다.
			</div>
			<div id="content" align="center">
				<table border="1" bordercolor="#f9f9d4">
					<tr>
						<th class="t1">아이디</th>
						<td class="t2">${param.id }</td>
					</tr>
					<tr>
						<th class="t1">패스워드</th>
						<td class="t2">${param.pw }</td>
					</tr>
					<tr>
						<th class="t1">이름</th>
						<td class="t2">${param.name }</td>
					</tr>
					<tr>
						<th class="t1">전화번호</th>
						<td class="t2">${param.tel }</td>
					</tr>
				</table>
			</div>
		</div>
	</body>
</html>