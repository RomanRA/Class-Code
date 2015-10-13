/**
 * Shape.java - not yet implemented
 * @author Richard A Roman
 * @author Clint
 * Course: 150
 * Lab11
 * Email: raroman@coastal.edu
 * Date: 11/19/2013
 */
package model;

import java.awt.*;

public abstract class Shape implements Drawable {
	
	private Color myColor;
	private boolean isFilled;
	private Point topCorner;
	
	public Shape(Color aColor, Point aPoint){
		this.myColor = aColor;
		this.isFilled = false;
		this.topCorner = aPoint;
	}
	
	public Color getColor(){
		return this.myColor;
	}
	public boolean isFilled(){
		return this.isFilled;
	}
	public Point getTopCorner(){
		return this.topCorner;
	}
}
