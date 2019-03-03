package com.maven.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maven.controller.StudentServiceLocal;
import com.maven.model.Student;


public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private StudentServiceLocal ss;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Student> event = null;

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head><title>List Of Student</title></head>");
		out.println("<body>");
		out.println("<table id=\"personListTable\" border=\"3\">");
		out.println("");
		out.println("<tr>");
		out.println("<th bgcolor=>Student Id</th>");
		out.println("<th bgcolor=>Student Name</th>");
		out.println("<th bgcolor=>Contact Number</th>");
		out.println("<th bgcolor=>Birthdate</th>");
		out.println("<th bgcolor=>CGPA</th>");

		out.println("</tr>");
		for (Student result : event) {

			out.println("<tr>");
			out.println("<td>" + result.getStudentID() + "</td>");
			out.println("<td>" + result.getStudentName() + "</td>");
			out.println("<td>" + result.getContactNumber() + "</td>");
			out.println("<td>" + result.getDob() + "</td>");
			out.println("<td>" + result.getCgpa() + "</td>");
			out.println("</tr>");

		}

	}
}
