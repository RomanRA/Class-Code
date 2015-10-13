/*
 * Rectangle.java - Rectangle class extends Figure
 * Name: Richard Roman
 * Course: 150
 * Lab07: Rectangle Object
 * Email: raroman@g.coastal.edu
 * Date: 10/22/2013
 */
public class Rectangle extends Figure {
	/**
	 * Class attributes - instance variables
	 */
	private double length;
	private double width;
	
	
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	/**
	 * Sets length
	 * @param l
	 */
	public void setLength(double l){
		this.length = l;
	}
	
	/**
	 * Set width
	 * @param w
	 */
	public void setWidth(double w){
		this.width = w;
	}
	
	/**
	 * gets length 
	 * @return the length
	 */
	public double getLength(){
		return this.length;
	}
	
	/**
	 * gets width
	 * @returns the width
	 */
	public double getWidth(){
		return this.width;
	}
	
	/**
	 * updates area in parent class figure
	 */
	public void updateArea(){
		super.setArea(length * width);
	}
	
	/**
	 * Updates perimeter in parent class figure
	 */
	public void updatePerimeter(){
		super.setPerimeter((2*getLength())+(2*getWidth()));
	}
}
