<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>중고장터</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<script type="text/javascript" src="js1.js"></script>
</head>
<body>
	<div align="center">
		<h1 id="title">
			<b>중고장터</b>
		</h1>
		<img src="logo.png" width="100" height="100" id="logo">
		<hr width="700" size="10" color="blue">
		<div align="left" id="top">
			<ul>
				<li><a href="main.html">회사소개</a></li>
				<li><a href="site1.html">계정확인</a></li>
				<li><a href="site3.html">판매품목</a></li>
				<li><a href="site5.html">행사안내</a></li>
				<li><a href="site4.html">홍보영상</a></li>
			</ul>
		</div>
		<div id="top2">
			<ul>
				<li><a href="main.html">회사소개</a></li>
				<li><a href="site1.html">계정확인</a></li>
				<li><a href="site3.html">판매품목</a></li>
				<li><a href="site5.html">행사안내</a></li>
				<li><a href="site4.html">홍보영상</a></li>
			</ul>
		</div>
			<h1>환영합니다 ${param.id }님</h1>
			<table border=1 id="account">
				<tr>
					<td> 아이디 </td>
					<td>  ${param.id } </td>
				</tr>
				<tr>
					<td> 비밀번호 </td>
					<td>  ${param.pw } </td>
				</tr>
				<tr>
					<td> 이메일 </td>
					<td>  park@java.co.kr </td>
				</tr>
				<tr>
					<td> 거래횟수 </td>
					<td>  15 </td>
				</tr>
			</table>
		<hr width="700" size="10" color="red">

		중고장터<br> 주소 : 서울특별시 금천구 벚꽃로 244 벽산디지털밸리5차 <br> 연락처 :
		033)123-5678<br> <a href="mailto:admin@joonggo.co.kr">이메일 보내기</a><br>
	</div>
</body>
</html>