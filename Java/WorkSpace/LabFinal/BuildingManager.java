/**
 *  BuildingManager.java
 *  @author Richard A Roman
 *	Course: 150
 *	Final LAb
 *	Date 12/1ab/2013
 *	email: raroman@coastal.edu
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

import MyException.EmptyDatabaseException;


public class BuildingManager {

	
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		
		//Declare variables
		String userFName = "";
		String userLName = "";
		String returnedAnswer = "";
		String buildingName = "";
		String buildingCity = "";
		String buildingType = "";
		int buildingNumberOfFloors = 0 ;
		int buildingNumberOfSuites = 0 ;
		int buildingSqFootage = 0;
		
		//Create a new building dataBase
		BuildingDatabase dataBase = new BuildingDatabase();
		
		boolean done = false;
		
		JOptionPane.showMessageDialog(null, "***** Welcome To The Building Manager Program. *****");
		System.out.println("Please enter your name: ");
		userFName = keyboardInput.nextLine();
		
	
		while(!done){
			
			
			System.out.println("*******************");
			System.out.println("Enter \"Add\" to add a Building" +"\n"
								+ "Enter \"Remove\" to remove a Building" +"\n"
								+ "Enter \"Show All\" to show all Buildings" +"\n"
								+ "Enter \"Find\" to search for a Building" +"\n"
								+ "Enter \"Most\" to display the aame of the building with the most floors" +"\n"
								+ "Enter \"Quit\" to exit the program");
			System.out.println("*******************");
			
			returnedAnswer = keyboardInput.nextLine();
			
				if(!returnedAnswer.equalsIgnoreCase("quit"))
				{
					if(returnedAnswer.equalsIgnoreCase("add")){
						
						System.out.println("Type of Building (Hotel/Warehouse)? ");
						buildingType = keyboardInput.nextLine();
						
						if(buildingType.equalsIgnoreCase("hotel")){
							
							System.out.println("Enter the "+buildingType+"'s name: ");
							buildingName = keyboardInput.nextLine();
							
							System.out.println("Enter the "+buildingType+"'s city: ");
							buildingCity = keyboardInput.nextLine();
							
							System.out.println("Enter the "+buildingName+"'s number of floors: ");
							buildingNumberOfFloors = keyboardInput.nextInt();
							
							System.out.println("Enter the "+buildingName+"'s number of suites: ");
							buildingNumberOfSuites = keyboardInput.nextInt();
							
							keyboardInput.nextLine();//clear newline character
							
							Building newBuilding = new Hotel(buildingName,buildingCity,buildingNumberOfFloors,buildingNumberOfSuites);
							
							dataBase.addBuilding(newBuilding);
						}
						else if(buildingType.equals("warehouse")){
							
							
							System.out.println("Enter the "+buildingType+"'s name: ");
							buildingName = keyboardInput.nextLine();
							
							System.out.println("Enter the "+buildingType+"'s city: ");
							buildingCity = keyboardInput.nextLine();
							
							System.out.println("Enter the "+buildingName+"'s number of floors: ");
							buildingNumberOfFloors = keyboardInput.nextInt();
							
							System.out.println("Enter the "+buildingName+"'s square footage: ");
							buildingSqFootage = keyboardInput.nextInt();
							
							keyboardInput.nextLine();//clear newline character
							
							Building newBuilding = new Warehouse(buildingName,buildingCity,buildingNumberOfFloors,buildingSqFootage);
							
							dataBase.addBuilding(newBuilding);
						}
						
						
						
					}
					else if(returnedAnswer.equalsIgnoreCase("remove")){
						
						//Check the arrayList inside dataBase
						if(!dataBase.isEmpty()){
							System.out.println("Enter the name of the building you want to delete");
							buildingName = keyboardInput.next();
							
	
							keyboardInput.nextLine();//Clear line
							
							//dataBase.removeBuilding(buildingName);
							
						}
						else{
							System.out.println("Sorry "+buildingName+",does not have any entries.");
						}
						
				
					}
					else if(returnedAnswer.equalsIgnoreCase("find")){
						System.out.println("Enter the name of the building you want to find");
						String tempName = keyboardInput.next();
						
						//System.out.println(fName+" , "+lName);
						keyboardInput.nextLine();//Clear line
						
						//dataBase.showBuildingInfo(tempName);
						
						}
						
					}
					else if(returnedAnswer.equalsIgnoreCase("most")){
						
					}	
				
				else{
					System.out.println("GoodBye " +userFName+ ", Thank you for using the ***Building Manager Program*** have a nice day!");
					done = true;
				}
				
				
				
			}//End While loop
	
	}//End Main

}//End Class
