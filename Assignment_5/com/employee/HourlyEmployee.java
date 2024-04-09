package com.employee;

import java.util.Scanner;

public class HourlyEmployee extends Employee {

	
	private double wage;
	private int hours;
	
	
	
	@Override
	public void accept() {
		// TODO Auto-generated method stub
		super.accept();
		System.out.println("Enter wage - ");
		wage = new Scanner(System.in).nextDouble();
		System.out.println("Enter hours - ");
		hours = new Scanner(System.in).nextInt();
	}
	
	@Override
	public void employeeCalculation() {
		if(hours <= 40) {
			System.out.println(wage * hours);
		}
		else if (hours > 40) {
			System.out.println(40 * wage + (hours - 40) * wage * 1.5);	
		}
		
		
		
	}
	
	@Override
	public String toString() {
		String heDetails = "First name = " + this.getFirstName() + " " + "last name = " + this.getLastName() + " " + "hourly wage = " + this.wage + " " + "hours = " + this.hours;
				return heDetails;
	}
	
	
	
	

}
