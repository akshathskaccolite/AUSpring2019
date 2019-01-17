package com.accolite.soapassignment;
import java.util.*;

public class Runner {
	
	public static List<Employee> emp=new ArrayList<>();
	public static String s ="";
	
	public static String insertEmp(int id, String name, String department, int age) {
		emp.add(new Employee(id,name,department,age));
		return "added";
	}
	
	public static String updateEmp(int id, String name, String department, int age) {
		for(Employee e:emp)
		{
			if(id==e.getId())
			{
				e.setAge(age);
				e.setDepartment(department);
				e.setName(name);
				return "updated";
			}
		}
		return "not found";
	}
	
	public static String deleteEmp(int id) {
		for(Employee e:emp)
		{
			if(id==e.getId())
			{
				emp.remove(e);
				return "deleted";
			}
		}
		return "not found";
	}
	
	public static String getEmp(int id) {
		for(Employee e:emp)
		{
			if(id==e.getId())
			{
				//return e;
				return "name :"+e.getName()+" id :"+e.getId()+" age :"+e.getAge()+" department :"+e.getDepartment(); 
			}
		}
		return null;
	}
	
	public static String getAllEmp() {
		s="";
		for(Employee e:emp)
		{
			s += "name :"+e.getName()+" id :"+e.getId()+" department :"+e.getDepartment()+" age :"+e.getAge()+"\n"; 
		}	
		return s;
	}
}