package com.itbank.test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextTest implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("context 종료");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("context 시작");

	}

}
