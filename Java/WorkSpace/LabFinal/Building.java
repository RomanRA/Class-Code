/**
 *  Building.java
 *  @author Richard A Roman
 *	Course: 150
 *	Final LAb
 *	Date 12/1ab/2013
 *	email: raroman@coastal.edu
 */
public abstract class Building extends Object {

	/**
	 * Class atrributes
	 */
	private String name;
	private String city;
	private int numberOfFloors;
	
	
	/**
	 * Overloaded constructor
	 */
	public Building(String aName, String aCity, int floors){
		this.name = aName;
		this.city = aCity;
		this.numberOfFloors = floors;
	}
	
	
	//accessors
	public String getName(){
		return this.name;
	}
	
	public String getCity(){
		return this.city;
	}
	
	public int getNumberOfFloors(){
		return this.numberOfFloors;
	}
	
	//mutators
	public void setName(String aName){
		this.name = aName;
	}
	
	public void setCity(String aCity){
		this.city = aCity;
	}
	
	public void setNumberOfFloors(int floors){
		this.numberOfFloors = floors;
	}
	
	
	/**
	 * equals compares other Object to determine if it is a Building
	 *    and has identical attributes as this Building.
	 *
	 * @param other represents a valid Object for comparison.
	 *
	 * @return returns true if other has identical attributes otherwise 
	 * returns false.
	 */
	public boolean equals(Object other){
		boolean same = true;
		
		if(!(other instanceof Building)){
			return false;
		}
		
		Building temp = (Building)other;
		
		String name = temp.getName();
		String city = temp.getCity();
		int floors = temp.getNumberOfFloors();
		
		if(!name.equals(this.name)){
			same = false;
		}
		if(!city.equals(this.city)){
			same = false;
		}
		if(!(floors == this.numberOfFloors)){
			same = false;
		}
		return same;
	}
	
	
}
