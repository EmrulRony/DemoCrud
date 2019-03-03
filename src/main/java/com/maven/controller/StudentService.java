package com.maven.controller;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.maven.model.Student;

@Stateless
public class StudentService implements StudentServiceLocal {
	@PersistenceContext
	EntityManager em;

	@Override
	public void insertStudent(Student in) {
		em.persist(in);
	}

	@Override
	public void updateStudent(Student in) {
		em.merge(in);
	}

	@Override
	public void deleteStudent(int studentID) {
		Student id = em.find(Student.class, studentID);
		em.remove(id);
		

	}

	@Override
	public List<Student> listStudent() {
		
		Query q = em.createQuery("SELECT s FROM Student s");
		return q.getResultList();
	}

}
