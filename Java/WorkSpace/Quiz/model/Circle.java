/**
 * Circle.java - gets information from I/O user for circle
 * @author Richard A Roman
 * @author Clint
 * Course: 150
 * Lab11
 * Email: raroman@coastal.edu
 * Date: 11/19/2013
 */
package model;

import java.awt.*;

public class Circle extends Shape{ 
	
	private int radius;
	
	public Circle(Color aColor, Point aPoint, int aRadius){
		//super();
		super(aColor,aPoint);
		this.radius = aRadius;
	}

	public void draw(Graphics g){
		g.setColor(super.getColor());
		
		Point temp = super.getTopCorner();
		int x = temp.getX();
		int y = temp.getY();
		
		int width = radius * 2;
		int height = radius * 2;
		
		if(super.isFilled()){
			g.fillOval(x,y, width,height);
		}
		else{
			g.drawOval(x,y, width, height);
		}
	}
}
