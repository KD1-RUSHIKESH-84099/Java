package com.app.geometry;


public class Point2D {
	private int x;
	private int y;
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y; 
	}
	
	
	
	
	public String getDetails() {
		return (this.x + " " + this.y + " ");
	}
	
	
	
	
	
	
	public Boolean isEqual(int p, int q) {
		return this.x == p && this.y == q ? true : false;
	}
	
	public double calculateDistance(Point2D point) {
		 	double dx = this.x - point.x;
	        double dy = this.y - point.y;
	        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	        
		
	}
	
	
	
	
	
	
	
	

}
