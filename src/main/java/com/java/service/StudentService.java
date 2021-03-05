package com.java.service;

import java.util.List;

import com.java.entity.Student;

public interface StudentService {

	public void saveStudentObj(Student std);

	public List<Student> getallstudents();

	public  Student getstudentobj(Integer studentId);

	public void deleteobj(Student stddel);

	

}
