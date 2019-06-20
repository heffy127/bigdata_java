<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	MemberDAO dao = new MemberDAO();
	String id = request.getParameter("id");
	String dbId = dao.selectId(id);
	if(dbId==null || dbId.trim().equals("")){
		out.write("존재하지 않는 아이디");
	}else{
		out.write(dbId +"는 존재하는 아이디");
	}
%>
