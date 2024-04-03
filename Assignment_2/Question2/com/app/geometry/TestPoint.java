package com.app.geometry;

import java.util.Scanner;

public class TestPoint {
	public static void main(String[] args) {
		Point2D p1 = new Point2D(4,5);
		Scanner input = new Scanner(System.in);
		int p = input.nextInt();
		int q = input.nextInt();
		
		
		
		if(p1.isEqual(p, q)) {
			String s1 = p1.getDetails();
			System.out.print(s1);
			
		}else {
			double result = p1.calculateDistance(p, q);
			System.out.println(result);
		}
	}

}
