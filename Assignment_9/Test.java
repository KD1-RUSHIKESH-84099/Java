import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<Book> hs = new HashSet<>();
		int choice1;
		Scanner input = new Scanner(System.in);
		
		Book b;
		do {
			System.out.println("0. EXIT");
			System.out.println("1. ADD BOOK");
			System.out.println("2. DISPLAY ALL BOOKS");
			System.out.println("3. SORTING OF BOOKS AS PER CATEGORY");
			System.out.println("4. SORTING OF BOOKS AS PER AUTHOR");
			System.out.println("5. FIND A BOOK BY ID");
			
			choice1 = input.nextInt();
			
		switch(choice1) {
		
		case 1:
			
			b = new Book();
			b.accept();
			hs.add(b);
			break;
			
		case 2:
			
			for(Book books : hs) {
				System.out.println(books);
			}
			break;
			
		
		case 3:
						
			
			class newCategoryComparator implements Comparator<Book>{

				@Override
				public int compare(Book o1, Book o2) {
					return o1.type.compareTo(o2.type);
					
				}
			}
				
			
			TreeSet<Book> sortedByCategory = new TreeSet<>(new newCategoryComparator());
            sortedByCategory.addAll(hs);
            for (Book book : sortedByCategory) {
                System.out.println(book);
            }
            break;
            
            
		case 4 : 
			
			class newAuthorComparator implements Comparator<Book>{

				@Override
				public int compare(Book o1, Book o2) {
					return o1.name.compareTo(o2.name);
					
				}
			}
				
			
			TreeSet<Book> sortedByAuthor = new TreeSet<>(new newAuthorComparator());
			sortedByAuthor.addAll(hs);
            for (Book book : sortedByAuthor) {
                System.out.println(book);
            }
            break;
            
          
		case 5:
			
			String id;
			System.out.println("ENTER ID TO SEARCH SPECIFIC BOOK");
			id = input.next();
			Book book = null;
			for(Book booksList : hs) {
				if(booksList.isbn.equals(id)){
					book = booksList;
					break;
					
				}
				
				
			}
			if (book != null) {
		        System.out.println("Book found: " + book);
		    } else {
		        System.out.println("Book with ID " + id + " not found.");
		    }
		    break;
			

			
			
		case 0:
			return;
			
		
			
			
			
		}
			
		}while(choice1 != 0);

	}

}
