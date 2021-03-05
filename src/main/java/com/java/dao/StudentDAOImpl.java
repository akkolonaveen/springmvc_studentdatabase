package com.java.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.Student;

@Repository
public class StudentDAOImpl  implements StudentDAO{

	@Autowired
	private SessionFactory sf;
	public void saveStudentObj(Student std) {
		sf.getCurrentSession().saveOrUpdate(std);
		
	}
	
	public List<Student> getallstudents() {
		return sf.getCurrentSession().createQuery("from Student").list();
	
	}
	
	public Student getstudentbyid(Integer studentId) {
		Student std=(Student)sf.getCurrentSession().get(Student.class,studentId);
		return std;
	}
	
	public void deleteobj(Student stddel) {
  sf.getCurrentSession().delete(stddel);		
	}

}
