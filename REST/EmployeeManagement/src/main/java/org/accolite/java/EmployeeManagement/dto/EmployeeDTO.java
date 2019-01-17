package org.accolite.java.EmployeeManagement.dto;

public class EmployeeDTO {
	
	private String empName;
	private String empId;
	private int age;
	
	public EmployeeDTO(String empName,String empId,int age) {
		this.empName=empName;
		this.empId=empId;
		this.age=age;
	}
	
	public EmployeeDTO()
	{
		
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
