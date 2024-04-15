package com.sunbeam.day_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Collectionss {
	
	public static void main(String[] args) {
		
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		
		studentList.add(new Student(1, "rushi", 85.40));
		studentList.add(new Student(5, "vedant", 50.40));
		studentList.add(new Student(3, "rohit", 60.60));
		studentList.add(new Student(4, "digvijay", 60.58));
		studentList.add(new Student(2, "aditya", 90.90));
		
		for(Student s : studentList) {
			System.out.println(s);
		}
		System.out.println("after sorting");
		
		Collections.sort(studentList);
		
		for(Student s : studentList) {
			System.out.println(s);
		}
		
		System.out.println("Sort on the basis of name");
		
		class className implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
			
			
		}
		
		Collections.sort(studentList , new className());
		
		for(Student s : studentList) {
			System.out.println(s);
		}
		
		
		System.out.println("Student with rollno exist or not");

		int desiredRollNumber = 3; // Desired roll number to check

		Student searchStudent = new Student(desiredRollNumber, "", 0.0); // Create a dummy Student object with only the roll number set

		if (studentList.contains(searchStudent)) {
		    System.out.println("Student Exists");
		} else {
		    System.out.println("Student Not found");
		}
		
		
		
		
		
		
	}
	
	

}
