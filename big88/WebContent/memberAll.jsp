<%@page import="bean.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="dao" class="bean.MemberDAO"></jsp:useBean>
	<%
		// dao중에서 전체리스트를 가지고 오는
		// 메소드를 호출
		// 반복문으로 테이블 안에 있는 tr태그내에 집어넣는다
		ArrayList<MemberDTO> list = dao.selectAll();
		MemberDTO dto;
	%>
	<div align="center">
		<table border="1" bordercolor="red" width="600">

			<tr align="center">
				<td>아이디</td>
				<td>패스워드</td>
				<td>이 름</td>
				<td>연락처</td>
			</tr>
			<%
				for (int i = 0; i < list.size(); i++) {
					dto = list.get(i);
			%>
			<tr align="center">
				<td><a href="find.jsp?id=<%=dto.getId()%>"><%=dto.getId()%></a></td>
				<td><%=dto.getPw()%></td>
				<td><%=dto.getName()%></td>
				<td><%=dto.getTel()%></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>


</body>
</html>