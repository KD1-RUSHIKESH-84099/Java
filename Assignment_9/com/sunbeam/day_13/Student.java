package com.sunbeam.day_13;

import java.util.Objects;

/**
 * 
 */
public class Student implements Comparable<Student> {
	
	private int rollNo;
	private String name;
	private double marks;
	
	
	
	public Student(int rollNo, String name, double salary) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.marks = salary;
	}



	public int getRollNo() {
		return rollNo;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getMarks() {
		return marks;
	}



	public void setMarks(double salary) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}



	@Override
	public int compareTo(Student o) {
		return (this.rollNo - o.rollNo);
	}
	



	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		else if (this == obj)
			return true;
		else if (obj instanceof Student) {
			Student e = (Student) obj;
			return e.rollNo == this.rollNo;
		}
		return false;
	}
	}
		
	
	
	
	

