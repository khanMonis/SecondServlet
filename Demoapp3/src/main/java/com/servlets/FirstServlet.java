package com.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {

///life cycle methods:

	ServletConfig conf;

	public void init(ServletConfig conf) {
		this.conf = conf;
		System.out.println("creating object:....");
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servicing:....");

	}

	public void destroy() {
		System.out.println("going to destroy servlet object");
	}

	/// non life cycle method
	public ServletConfig getservletConfig() {
		return this.conf;
	}

	public String getServletInfo() {
		return "this servlet is created by Monis Khan";
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

}