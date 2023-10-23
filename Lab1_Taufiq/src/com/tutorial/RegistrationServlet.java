package com.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String course = request.getParameter("course");
        String gender = request.getParameter("gender");
        String[] languages = request.getParameterValues("languages");
        String[] transportation = request.getParameterValues("transportation");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String email = request.getParameter("email");

        out.println("<html><head><title>Registration</title></head><body>");
        out.println("<h1>Registration Submitted</h1>");
        out.println("<p>First Name: " + firstName + "</p>");
        out.println("<p>Last Name: " + lastName + "</p>");
        out.println("<p>Course: " + course + "</p>");
        out.println("<p>Gender: " + gender + "</p>");
        out.println("<p>Languages: " + (languages != null ? String.join(", ", languages) : "None") + "</p>");
        out.println("<p>Transportation: " + (transportation != null ? String.join(", ", transportation) : "None") + "</p>");
        out.println("<p>Phone: " + phone + "</p>");
        out.println("<p>Current Address: " + address + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("</body></html>");
	}

}
