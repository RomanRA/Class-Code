/*
 * Dog.java - Dog object subclass
 * Name: Richard Roman
 * Course: 150
 * Homework05
 * Email: raroman@coastal.edu
 * Date: 10/24/2013
 */
import javax.swing.JOptionPane; 
public class Dog extends Animal {
  
   /**
    * Class attributes: instance variables
    */
    private String breed;
    private boolean trained;

	/**
	 * default constructor
	 */
    public Dog(){
		super();
		System.out.println("Back from Animal constructor");
		this.breed = "no breed yet";
		this.trained = false;
		System.out.println("Leaving the default Dog constructor.");
    }

    /**
     * overloaded constructor
     * 
     * @param name of this Dog
     * @param age the age this Dog
     * @param breed of this Dog
     * @param isTrained for this Dog
     */
    public Dog(String name, int age, String breed, boolean isTrained){
		super(name, age);
		System.out.println("Back from Animal constructor");
		this.breed = breed;
		this.trained = isTrained;
		System.out.println("Leaving the  Dog(String, int, String,boolean) constructor.");
    }

    //accessors
    
    /**
     * @return the Breed of this Dog
     */
    public String getBreed(){
		return this.breed;
    }

    /**
     * 
     * @return whether or not this Dog is trained.
     */
    public boolean isTrained(){
		return this.trained;
    }

    //mutators
    
    /**
     * setBreed sets breed of dog
     * @param breed represents the Breed of this Dog.
     */
    public void setBreed(String breed){
		this.breed = breed;
    }

    /**
     * 
     * @param isTrained indicates whether this Dog is trained or not.
     */
    public void setIsTrained(boolean isTrained){
		this.trained = isTrained;
    }
    
    /**
     * @param aAge represents the age of this Dog and must be in the
     *        range 0-29
     */
	public void setAge(int aAge){
		if(aAge >=0 && aAge <= 29){
			super.setAge(aAge);
		}
		
	}
	
	//Other methods
	
	/**
	 * printInfo provides textual output for this Dog to the console.
	 */
    public void printInfo(){
		super.printInfo();
		System.out.println("\n*************** Dog ****************");
		System.out.println("Breed is: " + this.breed);
		System.out.println("I am trained: " + this.trained);
		System.out.println("*************** Dog ****************\n");
    }

	/**
	 * toString produces a text representation of this Dog.
	 *
	 * @return a String representation of this Dog.
	 */
	public String toString(){
		String text = "";
		
		//text += super.toString();
		text += "I am a Dog named " + super.getName() + "\n";
		text += "I am " + super.getAge() + " years old.\n";
		text += "I am a " + this.breed + ", and ";
		if(this.trained){
			text += "I am trained!\n";
		}
		else{
			text += "I am not trained!\n";
		}
		
		return text;
	}
	
	/**
	 * speak provides output for this Cat to a JOptionPane
	 * 
	 */
    public void speak(){
		JOptionPane.showMessageDialog(null, super.getName() + " says: Woof Woof");
    }
	
	/**
	 * equals compares other Object to determine if it is a Dog
	 *    and has identical attributes as this Dog.
	 *
	 * @param other represents a valid Object for comparison.
	 *
	 * @return returns true if other has identical attributes as this Dog, and 
	 *          returns false otherwise.
	 */
    public boolean equals(Object other){
		boolean equal = true;
	
		//check to see if the parameter is even a Dog object
		if(!(other instanceof Dog)){
			return false;
		}

		//we know its a dog, because we would have returned otherwise!
		Dog otherDog = (Dog)other;

		equal = super.equals(otherDog);

		if(!this.breed.equals(otherDog.getBreed())){
			equal = false;
		}
		if(this.trained != otherDog.isTrained()){
			equal = false;
		}

		return equal;
    }

		

    public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.printInfo();
		
		Animal spot = new Dog("Spot", 3, "beagle", true);
		spot.printInfo();
		spot.speak();
    }

} // Dog