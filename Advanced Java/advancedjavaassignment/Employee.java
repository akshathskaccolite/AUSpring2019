package com.accolite.au.advancedjavaassignment;

import java.util.*;

public class Employee {
	
	String employeeName;
	int id; 
	int age;
	
	public Employee(String employeeName,int id,int age)
	{
		this.employeeName=employeeName;
		this.id=id;
		this.age=age;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

}
