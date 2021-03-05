package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.entity.Student;
import com.java.service.StudentService;

@Controller
public class StudentController {
    @Autowired
	private StudentService studentService;
	
	@RequestMapping("/addstudent")
	public String displayform(Model model)
	{
		Student stud=new Student();
		model.addAttribute("st",stud);
		return "AddStudent";
		
	}
    @RequestMapping("/saveprocess")
	public String saveprocess(@ModelAttribute("st") Student std,Model mod)
	{
		studentService.saveStudentObj(std);
		List<Student> list=studentService.getallstudents();
    	mod.addAttribute("stdlst",list);
		return "ListStudents";
	}
    @RequestMapping("/liststudents")
    public String getallstudents(Model mod) {
    	List<Student> list=studentService.getallstudents();
    	mod.addAttribute("stdlst",list);
    	return "ListStudents";
    	
		
	}
    
    @RequestMapping("/updateform")
    public  String updateform(@RequestParam("studentId") Integer student,Model mod) {
    Student st1=findbyid(student);
    mod.addAttribute("st",st1);
    	return "AddStudent";
		
	}
    @RequestMapping("/deleteform")
    public String delete(@RequestParam("studentId") Integer std)
    {
    	Student stddel=findbyid(std);
    	studentService.deleteobj(stddel);
    	return "redirect:/liststudents";
    }
    
    
    
    private  Student findbyid(Integer studentId)
    {
    	Student st=(Student)studentService.getstudentobj(studentId);
    	return st;
    }
    
    
}
