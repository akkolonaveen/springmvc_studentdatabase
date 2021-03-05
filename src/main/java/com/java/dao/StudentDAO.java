package com.java.dao;

import java.util.List;

import com.java.entity.Student;

public interface StudentDAO {

	public void saveStudentObj(Student std);

	public List<Student> getallstudents();

	public Student getstudentbyid(Integer studentId);

	public void deleteobj(Student stddel);

}
