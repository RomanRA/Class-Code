/*
 * Figure.java - Figure class 
 * Name: Richard Roman
 * Course: 150
 * Lab07: Figure Object
 * Email: raroman@g.coastal.edu
 * Date: 10/22/2013
 */
public abstract class Figure extends Object{
	/**
	 * Class attributes - intstance variables
	 */
	private double area;
	private double perimeter;
	
	/**
	 * Default constructor
	 */
	public Figure(){
		area = 0;
		perimeter = 0;
	}
	
	/**
	 * Overloaded Constructor
	 */
	public Figure(double aArea, double aPerimeter){
		this.area = aArea;
		this.perimeter = aPerimeter;
	}
	
	//accessors
	/**
	 * Gets the area
	 * @returns the area
	 */
	public double getArea(){
		return this.area;
	}
	
	/**
	 * Gets the perimeter
	 * @returns the perimeter
	 */
	public double getPerimeter(){
		return this.perimeter;
	}
	
	
	/**
	 * Sets area
	 * @param sets name 
	 */
	protected void setArea(double area){
		this.area = area;
	}
	
	/**
	 * sets the perimeter
	 * @param sets perimeter
	 */
	protected void setPerimeter(double perimeter){
		this.perimeter = perimeter;
	}
	
	/**
	 * update area implementedd within child classes
	 */
	public abstract void updateArea();
		
	/**
	 * update perimeter within the child classes
	 */
	public abstract void updatePerimeter();	
}
