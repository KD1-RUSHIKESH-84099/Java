package com.employee;

import java.util.Scanner;

public abstract class Employee implements Acceptable  {
	
	
	
	private String firstName;
	private String lastName;
	private int ssn;
	
	
	
	
	
//	public double getSalary() {
//		return salary;
//	}
//
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public abstract void employeeCalculation();
	
	@Override
	public void accept() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name - ");
		firstName = new Scanner(System.in).next();
		System.out.println("Enter last name - ");
		lastName = new Scanner(System.in).next();
		System.out.println("Enter ssn - ");
		ssn = new Scanner(System.in).nextInt();
		
		
		
	}
	
	
		
	

}
