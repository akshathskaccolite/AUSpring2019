package com.accolite.soapassignment;

public class Inter {
	
	public String insertEmp(int id, String name, String department, int age) {
		return Runner.insertEmp(id,name,department,age);
	}
	
	public String updateEmp(int id, String name, String department, int age) {
		return Runner.updateEmp(id,name,department,age);
	}
	
	public String deleteEmp(int id) {
		return Runner.deleteEmp(id);
	}
	
	public static String getEmp(int id) {
		return Runner.getEmp(id);
	}
	
	public String getAllEmp() {
		return Runner.getAllEmp();
	}

}