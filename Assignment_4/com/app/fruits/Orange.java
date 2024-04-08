package com.app.fruits;

public class Orange extends Fruit {

//	public Orange(String color, double weight, String name, boolean isFresh) {
//		super(color, weight, name, isFresh);
//		// TODO Auto-generated constructor stub
//	}
	
	@Override
	public void add() {
		super.add();
		
		
	}
	
	@Override
	public void display() {
		super.display();
	}
	
	
	@Override
	public String taste() {
		return "sour";
	}
	
	public String toString() {
		String details = "color = " + this.getColor() + " " +  "weight = " + this.getWeight() + " " + "name = " + this.getName() + " " + " " + "freshOrNot = " + this.isFresh(); 
		return details;
		
	}
	

}
