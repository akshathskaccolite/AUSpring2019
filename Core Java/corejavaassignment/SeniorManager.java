package com.accolite.au.corejavaassignment;

public class SeniorManager extends Employee implements TaxCalculator{
	
	{
		//called each time object created
		System.out.println("Company Accolite - Senior Manager");
	}
	
	public SeniorManager() {
		System.out.println(super.emp);
	}
	
	public double calculateSalary(double amount,double taxpercent) {
		System.out.println("calculating for Senior Manager");
		amount=amount-((taxpercent/100)*amount);
		return amount;
	}
	
	void whatWork()
	{
		System.out.println("Senior Manager");
	}

}