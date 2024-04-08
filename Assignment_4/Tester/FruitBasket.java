package Tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Fruit farr[] = new Fruit[n];
		Fruit f;
		
		int choice;
		int index = 0;
		
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of each fruit");
			System.out.println("5. Display data of all fruits");
			System.out.println("6. Mark the fruit as stale");
			System.out.println("7. Display the tastes of all stale fruits");
			System.out.println("8. Mark all sour fruits stale");
			choice = input.nextInt();
			
			
		switch(choice) {
		
		case 1:
			if(index < 6) {
				f = new Mango();
				f.add();
				farr[index] = f;
				index ++;
			}
			break;
			
		case 2:
			
			if(index < 6) {
				f = new Orange();
				f.add();
				farr[index] = f;
				index ++;
			}
			break;
			
		case 3 : 
			
			if(index < 6) {
				f = new Apple();
				f.add();
				farr[index] = f;
				index ++;
			}
			break;
			
		case 4 : 
			System.out.println("Names of each fruit is : ");
			for(Fruit fruits :farr) {
				System.out.println(fruits.getName());
			}
			break;
			
		case 5: 
			
			System.out.println("data of all fruits");
			for(Fruit fruits : farr) {
				System.out.println(fruits.toString());
			}
			break;
			
		case 6:
			
			int stale;
			System.out.println("mark the fruit as stale");
			stale = input.nextInt();
			for(int i = 0; i < farr.length; i ++) {
				if(stale < n ) {
				farr[stale].setFresh(false); 
				}else {
					System.out.println("invalid index");
					
				}
					
			}
			break;
			
		case 7:
			
			for(Fruit fruits : farr) {
				if(fruits.isFresh() == false) {
					System.out.println(fruits.taste());
					
				}
			}
			break;
			
		case 8:
			
			for(int i = 0; i < farr.length; i ++) {
				if(farr[i] instanceof Orange) {
					Orange o = (Orange) farr[i];
					o.setFresh(false);
					
				}
				
			}
			break;
			
		default : 
			System.out.println("Wrong choice");
			break;
			
			
		
		}
		
		
		}while(choice != 0);

	}

}
