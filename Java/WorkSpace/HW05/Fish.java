/*
 * Fish.java - Fish object subclass
 * Name: Richard Roman
 * Course: 150
 * Homework05
 * Email: raroman@coastal.edu
 * Date: 10/24/2013
 */
import javax.swing.JOptionPane;
public class Fish extends Animal {
	/**
	 * Class attributes - instance variables
	 */
	private String breed;
	private String color;
	private boolean saltWater;
	private boolean fitForEating;
	
	/**
	 * Default constructor
	 */
	public Fish(){
		super();
		//System.out.println("Back from Animal constructor");
		this.breed = "No breed yet";
		this.color = "No color yet";
		this.saltWater = false;
		this.fitForEating = false;
	}
	
	//overloaded constructor
	/**
	 * Overloaded constructor
	 * @param name
	 * @param age
	 * @param breed
	 * @param color
	 * @param aSaltWater
	 * @param aFitForEating
	 */
	public Fish(String name, int age, String breed, String color, boolean aSaltWater,boolean aFitForEating){
		super(name,age);
		System.out.println("Back from Animal constructor");
		this.breed = breed;
		this.color = color;
		this.saltWater = aSaltWater;
		this.fitForEating = aFitForEating;
		System.out.println("Leaving the  Fish(String, int, String,String, boolean, boolean) constructor.");
	}
	
	//Accessor methods getters
	/**
	 * @return the Breed of the Fish
	 */
	public String getBreed(){
		return this.breed;
	}
	/**
	 * @return the Color of Bird
	 */
	public String getColor(){
		return this.color;
	}
	
	/** 
	 * @return if Fish is a salt water fish
	 */
	public boolean getSaltWater(){
		return this.saltWater;
	}
	
	/**
	 * @return if Fish is fit for eating
	 */
	public boolean getFitForEating(){
		return this.fitForEating;
	}
	
	//Mutator methods
	/**
	 * setBreed sets breed of fish
	 * @param breed indicates the breed of the fish
	 */
	public void setBreed(String breed){
		this.breed = breed;
	}
	
	/**
	 * setColor sets the color for this fish
	 * @param color represents the color of the fish
	 */
	public void setColor(String color){
		this.color = color;
	}
	
	/**
	 * setSaltWater sets true or false whether fish is  saltwater
	 * @param aSaltWater indicates whether fish is a saltwater fish
	 */
	public void setSaltWater(boolean aSaltWater){
		this.saltWater = aSaltWater;
	}
	
	/**
	 * setFitForEating sets true or false if fish is fit to eat
	 * @param aFitForEating
	 */
	public void setFitForEating(boolean aFitForEating){
		this.fitForEating = aFitForEating;
	}
	
		
	//other methods
	//print info method
	/**
	 * printInfo provides textual output for this Fish to the console.
	 */
	public void printInfo(){
		super.printInfo();
		System.out.println("\n*************** Fish ****************");
		System.out.println("Breed is: " + this.breed);
		System.out.println("I am the color: " + this.color);
		System.out.println("*************** Fish ****************\n");
	}
	
	//To string method
	/**
	 * toString produces a text representation of this Fish.
	 *
	 * @return a String representation of this Fish.
	 */
	public String toString(){
    	String text = "";
		
		text += "I am a Fish named " + super.getName() + "\n";
		text += "I am " + super.getAge() + " years old.\n";
		text += "I am a " + this.breed + ", and ";
		text += "I am the color " + this.color + ", and ";
		
		
		if(this.saltWater){
			text += "I am a salt water fish!\n";
		}
		else{
			text += "I am not a salt water fish!\n";
		}
		return text;
	}
	
	/**
	 * speak provides output for this Fish to a JOptionPane
	 */
	public void speak(){
		JOptionPane.showMessageDialog(null,super.getName() + " says: Bloop Bloop ");
	}
	
	/**
	 * equals compares other Object to determine if it is a Fish
	 *    and has identical attributes as this Dog.
	 *
	 * @param other represents a valid Object for comparison.
	 *
	 * @return returns true if other has identical attributes as this Fish, and 
	 *          returns false otherwise.
	 */
	public boolean equals(Object other){
		boolean equal =true;
		
		if(!(other instanceof Fish)){
			return false;
		}
		//this would be the else
		Fish theFish = (Fish)other;
		equal = super.equals(theFish);
		
		if(!this.breed.equals(theFish.getBreed())){
			equal = false;
		}
		if(!this.color.equals(theFish.getColor())){
			equal = false;
		}
		return equal; 
	}
	
	 public static void main(String[] args){
		Fish fish1 = new Fish();
		fish1.printInfo();
		
		Fish.loadAnimal(fish1);
		String temp1 = fish1.getName();
		int temp2 = fish1.getAge();
		
		Animal nemo = new Fish(temp1,temp2,"Clown Fish","Orange",true,true);
		nemo.printInfo();
		nemo.speak();
		//fish1.setBreed("Clown Fish");
		//fish1.setColor("Orange");
		//fish1.setSaltWater(true);
		//fish1.setFitForEating(true);
			
	}
	 
}//Fish
