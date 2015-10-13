/*
 * Circle.java - Circle class extends Figure
 * Name: Richard Roman
 * Course: 150
 * Lab07: Circle Object
 * Email: raroman@g.coastal.edu
 * Date: 10/22/2013
 */
public class Circle extends Figure {
	/**
	 * Class attributes - instance variables
	 */
	private double radius;
	
	/**
	 * Overloaded Constructor
	 */
	public Circle(double aRadius){
		this.radius = aRadius;
	}
	
	/**
	 * Sets the radius of the circle
	 * @param r
	 */
	public void setRadius(double r){
		this.radius = r;
	}
	
	/**
	 * Gets radius of circle
	 * @return radius
	 */
	public double getRadius(){
		return this.radius;
		
	}
	

	/**
	 * Updates area in  parent class figure
	 */
	public void updateArea(){
		super.setArea(Math.PI*(radius*radius));
	}
	
	/**
	 * Updates perimeter in  parent class figure
	 */
	public void updatePerimeter(){
		super.setPerimeter((2*Math.PI*radius));
	}
	
}
