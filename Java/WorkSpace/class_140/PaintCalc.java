
/* 
*Richard Roman 
*This program calculates the paintable surface area of a house
*/

import java.util.Scanner; 

public class PaintCalc 
{
	public static double calculateSurfaceAreaOfHouse(){
	// should come up or return with a double value

	
		Scanner input;
		input = new Scanner(System.in); //Can put in one line. Primitive
		
		//User inputs
		//" the int houseLength" is a variable
		//-setting aside memory and specifying type of data 
		//"houselength=0" is an assignment statement
		
		int houseLength=0;
		int houseWidth=0;
		int houseHeight=0;
		
		int windowLength=0, windowWidth=0;
		int doorLength=0, doorHeight=0;
		int numWindows=0,numDoors=0;
		
		//Calculated
		int rawSurfaceArea=0;
		int windowArea=0, doorArea=0;
		int totalSurfaceArea=0;
		
		System.out.println("Enter the house length:");
		houseLength = input.nextInt(); // always want to store values
		System.out.println("You entered : " + houseLength);
		System.out.println("Enter the house width:");
		houseWidth = input.nextInt(); 
		System.out.println("You entered : " + houseWidth);
		System.out.println("Enter the house height:");
		houseHeight = input.nextInt(); 
		System.out.println("You entered : " + houseHeight);
		
		rawSurfaceArea = (2*houseLength*houseHeight)+(2*houseWidth*houseHeight);
		System.out.println(" Raw Surface Area is: " + rawSurfaceArea);
		
		System.out.println("Enter the window length:");
		windowLength = input.nextInt(); 
		System.out.println("You entered : " + windowLength);
		System.out.println("Enter the window Width:");
		windowWidth = input.nextInt(); // always want to store values
		System.out.println("You entered : " + windowWidth);
		System.out.println("Enter the Number of Windows:");
		numWindows = input.nextInt(); // always want to store values
		System.out.println("You entered : " + numWindows);
		
		windowArea = (windowLength*windowWidth*numWindows);
		System.out.println(" The Total Window Area is: " + windowArea);
		
		System.out.println(" Enter Door length");
		doorLength = input.nextInt();
		System.out.println(" You entered : " + doorLength);
	    System.out.println(" Enter door Height");
	    doorHeight = input.nextInt();
	    System.out.println(" Enter number of Doors");
	    numDoors = input.nextInt();
	    
	    doorArea = (doorLength*doorHeight*numDoors);
	    
	    totalSurfaceArea = (rawSurfaceArea-(windowArea + doorArea));
	    
	    System.out.print(" If the size of a house is " + houseLength + (" by ") + houseWidth + (" by ") + houseHeight);
	    System.out.print(" , has " + numWindows + " windows ");
	    System.out.println(" and " + numDoors + " doors ");
	    
	    //System.out.println( " ,the total paintable surface of that house is " + totalSurfaceArea//
	    
	    
	    
	   return totalSurfaceArea;
	   
	    
		
		
	}

}
