package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	
//	public Fruit(String color, double weight, String name, boolean isFresh) {
//		
//		this.color = color;
//		this.weight = weight;
//		this.name = name;
//		this.isFresh = false;
//	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isFresh() {
		return isFresh;
	}


	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	public void add() {
		System.out.println("Enter the color - ");
		color = new Scanner(System.in).next();
		System.out.println("Enter wight - ");
		weight = new Scanner(System.in).nextDouble();
		System.out.println("Enter name - ");
		name = new Scanner(System.in).next();
		System.out.println("fresh or not - ");
		isFresh = new Scanner(System.in).hasNext();
		
		
	}
	
	public void display() {
		
		System.out.println("color is" + " " + color);
		System.out.println("weight is" +  " " + weight);
		System.out.println("name is" +  " " + name);
	}
//	@Override
//	public String toString() {
//		String details = "color = " + this.color + "weight = " + this.weight + "name = " + this.name + "FreshOrNot" + true;
//		return details;
//		
//	}
	
	public String taste() {
		return "No Specific taste";
	}
	
	
	

}
