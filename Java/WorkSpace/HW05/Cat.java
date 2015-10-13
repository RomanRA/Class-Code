/*
 * Cat.java - Cat object subclass
 * Name: Richard Roman
 * Course: 150
 * Homework05
 * Email: raroman@coastal.edu
 * Date: 10/24/2013
 */
import javax.swing.JOptionPane; 
public class Cat extends Animal {

   /**
    * Class attributes: instance variables
    */
    private String breed;
	private int numberOfLives; /** in range 0 - 9, with 0 indicating not alive **/
	
	
	/**
	 * default constructor
	 */
    public Cat() {
		super();
		this.breed = "no breed yet";
		this.numberOfLives = 9;
    }
    
    /**
     * overloaded constructor
     * 
     * @param name of this Cat
     * @param age the age of this Cat must be in the range 0 -
     * @param aBreed
     * @param lives
     */
    public Cat(String name, int age, String aBreed, int lives){
		super(name, age);
		this. breed = aBreed;
		this.numberOfLives = lives;
    }
    
    //accessor

    /**
     * @return the breed of this Cat
     */
    public String getBreed(){
		return this.breed;
	}
	
    /**
     * @return the number of lives of this Cat
     */
	public int getNumberOfLives(){
		return this.numberOfLives;
    }

	
	
    //mutators
	
	/**
	 * setBreed sets the Breed of this Cat
	 * 
	 * @param aBreed represents the Breed that will be assigned to this
	 */
	public void setBreed(String aBreed){
		this.breed = aBreed;
	}
	
	/**
	 * setNumberOfLives sets the number of lives of this Cat
	 * 
	 * @param aNumber must be in the range 0-9
	 */
    public void setNumberOfLives(int aNumber){
		if(aNumber >=0 && aNumber <=9){
			this.numberOfLives = aNumber;
		}
    }

    /**
     * setAge sets the age of this Cat
     * @param aAge must be in the range 0-38
     */
	public void setAge(int aAge){
		if(aAge >=0 && aAge <= 38){
			super.setAge(aAge);
		}
	}

	
	//other methods
    
	/**
	 * printInfo provides textual output for this Cat to the console.
	 */
    public void printInfo(){
		super.printInfo();
		System.out.println("\n**************** Cat ******************");
		System.out.println("Number of lives is:" + this.numberOfLives);
		System.out.println("**************** Cat ******************\n");
    }
    

	/**
	 * toString produces a text representation of this Cat.
	 *
	 * @return a String representation of this Cat.
	 */
	public String toString(){
		String text = "";
		
		//text += super.toString();
		text += "I am a Cat named " + super.getName() + "\n";
		text += "I am " + super.getAge() + " years old.\n";
		text += "I am a " + this.breed + ", and I have ";
		text += this.numberOfLives +" lives left!\n";
		
		return text;
	}

	
	/**
	 * speak provides output for this Cat to a JOptionPane
	 * 
	 */
    public void speak(){
		JOptionPane.showMessageDialog(null, super.getName() + " says: Meow Meow");
    }

	
	/**
	 * equals compares other Object to determine if it is a Cat
	 *    and has identical attributes as this Cat.
	 *
	 * @param other represents a valid Object for comparison.
	 *
	 * @return returns true if other has identical attributes as this Cat, and 
	 *          returns false otherwise.
	 */
	public boolean equals(Object other){
		boolean same = true;
		
		if(!(other instanceof Cat)){
			return false;
		}
		
		Cat temp = (Cat)other;
		
		same = super.equals(other);
		
		String otherBreed = temp.getBreed();
		int otherNumberOfLives = temp.getNumberOfLives();
		
		if(!otherBreed.equals(this.breed)){
			same = false;
		}
		
		if(otherNumberOfLives != this.numberOfLives){
			same = false;
		}
		
		return same;
	}
	   
    
} // Cat
