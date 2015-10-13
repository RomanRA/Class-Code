/*
 * Animal.java - Animal object is superclass
 * Name: Richard Roman
 * Course: 150
 * Homework05
 * Email: raroman@coastal.edu
 * Date: 10/24/2013
 */
import javax.swing.JOptionPane; 
public abstract class Animal extends Object {
   /**
    * Class attributes: instance variables
    */
	private String name;
    private int age;  /** in years **/

    /*
     * default Animal constructor
     */
    public Animal() {
		System.out.println("Animal.Animal() constructor.");
		this.name = "no name yet";
		this.age = 0;
    }
    
    /*
     * Overloaded Animal constructor
     * 
     * @param name represents the name of this Animal
     * @param age represents the age of this Animal and should
     *         be in the range 0-400 years old.
     */
    public Animal(String name, int age){
		System.out.println("Animal.Animal(String, int) constructor.");
		this.name = name;
		this.age = age;
    }

   	//accessors
	
	/**
	 * @return the name of this Animal
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * @return the age of this Animal
	 */
	public int getAge(){
		return this.age;
	}


    //mutators
 
	/**
	 * Note functionality
	 * @param aName for this Animal
	 * @return the name for this Animal has been set
	 */
	public void setName(String aName){
		this.name = aName;
	}
	
	/**
	 * sets the age of this Animal
	 * @param aAge must be in the range of 0-400
	 */
	public void setAge(int aAge){
		if(!(aAge < 0 && age > 400)){
			this.age = aAge;
		}
	}
    
	/**
	 * printInfo provides textual output for this Animal to the console.
	 */
    public void printInfo(){
		System.out.println("\n************** Animal *************");
		System.out.println("Name is: " + this.name);
		System.out.println("Age is: " + this.age);
		System.out.println("************** Animal *************\n");
    }


    /**
     * @return a textual representation of this
     */
	public String toString(){
		String text = "";
		
		text += super.toString() +"\n";
		text += "Name is: " + this.name +"\n";
		text += "Age is: " + this.age + "\n";
		
		return text;
	}
	
	/**
	 * compares another Animal with this Animal
	 * 
	 * @param other represents an Animal for comparison.
	 * 
	 * @return true if other Animal has identical values for its
	 *         attributes, otherwise returns false
	 */
	public boolean equals(Animal other){
		boolean same = true;
		
		String otherName = other.getName();
		int otherAge = other.getAge();
		
		if(!otherName.equals(this.name)){
			same = false;
		}
		
		if(otherAge != this.age){
			same = false;
		}
		
		return same;
	}
	
	
	/**
	 * compares another Object with this Animal
	 * 
	 * @param other represents an Object for comparison.
	 * 
	 * @return true if other Object is an Animal and has identical values for its
	 *         attributes, otherwise returns false
	 */
	public boolean equals(Object other){
		boolean same = true;
		
		if(!(other instanceof Animal)){
			return false;
		}
		
		Animal temp = (Animal)other;
		String otherName = temp.getName();
		int otherAge = temp.getAge();
		
		if(!otherName.equals(this.name)){
			same = false;
		}
		
		if(otherAge != this.age){
			same = false;
		}
		
		return same;
	}



	/**
	 * helper method that prompts the user via JOptionPane for values to be
	 * assigned to the param
	 * @param aAnimal represents an Animal object that is to have its attributes
	 *        set to user input.
	 */
    public static void loadAnimal(Animal aAnimal){
		String name = JOptionPane.showInputDialog("Enter the name:");
		String age = JOptionPane.showInputDialog("Enter the age:");
		
		aAnimal.setName(name);
		aAnimal.setAge(Integer.parseInt(age));
		//JOptionPane.showMessageDialog(null,"The Animals name is: "+name);
		//JOptionPane.showMessageDialog(null, "The age of the animal is: "+age);
    }
	
	
	/**
	 * abstract method must be defined in the child class or it must be
	 *    abstract as well.
	 */
	public abstract void speak();

       
} // Animal
