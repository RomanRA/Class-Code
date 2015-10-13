/**
 *  BuildingDatabase.java
 *  @author Richard A Roman
 *	Course: 150
 *	Final LAb
 *	Date 12/1ab/2013
 *	email: raroman@coastal.edu
 */
import java.util.ArrayList;
import MyException.EmptyDatabaseException;


public class BuildingDatabase{

	ArrayList<Building> aList = new ArrayList<Building>();
	private String tempName;
	private String tempCity;
	
	/**
	 * Default Constructor
	 */
	public BuildingDatabase(){
		
	}
	
	
	/**
	 * addBuilding add Building object to the ArrayList
	 * @param aBuilding
	 */
	public void addBuilding(Building aBuilding){
		if(aList.isEmpty()){
			aList.add(aBuilding);
			aList.toString();
		}
		else if(!aList.isEmpty()){
			aList.add(aBuilding);
		}
	
	}
	
	
	/**
	 * removeBuilding removes the Building object from the arrayList
	 * @param aBuilding
	 * @return
	 * @throws EmptyDatabaseException
	 */
	public Building removeBuilding(Building aBuilding)throws EmptyDatabaseException{
		Building deletedBuilding = null;
		

		for(int index = 0; index < aList.size();index++){
			tempName = aList.get(index).getName();
			tempCity = aList.get(index).getCity();
			
			if(tempName.equalsIgnoreCase(aBuilding.getName()) && tempCity.equalsIgnoreCase(aBuilding.getCity())){
				deletedBuilding = aList.remove(index);
			}
		}
		if(deletedBuilding == null){
			throw new EmptyDatabaseException("Entry not found: "+aBuilding.getName()+" "+aBuilding.getCity()+" is not an entry.");
		}
		
		return deletedBuilding;
	}
	

	/**
	 * showBuildingInfo search for the building name and print out the city it is in
	 * @param searchName
	 */
	public void showBuildingInfo(String searchName) throws EmptyDatabaseException{
		Building foundBuilding = null;
		
			for(int index = 0; index < aList.size(); index++){
				tempName = aList.get(index).getName();
				
				if(tempName.equalsIgnoreCase(searchName)){
					foundBuilding = aList.get(index);
					System.out.println("The city with the building name "+searchName+" is: "+ foundBuilding.getCity());
				}
				
			}
			if(foundBuilding == null){
				throw new EmptyDatabaseException("Entry not found: "+searchName+" is not an entry.");
			}
	}
	
	/**
	 * showAll prints out the names of all the building in the ArrayList
	 */
	public void showAll(){
		System.out.println("The name of the Buildings are: ");
		int count = 1;
		for(int index = 0; index < aList.size(); index++){
			tempName = aList.get(index).getName();
			System.out.println(count+".)"+tempName);
			count++;
		}
		
	}
	
	/**
	 * printBuildngWithMostFloors
	 * @return name of building with the most floors
	 */
	public void printBuildingWithMostFloors(){
		
	}
	
	
	public boolean isEmpty() {
		if(aList.isEmpty()){
			return true;
		}
		return false;
	}
}
