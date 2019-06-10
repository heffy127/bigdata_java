<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="dto" class="bean.MemberDTO"/>
	<jsp:setProperty property="*" name="dto"/>
	<%
	Class.forName("com.mysql.jdbc.Driver");
	out.write("드라이버 설정 ok");
	
	String url="jdbc:mysql://localhost:3306/bigdata";
	String user="root";
	String password="1234";
	String sql = "insert into member values(?,?,?,?)";
	
	Connection con = DriverManager.getConnection(url, user, password);
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, dto.getId());
	ps.setString(2, dto.getPw());
	ps.setString(3, dto.getName());
	ps.setString(4, dto.getTel());
	ps.executeUpdate();
	%>
</body>
</html>