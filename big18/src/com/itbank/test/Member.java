package com.itbank.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Member
 */
@WebServlet("/Member")
public class Member extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	String admin;
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("서블릿 종료");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init();
		admin = config.getInitParameter("admin");
		System.out.println("서블릿 시작: 관리자 아이디는 " + admin);
	}
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		response.setContentType("text/html; charset=utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		PrintWriter out = response.getWriter();
		out.println("아이디는 " + id);
		out.println("비밀번호는 " + pw);		
	}
}
