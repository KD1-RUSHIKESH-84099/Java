package com.sunbeam.exception;
import java.util.Scanner;

public class StringClass {
	
	private String s;
	
	public void accept() throws ExceptionLineTooLong{
		Scanner input = new Scanner(System.in);
		s = input.nextLine();
		if(s.length() <= 80) {
			System.out.println(s.length());
		}
		else {
			throw new ExceptionLineTooLong("length is too long");
		}
	}
	
	
	
	

}
