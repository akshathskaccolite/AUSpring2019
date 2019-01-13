package com.accolite.au.corejavaassignment;

public class TeamLeader extends Employee implements TaxCalculator{
	
	{
		//called each time object created
		System.out.println("Company Accolite - Team Leader");
	}
	
	public TeamLeader() {
		System.out.println(super.emp);
	}
	
	public double calculateSalary(double amount,double taxpercent) {
		System.out.println("calculating for Team Leader");
		amount=amount-((taxpercent/100)*amount);
		return amount;
	}
	
	void whatWork()
	{
		System.out.println("Team Leader");
	}

}