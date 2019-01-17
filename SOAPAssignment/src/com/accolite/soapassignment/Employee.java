package com.accolite.soapassignment;

public class Employee {
	
	
	int id;
	String name;
	String Department;
	int age;
	
	
	public Employee(int id, String name, String department, int age) {
		this.id = id;
		this.name = name;
		Department = department;
		this.age = age;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
		
}
