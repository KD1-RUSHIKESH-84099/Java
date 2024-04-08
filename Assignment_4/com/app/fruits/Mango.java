package com.app.fruits;

public class Mango extends Fruit {

//	public Mango() {
//		super(color, weight, name, isFresh);
//		// TODO Auto-generated constructor stub
//	}
//	
	

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
		return "sweet";
	}
	
	public String toString() {
		String details = "color = " + this.getColor() + " " +  "weight = " + this.getWeight() + " " + "name = " + this.getName() + " "  + "freshOrNot = " + this.isFresh(); 
		return details;
		
	}
	
	

}
