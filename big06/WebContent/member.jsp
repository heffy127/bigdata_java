<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<!-- 선언문: 전역변수 사용, 메소드 정의 (사용빈도 낮음) -->
	<%!
	
	%>
	<!-- 스크립트 릿: 자바코드가 들어가는 부분 (service()) => 지역변수 -->
	<!-- 메소드 정의 불가. 전역변수 사용 불가. -->
	<%
	/* HttpServletRequest request = new HttpServletRequest(); */
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");	
	String[] hobby = request.getParameterValues("hobby");
	String result = "";
	for(int i = 0; i < hobby.length; i++){
		result = result + hobby[i] + "  ";
	}
	%>
	<h3>당신이 입력한 정보는 아래와 같습니다.</h3>
	<hr color="red">
	아이디 : <%=id %><br>	<!-- 표현식(Expression) : 변수값 출력, 연산 결과, 메소드 호출 반환 값  -->
	비밀번호 : <%=pw %><br>
	이름 : <%=name %><br>
	전화번호 : <%=tel %><br>
	Hobby: <%= result%><br>
	표현식 연산 <%=100 + 200 %>
</body>
</html>