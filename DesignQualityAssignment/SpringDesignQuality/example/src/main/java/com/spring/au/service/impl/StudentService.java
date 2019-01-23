package com.spring.au.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.au.dao.impl.StudentDaoImpl;
import com.spring.au.model.Student;
import com.spring.au.service.interfaces.StudentServiceInter;

@Service
public class StudentService implements StudentServiceInter{
	
	@Autowired
	StudentDaoImpl studentDao;
	
	public String getName() {
		return studentDao.getName();
	}

	public void insert(Student student) {
		studentDao.insert(student);
	}
	
	public List<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}

}
