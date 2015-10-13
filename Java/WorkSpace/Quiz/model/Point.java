/**
 * Point.java - gets the starting points where the shape will be drawn
 * @author Richard A Roman
 * @author Clint
 * Course: 150
 * Lab11
 * Email: raroman@coastal.edu
 * Date: 11/19/2013
 */
package model;

public class Point {
	private int x = 0;
	private int y = 0;
	
	public Point(int aX,int aY){
		this.x = aX;
		this.y = aY;
	}
	
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	
	public void setX(int aX)
	{
		if(aX >= 0)
		{
			this.x = aX;
		}
	}
	public void setY(int aY)
	{
		if(aY >= 0)
		{
			this.y = aY;
		}
	}

}
