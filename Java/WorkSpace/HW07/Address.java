/**
 *  Address.java
 *  @author Richard A Roman
 *	Course: 150
 *	Homework 07
 *  Date 12/4/2013
 *	email: raroman@coastal.edu
 */
public class Address {

	/**
	 * Class attributes
	 */
	private String city;
	private String state;
	private String zipcode;

	/**
	 * Default constructor
	 */
	public Address(){
		this.city = "No city yet";
		this.state = "No state yet";
		this.zipcode = "No zipcode yet";
	}
	/**
	 * Overloaded constructor
	 */
	public Address(String aCity, String aState, String aZipcode){
		
		this.city = aCity;
		this.state = aState;
		this.zipcode = aZipcode;
	}
	
	 /**
     * @return the city of this Address
     */
	public String getCity(){
		return this.city;
	}
	
	/**
    * @return the state of this Address
    */
	public String getState(){
		return this.state;
	}
	
	/**
	* @return the zipcode of this Address
	*/
	public String getZipCode(){
		return this.zipcode;
	}
	
	/**
	 * setCity sets the City of this Address
	 * 
	 * @param aCity represents the City that will be assigned to this
	 */
	public void setCity(String aCity){
		this.city = aCity;
	}
	
	/**
	 * setState sets the State of this Address
	 * 
	 * @param aState represents the State that will be assigned to this
	 */
	public void setState(String aState){
		this.state = aState;
	}
	
	/**
	 * setZipcode sets the Zipcode of this Address
	 * 
	 * @param aZipcode represents the zipcode that will be assigned to this
	 */
	public void setZipcode(String aZipcode){
		if(aZipcode.length()<11){
			this.zipcode = aZipcode;
		}
	}
	
	/**
     * @return a text representation of this address
     */
	public String toString(){
		String text = "";
	
		text += super.toString() +"\n";
		text += "The city is: " + this.city +"\n";
		text += "The state is: " + this.state + "\n";
		text += "The zipcode is: " + this.zipcode + "\n";
		
		return text;
	}
	
	/**
	 * equals compares other Object to determine if it is a a address
	 *    and has identical attributes as this address.
	 *
	 * @param other represents a valid Object for comparison.
	 *
	 * @return returns true if other has identical attributes otherwise 
	 * returns false.
	 */
	public boolean equals(Object other){
		boolean same = true;
		
		if(!(other instanceof Address)){
			return false;
		}
		
		Address temp = (Address)other;
		
		
		String city = temp.getCity();
		String state = temp.getState();
		String zip = temp.getZipCode();
		
		if(!city.equals(this.city)){
			same = false;
		}
		if(!state.equals(this.state)){
			same = false;
		}
		if(!zip.equals(this.zipcode)){
			same = false;
		}
		
		return same;
	}
}
