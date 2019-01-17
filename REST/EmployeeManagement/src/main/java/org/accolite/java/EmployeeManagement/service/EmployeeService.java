package org.accolite.java.EmployeeManagement.service;

import java.util.*;

import org.accolite.java.EmployeeManagement.dto.EmployeeDTO;


public class EmployeeService {
	
	static List<EmployeeDTO> employee = new ArrayList<>();
	
	public EmployeeService() {
		employee.add(new EmployeeDTO("ABC","E101",21));
		employee.add(new EmployeeDTO("DEF","E102",23));
		employee.add(new EmployeeDTO("HIJ","E103",25));
	}
	
	public List<EmployeeDTO> getAllEmployee() {
		return employee;
	}
	
	public EmployeeDTO getById(String id) {
		
		for(EmployeeDTO e:employee)
		{
			if(e.getEmpId().equals(id))
			{
				return e;
			}
		}
		
		return null;
		
	}
	
	public void updateEmp(EmployeeDTO emp) {
		
		for(EmployeeDTO e:employee)
		{
			if(e.getEmpId().equals(emp.getEmpId()))
			{
				e.setEmpName(emp.getEmpName());
				e.setAge(emp.getAge());
			}
		}
		
	}
	
	public void insert(EmployeeDTO emp){
		employee.add(emp);
	}
	
	
	void delete(String id) {
		for(EmployeeDTO e:employee)
		{
			if(e.getEmpId().equals(id))
			{
				employee.remove(e);
			}
		}
	}

}
