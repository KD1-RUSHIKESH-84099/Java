package com.employee;

import java.util.Scanner;

public class BaseSalaried extends Employee {
	
	
	
	private double grossSales;
	private double commissionRate;
	private double baseSalary;

	@Override
	public void employeeCalculation() {
		System.out.println((grossSales * commissionRate) + baseSalary);
		
	}
	
	@Override
	public void accept() {
		// TODO Auto-generated method stub
		super.accept();
		System.out.println("Enter gross sales - ");
		grossSales = new Scanner(System.in).nextDouble();
		System.out.println("Enter commission rate - ");
		commissionRate = new Scanner(System.in).nextDouble();
		System.out.println("Enter base salary - ");
		baseSalary = new Scanner(System.in).nextDouble();
		
	}
	
	@Override
	public String toString() {
		String bscDetails = "First name = " + this.getFirstName() + " " + "last name = " + this.getLastName() + " " + "gross sales = " + this.grossSales + " " + "commissionRate = " + this.commissionRate + " " + "base salary = " + this.baseSalary;
				return bscDetails;
	}
	

	
	

}
