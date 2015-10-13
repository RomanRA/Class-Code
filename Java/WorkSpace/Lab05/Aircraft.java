/*
 * Aircraft.java - 
 * Name: Richard Roman
 * Course: 150
 * Lab04: Aircraft Object
 * Email: raroman@g.coastal.edu
 * Date: 9/19/2013
 */

import javax.swing.JOptionPane;
public class Aircraft
{
	//Attributes are private
	int fuel = 0;
	int distance = 0;
	boolean oK = true;
	
	//Default constructor to make sure all the variable are initialized
	public Aircraft()
	{
		fuel = 0;
		distance = 0;
	}
	//Overload constructor
	public Aircraft(int fuelParam)
	{
		fuel = fuelParam;
	}
	
	//Accessor Methods 
	public int getFuel()
	{
		return fuel;
	}
	
	//Mutator Method
	public void setFuel(int fuelParam)
	{
		fuel = fuelParam;
	}
	public void setDistance(int distanceParam)
	{
		distance = distanceParam;
	}
	
	public boolean travel()
	{
		if(fuel == 100)
		{
			 oK = true;	
		}
		else if(fuel == 60)
		{
			oK = false;
		}
		else if(fuel == 20)
		{
			oK = false;
		}
		else if(fuel == 0)
		{
			oK = false;
		}
		
		return oK;
	}
	
}


