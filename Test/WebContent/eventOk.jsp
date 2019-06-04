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
<%
	String[] hope = request.getParameterValues("hope");
	
%>
	<div align="center">
		<h1 id="title">
			<b>중고장터</b>
		</h1>
		<img src="logo.png" id="logo" align="left">

		<hr width="700" size="10" color="blue">
		<div align="left" id="top">
			<ul>
				<li><a href="main.html">회사소개</a></li>
				<li><a href="site1.html">계정확인</a></li>
				<li><a href="site2.html">판매품목</a></li>
				<li><a href="site3.html">행사안내</a></li>
				<li><a href="site4.html">홍보영상</a></li>
			</ul>
		</div>
		<div id="top2">
			<ul>
				<li><a href="main.html">회사소개</a></li>
				<li><a href="site1.html">계정확인</a></li>
				<li><a href="site2.html">판매품목</a></li>
				<li><a href="site3.html">행사안내</a></li>
				<li><a href="site4.html">홍보영상</a></li>
			</ul>
		</div>
		<div align="center">
			<h1>제3회 중고장터 오프라인 한마당</h1>
			<img src="event.jpeg" width="500" height="310">
			<p>
				중고장터 회원분들을 위한 오프라인 행사를 진행합니다.<br> 오프라인 직거래 부스에서 안전하게 직거래 하시고<br>
				다양한 공연과 전시회, 먹거리가 준비되어 있으니<br> 참가하실 회원님께서는 아래의 <b>신청서</b>를
				작성해주세요.<br> 많은 참여 바랍니다.
			</p>
			<hr width="300" size="3" color="brown">
		</div>
		<div align="center">
			<table border="1" bordercolor="red" id="eventT">
				<caption>
					<h3>
						<b>신청이 완료되었습니다.</b>
					</h3>
				</caption>
				<tr>
					<td>이메일</td>
					<td>${param.email }</td>
				</tr>
				<tr>
					<td>판매부스 대여</td>
					<td>${param.booth }</td>
				</tr>
				<tr>
					<td>기대되는것</td>
					<td><%for(int i = 0; i < hope.length; i++){
							out.print(hope[i] + " ");
					}
						%></td>
				</tr>
			</table>
		</div>
		<hr width="700" size="10" color="red">
		중고장터<br> 주소 : 서울특별시 금천구 벚꽃로 244 벽산디지털밸리5차 <br> 연락처 :
		033)123-5678<br> <a href="mailto:admin@joonggo.co.kr">이메일 보내기</a><br>
	</div>
</body>
</html>