package com.maven.controller;

import java.util.List;

import javax.ejb.Local;

import com.maven.model.Student;

@Local
public interface StudentServiceLocal {
	public void insertStudent(Student in);

	public void updateStudent(Student in);

	public void deleteStudent(int studentID);

	public List<Student> listStudent();

}
