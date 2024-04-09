package com.employee;

import java.util.Scanner;

public class SalariedEmployee extends Employee {

	private double salary;
	
	@Override
	public void accept() {
		// TODO Auto-generated method stub
		super.accept();
		System.out.println("Enter weekly salary");
		salary = new Scanner(System.in).nextDouble();
	}
	
//	public String toString() {
//		String seDetails = "First name = " + this.getFirstName() + " " + "last name = " + this.getLastName() + " " + "weekly salary = " + this.salary;
//				return seDetails;
//	}
//	
	
	@Override
	public void employeeCalculation() {
		System.out.println(salary);
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		String seDetails = "First name = " + this.getFirstName() + " " + "last name = " + this.getLastName() + " " + "weekly salary = " + this.salary;
				return seDetails;
	}
	
     

}
