package com.accolite.au.corejavaassignment;

import java.util.*;

public abstract class Employee {
	
	static {
		//called only once before main
		System.out.println("Company Accolite");
	}
	
	public String emp;
	
	public Employee(){
		emp="I am an employee";		
	}
	
	private static int count;
	static final String companyname = "Accolite";
	String name=new String();
	String dept=new String();
	double salary;
	double taxpercent;
	
	void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name"); 
 		name = sc.nextLine();  
 		System.out.println("Enter a dept"); 
 		dept = sc.nextLine(); 
 		try{
 			System.out.println("Enter a salary"); 
 			salary = sc.nextDouble(); 
 			System.out.println("Enter tax percent");
 			taxpercent=sc.nextDouble();
 		}catch (InputMismatchException e) {
            System.out.println("You have entered invalid data");
        }
 		finally {
 			System.out.println("finally block is always executed");
 		}
	}
	
	static void getCompanyName() {
		System.out.println(companyname);
	}
	
	static void getEmployeeCount() {
		System.out.println("Employee count " + ++count);
	}
	
	abstract void whatWork();
	
	void getSalary(double salary) {
		System.out.println(salary);
	}
	
	void outputDetails()
	{
		System.out.println("Employee name: "+ name);
		System.out.println("Employee department: "+ dept);
	}
}

