package com.maven.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maven.controller.StudentServiceLocal;

public class DeleteServlete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private StudentServiceLocal ss;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String strId = request.getParameter("StudentID");
		int studentID = Integer.parseInt(strId);

		ss.deleteStudent(studentID);

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head><title>Data Deletion Completed</title></head>");
		out.println("<body>");
		out.println("<h1>Data Deletion Completed</h1>");
		out.println("<a href='ListServlet'>Check database after Deletion</a><br>");
		out.println("<a href='index.jsp'>Return to main page</a>");
		out.println("</body>");
		out.println("</html>");

	}

}
