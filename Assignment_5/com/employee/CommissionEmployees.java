package com.employee;

import java.util.Scanner;

public class CommissionEmployees extends Employee {
	
	private double grossSales;
	private double commissionRate;
	
	
	
	

	@Override
	public void employeeCalculation() {
		System.out.println(commissionRate * grossSales);
		
	}
	
	@Override
	public void accept() {
		// TODO Auto-generated method stub
		super.accept();
		System.out.println("gross sales is - ");
		grossSales = new Scanner(System.in).nextDouble();
		System.out.println("commissionRate is - ");
		commissionRate = new Scanner(System.in).nextDouble();
	}
	
	@Override
	public String toString() {
		String ceDetails = "First name = " + this.getFirstName() + " " + "last name = " + this.getLastName() + " " + "gross sales = " + this.grossSales + " " + "commissionRate = " + this.commissionRate;
				return ceDetails;
	}
	
	
	
	
	

}
