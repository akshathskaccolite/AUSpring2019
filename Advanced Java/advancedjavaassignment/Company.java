package com.accolite.au.advancedjavaassignment;

import java.util.*;

public class Company {
	
	
	public String companyName;
	public Address add=new Address();
	TreeSet<Employee> personList = new TreeSet<>( new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) { 
        	
            int NameCompare = e1.getEmployeeName().compareTo(e2.getEmployeeName());
            Integer a = new Integer(e1.getAge());
            Integer b = new Integer(e2.getAge());
            int AgeCompare = a.compareTo(b); 
   
            if (NameCompare == 0) { 
                return ((AgeCompare == 0) ? NameCompare : AgeCompare); 
            } else { 
                return NameCompare; 
            } 
        }
	});
	
	Scanner sc = new Scanner(System.in);
	String employeeName;
	int id;
	int age;
	
	public Company()
	{
		setDetails();
		setEmployeeDetails();
		getDetails();
		getEmployeeDetails();
	}	
	
	public void setDetails() {
		
 		System.out.println("Enter Company Name"); 
 		companyName = sc.nextLine();
 		System.out.println("Enter Country Name");
 		add.setCountryName(sc.nextLine());
 		System.out.println("Enter State Name");
 		add.setStateName(sc.nextLine());
 		System.out.println("Enter City Name");
 		add.setCityName(sc.nextLine());
 		System.out.println("Enter Street Name");
 		add.setStreetName(sc.nextLine());
 		System.out.println("Enter Pin Code");
 		add.setPinCode(sc.nextLine());
 		
	}
	
	public void setEmployeeDetails()
	{
		System.out.println("\nEnter number of employees in this company");
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println(" ");
			System.out.println("Enter employee name"); 
			employeeName = sc.next();	
			System.out.println("Enter employee id"); 
			id = sc.nextInt();	
			System.out.println("Enter employee age"); 
			age = sc.nextInt();
			
		    personList.add(new Employee(employeeName,id,age));
	
		}
	}
	
	public void getDetails()
	{
		System.out.println(	"{ company name : " + String.valueOf(companyName) + "} \n" + 
				"\n{ company address : " + add.getCountryName() + ",\t" + add.getStateName() +
				",\t" +add.getCityName()+ ",\t" + add.getStreetName()+ ",\t" + add.getPinCode() + "}\n");;
	}
		
	public void getEmployeeDetails()
	{
		System.out.println("{ Employee Details }\n");
		for(Employee e : personList)
		{	
			System.out.println( "(" + e.getEmployeeName() + ",\t"+ e.getId()+ ",\t" + e.getAge()+")\n");
		}
	}

	public String getCompanyName() {
		return companyName;
	}
	

}
