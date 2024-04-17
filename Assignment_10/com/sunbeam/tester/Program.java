package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.dao.StudentDao;
import com.sunbeam.entity.Student;

public class Program {

	public static void main(String[] args)  {
		
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("0. EXIT");
			System.out.println("1. DISPLAY ALL STUDENTS FROM THE LIST");
			System.out.println("2. DELETE PARTICULAR STUDENT FROM THE LIST");
			System.out.println("3. INSERT STUDENT INTO THE LIST");
			System.out.println("4. UPDATE PARTICULAR STUDENT FROM THE LIST");
			System.out.println("5. SEARCH SPECIFIC STUDENT INTO THE LIST");
			
			choice = sc.nextInt();
			
			switch(choice) {
			
			
			
			case 1 : 
				
				try {
					StudentDao studentdao = new StudentDao();
					List<Student> ls = studentdao.getAllStudents();
					ls.forEach(s -> System.out.println(s)); 
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
				
			case 2 :
				System.out.println("Enter the rollno want to delete");
				int rollNumber;
				rollNumber = sc.nextInt();
				
				try {
					StudentDao studentdao = new StudentDao();
					String msg = studentdao.deleteStudent(rollNumber);
					System.out.println(msg);
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
				
			case 3:
			    try  {
			        StudentDao studentDao = new StudentDao();
			        System.out.println("Enter name - ");
			        // Consume the newline character
			        sc.nextLine();
			        String name = sc.nextLine();
			        System.out.println("Enter marks - ");
			        double marks = sc.nextDouble();
			        // Consume the newline character
			        sc.nextLine();
			        System.out.println("Enter mobile - ");
			        String mobile = sc.nextLine();
			        studentDao.insertStudent(new Student(name, marks, mobile));
			        System.out.println("Student added...");
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
			    break;

				
				
			case 4:
				
				try {
					StudentDao studentDao = new StudentDao(); 
					
						System.out.println("Enter rollno to update marks - ");
						int rollno = sc.nextInt();
						System.out.println("Enter updated marks - ");
						double marks = sc.nextDouble();
						String s = studentDao.updateStudent(rollno, marks);
						System.out.println(s);
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
				
		
			case 5:
				
				 try {
				        StudentDao studentDao = new StudentDao();
				        System.out.println("Enter rollNo to search");
				        int rollno = sc.nextInt();
				        
				        Student searchedStudent = studentDao.getStudent(rollno);
				        if (searchedStudent != null) {
				            System.out.println("Student found:");
				            System.out.println(searchedStudent);
				        } else {
				            System.out.println("Student with roll number " + rollno + " not found.");
				        }
				    } catch (SQLException e) {
				        e.printStackTrace();
				    }
				    break;
				    
				    
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			case 0:
				return;
				
			}
			
			
			
			
			
		}while(choice != 0);

	}

}
