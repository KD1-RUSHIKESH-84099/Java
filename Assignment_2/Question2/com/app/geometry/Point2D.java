package com.app.geometry;


public class Point2D {
	private int x;
	private int y;
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y; 
	}
	
	public String getDetails() {
		return (x +" " + y + " ");
	}
	
	
	
	public Boolean isEqual(int p, int q) {
		return this.x == p && this.y == q ? true : false;
	}
	
	public double calculateDistance(int p, int q) {
		 	double dx = this.x - p;
	        double dy = this.y - q;
	        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	        
		
	}
	
	
	
	
	
	
	
	

}
