package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.dao.StudentDAO;
import com.java.entity.Student;
@Service
public  class StudentServiceImpl  implements StudentService{

	@Autowired
	private StudentDAO studentDAO;
	
	@Transactional
	public void saveStudentObj(Student std) {
		studentDAO.saveStudentObj(std);
		
		
	}

	
	@Transactional
	public List<Student> getallstudents() {
		// TODO Auto-generated method stub
		return studentDAO.getallstudents();
	}


	@Transactional
	public Student getstudentobj(Integer studentId) {
		return studentDAO.getstudentbyid(studentId);
		
	}

	
	@Transactional
	public void deleteobj(Student stddel) {
   studentDAO.deleteobj(stddel);		
	}

}
