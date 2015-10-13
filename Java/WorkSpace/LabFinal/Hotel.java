/**
 *  Hotel.java
 *  @author Richard A Roman
 *	Course: 150
 *	Final LAb
 *	Date 12/1ab/2013
 *	email: raroman@coastal.edu
 */
public class Hotel extends Building {
	/**
	 * Class attributes
	 */
	private int numberOfSuites;

	/**
	 * Constructor
	 * @param aName
	 * @param aCity
	 * @param floors
	 * @param suites
	 */
	public Hotel(String aName,String aCity,int floors,int suites){
		super(aName, aCity, floors);
		this.numberOfSuites = suites;
	}
	
	//accessor
	public int getNumberOfSuites(){
		return this.numberOfSuites;
	}
	
	//mutator
	public void setNumberOfSuites(int suites){
		this.numberOfSuites = suites;
	}
	
	
	public String toString(){
		String text = "";
		
		text += super.toString() +"\n";
		text += "The name is: " + this.getName()+"\n";
		text += "The city is: " + this.getCity()+"\n";
		text += "The number of floors are: " + this.getNumberOfFloors()+"\n";
		text += "The square footage is: "+ this.getNumberOfSuites()+"\n";
		
		return text;
	}
	
	
	/**
	 * equals compares other Object to determine if it is a Hotel
	 *    and has identical attributes as this Hotel.
	 *
	 * @param other represents a valid Object for comparison.
	 *
	 * @return returns true if other has identical attributes otherwise 
	 * returns false.
	 */
	public boolean equals(Object other){
		boolean same = true;
		
		if(!(other instanceof Hotel)){
			return false;
		}
		
		Hotel temp = (Hotel)other;
		same = super.equals(other);
		
		int suites = temp.getNumberOfSuites();
		
		if((!(suites == this.numberOfSuites))){
			same = false;
		}
		
		return same;
	}
	
	
}
