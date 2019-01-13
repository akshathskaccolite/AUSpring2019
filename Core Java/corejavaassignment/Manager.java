package com.accolite.au.corejavaassignment;

public class Manager extends Employee implements TaxCalculator{
	
	{
		//called each time object created
		System.out.println("Company Accolite - manager");
	}
	
	public Manager() {
		System.out.println(super.emp);
	}
	
	public double calculateSalary(double amount,double taxpercent) {
		System.out.println("calculating for Manager");
		amount=amount-((taxpercent/100)*amount);
		return amount;
	}
	
	void whatWork()
	{
		System.out.println("Manager");
	}

}
