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
			String id = request.getParameter("id"); // 괄호 안 name으로 넘어온 파라미터 값 받아줌
			String pw = request.getParameter("pw"); // 괄호 안 name으로 넘어온 파라미터 값 받아줌
			String name = request.getParameter("name"); // 괄호 안 name으로 넘어온 파라미터 값 받아줌
			String tel = request.getParameter("tel"); // 괄호 안 name으로 넘어온 파라미터 값 받아줌		
			String[] hobby = request.getParameterValues("hobby");
			out.print("취미리스트 입니다." + "<br>");
			for(int i = 0 ; i < hobby.length ; i++){
				out.print(hobby[i] + "<br>"); // out.print => 브라우저에 찍으라는 얘기
			}
		%>
		받아온 Parameter 값
		<hr>
		ID : <%= id %><br>
		PW : <%= pw %><br>
		NAME : <%= name %><br>
		TEL : <%= tel %><br>
		음식 : <%=request.getParameter("food") %> <br>
		성별 : ${param.gender} <br>
	</body>
</html>