package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {
	
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int choice;
			int n = input.nextInt();
			int p = input.nextInt();
			int q = input.nextInt();
			Point2D pointArr[] = new Point2D[n];
			int arr[] = new int[n];
			for(int i = 0; i < n ;i ++ ) {
				int a = input.nextInt();
				int b = input.nextInt();
				pointArr[i] = new Point2D(a,b);
				
			}
			
			
			
			do {
				System.out.println("1.Display details of specific point");
				System.out.println("2.Display x,y co-ordinateso of all points");
				System.out.println("3.validate the indices");
				System.out.println("4. Exit");
				System.out.println("Enter your choice");
				choice = input.nextInt();
				
				switch(choice) {
				
				case 1 : 
					int index;
				    System.out.println("Enter index of the point:");
				    index = input.nextInt();
				    if (index >= 0 && index < pointArr.length) {
				        System.out.println(pointArr[index].getDetails());
				    } else {
				        System.out.println("Invalid index.");
				    }
				    break;
				    
				    
				case 2:
					
					for(int i = 0 ;i < pointArr.length; i ++) {
						System.out.println(pointArr[i].getDetails());
					}
					break;
					
				case 3:
					 int index1, index2;
	                    System.out.println("Enter first index:");
	                    index1 = input.nextInt();
	                    System.out.println("Enter second index:");
	                    index2 = input.nextInt();
	                    if (index1 >= 0 && index1 < n && index2 >= 0 && index2 < n) {
	                        double distance = pointArr[index1].calculateDistance(pointArr[index2]);
	                        System.out.println("Distance between points at index " + index1 + " and " + index2 + ": " + distance);
	                    } else {
	                        System.out.println("Invalid indices.");
	                    }
	                    break;
					
					
					
					
					
					
				case 4:
					return;
					
				
				
				
				}
				
			}while(choice != 4);
			
			
			
			
		}

	}

