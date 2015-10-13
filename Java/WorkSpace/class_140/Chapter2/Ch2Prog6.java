package Chapter2;

import java.util.Scanner ;

public class Ch2Prog6 {


	public static void main(String[] args) 
	{
		Scanner input;
		input = new Scanner (System.in);
		
		//declared inputs by user
		double measurementInMeters =0;
		final double Km=0.001;
		final double Miles=.621371192237; 
		final double Feet= 5280;
		final double Inches= 12;
		double measurementInKm=0;
		double measurementInMiles=0;
		double measurementInFeet=0;
		double measurementInInches=0;
		
		
		System.out.println(" Please enter Measurements in Meters");
		measurementInMeters = input.nextDouble();
		System.out.println(" You entered " + measurementInMeters + " meters ");
		
		measurementInKm = measurementInMeters * Km;
		
		measurementInMiles = measurementInKm * Miles;
		
		measurementInFeet = measurementInMiles * Feet; 
		
		measurementInInches = measurementInFeet * Inches;
		
		System.out.println("In Meters " + measurementInMeters);
		System.out.println("In Miles " + measurementInMiles);
		System.out.println("In feet " + measurementInFeet);
		System.out.println("In inches " + measurementInInches);
		
		
	

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
