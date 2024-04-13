import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student {
	
	private int roll;
	private String name;
	private String city;
	private double marks;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	
	public Student(int roll, String name, String city, double marks) {
		
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	
	
	
	
}






public class Question2 {
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		int n= input.nextInt();
		Student sarr[] = new Student[5];
		sarr[0] = new Student(1, "rushi", "nashik", 85.40);
		sarr[1] = new Student(2, "adarsh", "gondiya", 80.40);
		sarr[2] = new Student(3, "digvijay", "vita", 81.40);
		sarr[3] = new Student(4, "aditya", "nagar", 75.40);
		sarr[4] = new Student(5, "jay", "pune", 90.40);
		
		
		
		int choice;
		
		do {
			
			System.out.println("0. EXIT");
			System.out.println("1. SORTED ON CITY (asc)");
			System.out.println("2. SORTED ON MARKS (desc)");
			System.out.println("3. SORTED ON NAME (asc)");
			choice = input.nextInt();
			
			switch(choice) {
			
			case 1:  
				
				class StudentNameComparator implements Comparator<Student> {

					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.getCity().compareTo(o2.getCity());
						return value;
					}
					
					
				}
				
				 Comparator<Student> studentNameComparator = new StudentNameComparator();
				
				
				Arrays.sort(sarr, studentNameComparator);
				for(Student s : sarr) {
					System.out.print(s + " ");
				}
				break;
				
				
				
			case 2:
				
				class StudentMarksComparator implements Comparator<Student> {

					@Override
					public int compare(Student o1, Student o2) {
						int value = Double.compare(o2.getMarks(),o1.getMarks());
						return value;
					}
					
					
				}
				
				 Comparator<Student> studentMarksComparator = new StudentMarksComparator();
				
//				
				Arrays.sort(sarr, studentMarksComparator);
				for(Student s : sarr) {
					System.out.print(s + " ");
				}
				break;
				
				
			case 3:
				
				
				class StudentSNameComparator implements Comparator<Student> {

					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.getName().compareTo(o2.getName());
						return value;
					}
					
					
				}
				
				 Comparator<Student> studentSNameComparator = new StudentSNameComparator();
				
				
				Arrays.sort(sarr, studentSNameComparator);
				for(Student s : sarr) {
					System.out.print(s + " ");
				}
				break;
				
				
				
			case 0:
				return;
				
				
				default:
					System.out.println("wrong choice");
					break;
				
			}
			
			
			
			
		}while(choice != 0);
		
		
		
		
		
		
	}

}
