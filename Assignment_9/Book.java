import java.util.Scanner;

public class Book {
	
	String isbn;
	Category type;
	double price;
	String name;
	int quantity;
	

//	public Book(String isbn, Category type, double price, String name, int quantity) {
//		
//		this.isbn = isbn;
//		this.type = type;
//		this.price = price;
//		this.name = name;
//		this.quantity = quantity;
//	}
	
	public void accept() {
		
		
		System.out.println("isbn is - ");
		isbn = new Scanner(System.in).next();
		System.out.println("enter category - ");
		String choice;
		choice = new Scanner(System.in).next();
		type = Category.valueOf(choice);
		System.out.println("enter price - ");
		price = new Scanner(System.in).nextDouble();
		System.out.println("enter name is - ");
		name = new Scanner(System.in).next();
		System.out.println("enter quantity - ");
		quantity = new Scanner(System.in).nextInt();
		

		
		
	}


	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", type=" + type + ", price=" + price + ", name=" + name + ", quantity="
				+ quantity + "]";
	}
	
	
	
	        
	 
	
	
	
	
	
	
	
	
	
	
	

}
