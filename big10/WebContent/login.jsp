<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String dbId = "root";
	String dbPw = "1234";
	if(id.equals(dbId) && pw.equals(dbPw)){
		session.setAttribute("id", id);
		/* setAttribute할 때,
		   session 속성의 이름은 String 타입
		   session 속성의 값은 Object 타입 (자동 형변환, UpCasting)*/
	}else{
		response.sendRedirect("login.html");
	}
	%>
	%{id}
	
	<%
	String sId = (String)session.getAttribute("id"); /* id에 대한 값 가져오기 (DownCasting 필요) */	
	%>
	<a href="login2.jsp">asd</a>
</body>
</html>