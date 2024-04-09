package tester;

import java.util.Scanner;

import com.employee.BaseSalaried;
import com.employee.CommissionEmployees;
import com.employee.Employee;
import com.employee.HourlyEmployee;
import com.employee.SalariedEmployee;

public class Test {
	
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		int choice;
		int choice1;
		do {
			
			System.out.println("1. SELECT WHICH CALCULATION OF EMPLOYEE YOU WANT");
			System.out.println("2. EXIT");
			 choice = input.nextInt();
			
			switch(choice) {
			case 1:  
				
				System.out.println("1. SALARIED EMPLOYEE");
				System.out.println("2. HOURLY EMPLOYEE");
				System.out.println("3. COMMISSION EMPLOYEE");
				System.out.println("4. BASE-SALARIED COMMISSION EMPLOYEE");
				System.out.println("ENTER YOUR CHOICE");
				choice1 = input.nextInt();
				
			switch(choice1) {
			
			case 1 : 
				Employee se = new SalariedEmployee();
				se.accept();
				System.out.println(se.toString());
				se.employeeCalculation();
				break;
				
			case 2:
				
				Employee he = new HourlyEmployee();
				he.accept();
				System.out.println(he.toString());
				he.employeeCalculation();
				break;
				
			case 3: 
				
				Employee ce = new CommissionEmployees();
				ce.accept();
				System.out.println(ce.toString());
				ce.employeeCalculation();
				break;
				
			case 4:
				
				Employee bsc = new BaseSalaried();
				bsc.accept();
				System.out.println(bsc.toString());
				bsc.employeeCalculation();
				break;
				
				
				
			
			}
			break;
			
			
			case 2 : 
				System.out.println("Thank you");
				return;
				
			
			
				
				
				
			}
			
			
			
		}while(choice != 2);
	}

}
