package com.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculatorServlet
 */
public class calculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public calculatorServlet() {
        super();
        
 }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int total = i+j;
		
		PrintWriter out = response.getWriter();
		
		out.println("<h1>Calculator Page</h1>");
		out.println("<h3>Result = "+ i + "+" + j + "=" + total+"</h3>");
		
	}


}
