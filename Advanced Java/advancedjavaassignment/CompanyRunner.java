package com.accolite.au.advancedjavaassignment;

import java.util.*;

public class CompanyRunner {
	
	public static void main(String[] args) {
			
		List<Company> companyList = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of companies");
		int num=sc.nextInt();
				
			for(int i=0;i<num;i++)
			{
			companyList.add(new Company());
			}
			
			//for a company find all employees whose age is less than 30
			System.out.println("All employees less than 30 years in a company");
			for(Company c : companyList)
			{
				for(Employee e : c.personList)
				{
					if(e.getAge() < 30)
					{
						System.out.println("{ company name : " + c.getCompanyName() + "} \n" +
								"(" + e.getEmployeeName() + ",\t"+ e.getId()+ ",\t" + e.getAge()+")\n");
					}
				}
			}
			
			
			//Find all companies in a particular city 
			System.out.println("To find companies in the city \n Enter city :");
			String city=sc.next();
			
			for(Company c : companyList)
			{
				if(c.add.getCityName().equalsIgnoreCase(city))
				{
					System.out.println("{ company name : " + c.getCompanyName() + "}");
				}
			}
			
	}

}
