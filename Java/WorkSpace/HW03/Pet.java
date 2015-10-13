/* Pet.java - Pet object.
 * Name: Richard A. Roman
 * Course: 150
 * HomeWork Assignment 3 Part1
 * Email: raroman@g.coastal.edu
 * Date 10/3/2013
 */
import javax.swing.JOptionPane;
public class Pet 
{
	//Declare Variable - member variables
	private String name = "";
	private String alive = "";
	private String breed = "";
	private int happy = 100;
	private int hungry = 0;
	
	//Default constructor
	public Pet()
	{
		name = "No name yet";
		breed = "No breed yet";
		alive = "Is alive";
		happy = 100;
		hungry = 0;
	}
	
	/**
	 * Overloaded Constructor
	 * sets aName to name
	 * sets aBreed to breed
	 */
	public Pet(String aName,String aBreed)
	{
		String name = aName;
		String breed = aBreed;
	}
	
	//Accessor methods queries the object for some information without changing it.
	
	/**
	 * Gets alive status
	 * @returns alive
	 */
	public String getAlive()
	{
		return alive;
	}
	
	/**
	 * Gets breed
	 * @returns the breed
	 */
	public String getBreed()
	{
		return breed;
	}
	
	/**
	 * gets pet name
	 * @returns the name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * gets happy 
	 * @returns happy
	 */
	public int getHappy()//1-100 100 being happiest
	{
		return happy;
	}
	
	/**
	 * getHungry
	 * @returns hungry
	 */
	public int getHungry()//1-100 100 being  hungriest
	{
		return hungry;
	}
	
	//Mutator  modifies the object on which it operates.
	
	/**
	 * Sets Alive
	 * @param aAlive
	 */
	public void setAlive(String aAlive)
	{
		alive = aAlive;
	}
	
	/**
	 * Sets the dogs breed
	 * @param aBreed
	 */
	public void setBreed(String aBreed)
	{
		breed = aBreed;
	}
	
	/**
	 * Sets the pet name
	 * @param aName
	 */
	public void setName(String aName)
	{
		name = aName;
	}
	
	/**
	 * 
	 * @param isHappy
	 */
	public void setHappy(int isHappy)
	{
		happy = isHappy;
	}
	
	/**
	 * 
	 * @param isHungry
	 */
	public void setHungry(int isHungry)
	{
		hungry = isHungry;
	}
	
	/**
	 * Determines if whether the pet is hungry or not
	 *  
	 */
	public void determineIfHungry()
	{
		if(hungry>75 && hungry<=100)
		{
			JOptionPane.showMessageDialog(null,name+" is starving.");//no play will make it happy
		}
		else if(hungry<=25)
		{
			JOptionPane.showMessageDialog(null,name+" is not hungry.");//unhappy
		}
		else if(hungry>25 && hungry<=75)
		{
			JOptionPane.showMessageDialog(null,name+" is hungry.");//is happy
		}
		else if(hungry>100)
		{
			JOptionPane.showMessageDialog(null,name+" just died! Why did you let "+name+" die!");
		}
	}
	//End Method
	
	/**
	 * Determines whether the pet is happy
	 */
	public void determineIfHappy()
	{
		if(happy>75)
		{
			JOptionPane.showMessageDialog(null,name+ " is very happy.");//will not have an appetite
		}
		else if(happy<=25)
		{
			JOptionPane.showMessageDialog(null,name+" is unhappy.");//no appetite
			
		}
		else if(happy>25 && happy<=75)
		{
			JOptionPane.showMessageDialog(null,name+" is happy.");//has an appetite
		}
	}
	//End Method
	
	/**
	 * Adds points if user plays with pet
	 */
	public void play()
	{
		if(happy >= 0 && happy<100)
		{
			//JOptionPane.showMessageDialog(null,"Playing with "+name+"...");
			happy +=20;;
		}
	}
	//End Method
	
	/**
	 * Subtracts points if user feeds pet
	 */
	public void feed()
	{
		if(hungry >= 0 && hungry <100)
		{
			//JOptionPane.showMessageDialog(null,name+" is being feed...");
			hungry -=30;
		}
	}
	//End Method
	
	/**
	 * Print out the information of pet
	 */
	public void printPetInformation()
	{
		JOptionPane.showMessageDialog(null,"Pet name is: "+name+"\nPet Breed is: "+breed);
	}
	//End Method
	
	/**
	 * Sets Set points after every loop
	 */
	public void pointsGainLose()
	{
		happy-=9;
		hungry+=14;
	}
	//End Method
}