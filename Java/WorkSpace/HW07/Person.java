/**
 *  Person.java
 *  @author Richard A Roman
 *	Course: 150
 *	Homework 07
 *	Date 12/4/2013
 *	email: raroman@coastal.edu
 */
public class Person extends Object {
	
	/**
	 * Class attributes
	 */
	private String firstName;
	private String lastName;
	private String email;
	private Address personAddress;
	
	/**
	 * Default constructor
	 */
	public Person(){
		
		this.firstName = "No first name yet";
		this.lastName = "No  last name yet";
		this.email = "No email yet";
		this.personAddress = new Address();
	}
	
	/**
	 * Overloaded constructor
	 */
	public Person(String aFirstName, String aLastName, String aEmail){
		
		this.firstName = aFirstName;
		this.lastName = aLastName;
		this.email = aEmail;
		this.personAddress = new Address();
	}
	
	 /**
     * @return the FirstName of this Person
     */
	public String getFirstName(){
		return this.firstName;
	}
	
	/**
	 * @return the LastName of this Person
	 */
	public String getLastName(){
		return this.lastName;
	}
	
	/**
	 * @return the Email of this Person
	 */
	public String getEmail(){
		return this.email;
	}
	
	/**
	 * setFirstName sets the FirstName of this Person
	 * 
	 * @param aFirstName represents the FirstName that will be assigned to this
	 */
	public void setFirstName(String aFirstName){
		this.firstName = aFirstName;
	}
	
	/**
	 * setLastName sets the LastName of this Person
	 * 
	 * @param aLastName represents the LastName that will be assigned to this
	 */
	public void setLastName(String aLastName){
		this.lastName = aLastName;
	}
	
	/**
	 * setEmail sets the Email of this Person
	 * 
	 * @param aEmail represents the Email that will be assigned to this
	 */
	public void setEmail(String aEmail){
		this.email = aEmail;
	}
	
	/**
	 * setAddress sets the Address of this Person
	 * 
	 * @param aCity
	 * @param aState
	 * @param aZipcode
	 */
	public void setAddress(String aCity, String aState, String aZipcode){
		this.personAddress.setCity(aCity);
		this.personAddress.setState(aState);
		this.personAddress.setZipcode(aZipcode);
	}
	 
	/**
	 * toString 
     * @return a text representation of this Object
     */
	public String toString(){
		String text = "";
		
		//text += super.toString() +"\n";
		text += "The first name is: " + this.firstName+"\n";
		text += "The last name is: " + this.lastName + "\n";
		text += "The email is: " + this.email + "\n";
		text += "The city is: " + this.personAddress.getCity() +"\n";
		text += "The state is: " + this.personAddress.getState() + "\n";
		text += "The zipcode is: " + this.personAddress.getZipCode() + "\n";
		
		return text;
	}
	
	/**
	 * equals compares other Object to determine if it is a a Person
	 *    and has identical attributes as this Person.
	 *
	 * @param other represents a valid Object for comparison.
	 *
	 * @return returns true if other has identical attributes otherwise 
	 * returns false.
	 */
	public boolean equals(Object other){
		boolean same = true;
		
		if(!(other instanceof Person)){
			return false;
		}
		
		Person temp = (Person)other;
		
		String fName = temp.getFirstName();
		String lName = temp.getLastName();
		String email = temp.getEmail();
		
		if(!fName.equals(this.firstName)){
			same = false;
		}
		if(!lName.equals(this.lastName)){
			same = false;
		}
		if(!email.equals(this.email)){
			same = false;
		}
		
		
		
		return same;
	}
	

}
