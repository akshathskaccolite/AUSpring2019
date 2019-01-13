package com.accolite.au.corejavaassignment;

public class Developer extends Employee implements TaxCalculator{
	
	{
		//called each time object created
		System.out.println("Company Accolite - developer");
	}
	
	public Developer() {
		System.out.println(super.emp);
	}
	
	public double calculateSalary(double amount,double taxpercent) {
		System.out.println("calculating for Developer");
		amount=amount-((taxpercent/100)*amount);
		return amount;
	}
	
	void whatWork()
	{
		System.out.println("Developer");
	}

}