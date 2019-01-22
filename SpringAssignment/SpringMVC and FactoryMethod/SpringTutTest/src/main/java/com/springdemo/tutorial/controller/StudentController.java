package com.springdemo.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springdemo.tutorial.Student;

@Controller
public class StudentController {

	@RequestMapping(value = "/getStudent", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Student getStudent() {
		Student student = new Student();
		student.setStudentId(15);
		student.setStudentName("Accolite");
		return student;
	}

	@RequestMapping(value = "/getStudent/{id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Student getStudent(@PathVariable("id") int id) {
		Student student = new Student();
		student.setStudentId(id);
		student.setStudentName("XYZ");
		return student;
	}

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student", "command", new Student());
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") Student student, ModelMap model) {
		System.out.println(student.getStudentName() + ":" + student.getStudentId());
		return "result";
	}

}
