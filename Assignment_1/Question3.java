import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int price = 100;
		int Bill = 0;
		int choice;
		
		
		do {
			System.out.println("****Menu List******");
			System.out.println("1. Dosa || price : 100");
			System.out.println("2. Idli || price : 50");
			System.out.println("3. Brownie || price : 120");
			System.out.println("4. BlackDog || price : 600");
			System.out.println("5. JD || price : 800");
			System.out.println("6. Budwieser || price : 400");
			System.out.println("7. Total Bill : ");
			System.out.println("0. Exit");
			
			
			choice = input.nextInt();
			
			switch(choice) {
			
			case 1:  
				System.out.println("dosa");
				Bill += 100;
				break;
			
			
			
			case 2: 
				System.out.println("idli");
				Bill += 50;
				break;
				
			case 3:
				System.out.println("Brownie");
				Bill += 120;
				break;
				
			case 4:
				
				System.out.println("BlackDog");
				Bill += 600;
				break;
				
			case 5:
				System.out.println("JD");
				Bill += 800;
				break;
				
			case 6:
				
				System.out.println("Budweiser");
				Bill += 400;
				break;
				
			case 7:
				
				System.out.println("Total Bill = " + " "+ Bill);
				return;
				
				
			default :
				System.out.println("Wrong choice");
				break;
				
				
			
				
			
				
				
		}
		
		
		
	}while(choice != 0);
}
}


