package tester;

import java.util.Scanner;

import com.sunbeam.exception.ExceptionLineTooLong;
import com.sunbeam.exception.StringClass;

public class Test {
	
	public static void main(String[] args) {
		
		StringClass s1 = new StringClass();
		
		
			try {
				s1.accept();
			} catch (ExceptionLineTooLong e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
		
		
		

}
}
	
