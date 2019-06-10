<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 선언문 -->
	<%!
	String name; /* 전역변수는 자동 초기화가 되서 null값 들어가있음 */
	
	public String test(){
		return 1000 + "원";
	}
	%>
	
	<!-- 스크립트 릿 -->
	<%
	/* PrintWriter out = new PrintWriter(); */
	String test = ""; /* 지역변수는 필히 초기화를 시켜주어야 함 */
	out.print(100+200);
	%>
	
	<!-- 표현식 -->
	<%= 100 + 200 %><br>
	<%=name %>, <%=test %><br>
	<%=test() %>
</body>
</html>