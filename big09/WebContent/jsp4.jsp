<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 요청 방식 --%> <%=request.getScheme() %><br>
	<%-- 웹서버의 이름 --%> <%=request.getServerName() %><br>
	<%-- 서버의 IP --%> <%=request.getLocalAddr() %><br>
	<%-- 서버의 Port --%> <%=request.getServerPort() %><br>
	<%-- 클라이언트의 소스 port 번호 --%> <%=request.getRemotePort() %><br>
	<%-- 클라이언트 주소 --%> <%=request.getRemoteHost() %><br>
	<%-- 클라이언트 주소 --%> <%=request.getRemoteAddr() %><br>
	<hr>
	<%-- 클라이언트가 요청한 문서정보 --%><%= request.getRequestURI() %><br>
	<%-- 클라이언트가 요청한 문서의 모든 정보  --%><%= request.getRequestURL() %><br>
	<%-- 프로젝트(Context) 이름 출력  --%><%= request.getContextPath() %><br>
</body>
</html>