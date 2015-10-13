/* Richard Roman*/

package Chapter2;

import java.util.Scanner;

public class Ch2Prog11 {

	/*
	 * This program determines the cost per 100 miles 
	 * and how far the car can go with  the gas in the tank
	 */
	 
	public static void main(String[] args)
	{
		Scanner input;
		input = new Scanner (System.in);
		
		//Variables
		int numGallonsOfGasInTank=0;
		int numMilesPerGallon=0;
		double numPriceOfGasPerGallon=0;
		
		System.out.println(" How many gallons of gas are in the gas tank?  ");
		numGallonsOfGasInTank = input.nextInt();
		System.out.println(" What is the fuel efficeincy in miles per gallon? ");
		numMilesPerGallon = input.nextInt();
		System.out.println(" What is the price of gas per gallon? ");
		numPriceOfGasPerGallon = input.nextDouble();
		
		
		double numCostPerMile=0;
		double numDistanceDriveable=0;
		
		
		numCostPerMile = numPriceOfGasPerGallon/numMilesPerGallon;
		numDistanceDriveable=numGallonsOfGasInTank * numMilesPerGallon;
		System.out.printf(" The cost per mile is:%.3f", numCostPerMile);
		System.out.printf("\n The distance that you can drive is: %.3f", numDistanceDriveable);
		
		
		
		
		
		
		



	}

}
