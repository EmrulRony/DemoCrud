package com.maven.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maven.controller.StudentServiceLocal;
import com.maven.model.Student;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	StudentServiceLocal ss;

	Student in = new Student();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("StudentID");
		int studentid = Integer.parseInt(id);

		String studentName = request.getParameter("StudentName");

		String phone = request.getParameter("StudentNumber");
		int phoneNumber = Integer.parseInt(phone);

		String strcgpa = request.getParameter("CGPA");
		float cgpa = Float.parseFloat(strcgpa);

		String date = request.getParameter("DOB");
		Date purchaseDate = null;
		try {
			purchaseDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		} catch (ParseException ex) {
			Logger.getLogger(InsertServlet.class.getName()).log(Level.SEVERE, null, ex);
		}

		in.setStudentID(studentid);
		in.setStudentName(studentName);
		in.setContactNumber(phoneNumber);
		in.setCgpa(cgpa);

		ss.insertStudent(in);

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head><title>Data Update Completed</title></head>");
		out.println("<body>");
		out.println("<h1>Data update Completed</h1>");
		out.println("<a href='ListServlet'>Check database after update</a><br>");
		out.println("<a href='index.jsp'>Return to main page</a>");
		out.println("</body>");
		out.println("</html>");

	}

}
