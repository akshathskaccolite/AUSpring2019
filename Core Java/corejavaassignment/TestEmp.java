package com.accolite.au.corejavaassignment;

public class TestEmp {
	public static void main(String[] args) {
		
		Manager m1 = new Manager();
		m1.getDetails();
		m1.whatWork();
		Manager.getCompanyName();
		Manager.getEmployeeCount();
		m1.outputDetails();
		double salary1=m1.calculateSalary(m1.salary,m1.taxpercent);
		m1.getSalary(salary1);
		System.out.println(" ");
		
		Developer e1 = new Developer();
		e1.getDetails();
		e1.whatWork();
		Developer.getCompanyName();
		Developer.getEmployeeCount();
		e1.outputDetails();
		salary1=e1.calculateSalary(e1.salary,e1.taxpercent);
		e1.getSalary(salary1);
		System.out.println(" ");
		
		TeamLeader t1 = new TeamLeader();
		t1.getDetails();
		t1.whatWork();
		TeamLeader.getCompanyName();
		TeamLeader.getEmployeeCount();
		t1.outputDetails();
		salary1=m1.calculateSalary(t1.salary,t1.taxpercent);
		t1.getSalary(salary1);
		System.out.println(" ");
		
		SeniorManager s1 = new SeniorManager();
		s1.getDetails();
		s1.whatWork();
		SeniorManager.getCompanyName();
		SeniorManager.getEmployeeCount();
		s1.outputDetails();
		salary1=s1.calculateSalary(s1.salary,s1.taxpercent);
		s1.getSalary(salary1);
		System.out.println(" ");
	}
}
