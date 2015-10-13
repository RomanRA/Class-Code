/*
 * Bird.java - Bird object subclass
 * Name: Richard Roman
 * Course: 150
 * Homework05
 * Email: raroman@coastal.edu
 * Date: 10/24/2013
 */
import javax.swing.JOptionPane;
public class Bird extends Animal {
	/**
	 * Class attributes - instance variables
	 */
	private String breed;
	private String color;
	private boolean canFly;
	
	/**
	 * Default constructor
	 */
	public Bird(){
		super();
		//System.out.println("Back from Animal constructor");
		this.breed = "No breed yet";
		this.color = "No color yet";
		this.canFly = false;
		//System.out.println("Leaving the default Bird constructor.");
	}
	
	/**
     * Overloaded constructor
     * 
     * @param name of this Bird
     * @param age the age this Bird
     * @param breed of this Bird
     * @param isFly for this Bird
     */
	
	public Bird(String name, int age, String breed, String color, boolean isFly){
		super(name, age);
		System.out.println("Back from Animal constructor");
		this.breed = breed;
		this.color = color;
		this.canFly = isFly;
		System.out.println("Leaving the  Bird(String, int, String,String, boolean) constructor.");
		
	}
	
	//Accessors - getters
	/**
	 * @return the Breed of the bird
	 */
	public String getBreed(){
		return this.breed;
	}
	
	/**
	 * @return the Color of the bird
	 */
	public String getColor(){
		return this.color;
	}
	
	/**
	 * @return whether or not the bird can fly
	 */
	public boolean isAbleToFly(){
		return this.canFly;
	}
	
	//Mutators - setters
	/**
	 * setBreed sets breed of bird
	 * @param breed represents the breed of bird
	 */
	public void setBreed(String breed){
		this.breed = breed;
	}
	
	/**
	 * Sets the color of this bird
	 * @param color represents the color of the bird
	 */
	public void setColor(String color){
		this.color = color;
	}
	
	/**
	 * Sets whether the bird can fly
	 * @param isFly indicates whether the bird can fly or not.
	 */
	public void setCanFly(boolean isFly){
		this.canFly = isFly;
	}
	
	/**
	 * Sets age of this bird
	 * @param aAge represents the age of this Bird 
	 */
	public void setAge(int aAge){
		if(aAge >= 0 && aAge <= 100){
			super.setAge(aAge);
		}
	}
	
	//Other methods
	/**
	 * printInfo of Bird outputs to the console.
	 */
    public void printInfo(){
		super.printInfo();
		System.out.println("\n*************** Bird ****************");
		System.out.println("Breed is: " + this.breed);
		System.out.println("I am the color: " + this.color);
		System.out.println("I can fly: " + this.canFly); 
		System.out.println("*************** Bird ****************\n");
    }
	
    /**
	 * toString produces a text representation of this Bird.
	 *
	 * @return a String representation of this Bird.
	 */
    public String toString(){
    	String text = "";
		
		text += "I am a Bird named " + super.getName() + "\n";
		text += "I am " + super.getAge() + " years old.\n";
		text += "I am a " + this.breed + ", and ";
		text += "I am the color " + this.color + ", and ";
		
		if(this.canFly){
			text += "I can fly!\n";
		}
		else{
			text += "I cannot fly!\n";
		}
		
		return text;
    }
	
    /**
	 * speak provides output for this Bird to a JOptionPane
	 * 
	 */
	public void speak(){
		JOptionPane.showMessageDialog(null, super.getName() + " says: Chirp Chirp");
	}
	
	/**
	 * equals compares other Object to determine if it is a Bird
	 *    and has identical attributes as this Bird.
	 *
	 * @param other represents a valid Object for comparison.
	 *
	 * @return returns true if other has identical attributes as this Bird, and 
	 *          returns false otherwise.
	 */
	public boolean equals(Object other){
		boolean equal = true;
		
		//need to check if parameter is a Bird object
		if(!(other instanceof Bird)){
			return false;
		}
		
		//If it gets here it should be a Bird object
		Bird theBird = (Bird)other;
		equal = super.equals(theBird);
		
		if(!this.breed.equals(theBird.getBreed())){
			equal = false;
		}
		if(!this.color.equals(theBird.getColor())){
			equal = false;
		}
		return equal;
	}
	
	
	public static void main(String[] args){
		Bird bird1 = new Bird();
		bird1.printInfo();
		
		Bird.loadAnimal(bird1);
		String temp1 = bird1.getName();
		int temp2 = bird1.getAge();
		
		Animal blu = new Bird(temp1,temp2,"Macaw","Blue",true);
		blu.printInfo();
		blu.speak();
		
	}
	
}//Bird
