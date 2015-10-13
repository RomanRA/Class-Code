/**
 *  Warehouse.java
 *  @author Richard A Roman
 *	Course: 150
 *	Final LAb
 *	Date 12/1ab/2013
 *	email: raroman@coastal.edu
 */

public class Warehouse extends Building{
	/**
	 * Class attributes
	 */
	private int squareFootage;
	
	/**
	 * 
	 * @param aName
	 * @param aCity
	 * @param floors
	 * @param footage
	 */
	public Warehouse(String aName, String aCity, int floors, int footage){
		super(aName, aCity, floors);
		this.squareFootage = footage;
	}
	
	
	//accessor
	public int getSquareFootage(){
		return this.squareFootage;
	}
	
	//mutator
	public void setSquareFootage(int footage){
		this.squareFootage = footage;
	}
	
	
	public String toString(){
		String text = "";
		
		text += super.toString() +"\n";
		text += "The name is: " + this.getName()+"\n";
		text += "The city is: " + this.getCity()+"\n";
		text += "The number of floors are: " + this.getNumberOfFloors()+"\n";
		text += "The square footage is: "+ this.getSquareFootage()+"\n";
		
		return text;
	}
	
	/**
	 * equals compares other Object to determine if it is a Warehouse
	 *    and has identical attributes as this warehouse.
	 *
	 * @param other represents a valid Object for comparison.
	 *
	 * @return returns true if other has identical attributes otherwise 
	 * returns false.
	 */
	public boolean equals(Object other){
		boolean same = true;
		
		if(!(other instanceof Warehouse)){
			return false;
		}
		
		Warehouse temp = (Warehouse)other;
		same = super.equals(other);
		
		int sqFootage = temp.getSquareFootage();
		
		if((!(sqFootage == this.squareFootage))){
			same = false;
		}
		
		return same;
	}
}
