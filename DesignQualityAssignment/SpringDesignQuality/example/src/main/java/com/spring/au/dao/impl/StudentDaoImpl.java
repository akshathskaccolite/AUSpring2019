package com.spring.au.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.au.dao.interfaces.StudentDaoInter;
import com.spring.au.model.Student;
import com.spring.au.rowmapper.RowMaps;

@Repository
public class StudentDaoImpl implements StudentDaoInter {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public String getName() {
		
		return jdbcTemplate.queryForObject("select name from student where id=20", String.class);
	}

	public void insert(Student student) {
		jdbcTemplate.update("insert into student values ("+student.getStudentId()+", '"+student.getStudentName() +"'); ");	
	}
	
	public List<Student> getAllStudents() {
		RowMaps rowMap = new RowMaps();
		return jdbcTemplate.query("select * from student", rowMap);
	}

}
