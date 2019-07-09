package com.itbank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String driver;
	

    public Hello() {
        super();
        System.out.println("Hello");
    }

	public void init(ServletConfig config) throws ServletException { 
		driver = config.getInitParameter("driver"); // init-param 이름과 같아야함
		System.out.println("init");
	}

	public void destroy() {
		System.out.println("destoy");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("your driver : " + driver);
		System.out.println("doget");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}


