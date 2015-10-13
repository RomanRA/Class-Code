/*
 * AircraftTester.java -  tests if an aircraft with 100 gallon of fuel, which gets 50 miles per gallon can go 5500 miles.
 * Name: Richard Roman
 * Course: 150
 * Lab04: Aircraft Object
 * Email: raroman@g.coastal.edu
 * Date: 9/19/2013
 */

import javax.swing.JOptionPane;
public class AircraftTester {

	public static void main(String[] args) {
		int testFuel = 0;
		int testDistance = 0;
		boolean testOK;
		
		//Just print a standard greeting to the console here
		JOptionPane.showMessageDialog(null,"Welcome to the Aircraft Fuel calculator.");

		//After you create an instance of the Aircraft, output this
		Aircraft mainAircraft = new Aircraft(100);
		JOptionPane.showMessageDialog(null,"An object of the Aircraft class has been created.");
		 
		//Here you will have to call the appropriate method of your newly created Aircraft
		//object to find out how much jetFuel the Aircraft has to begin with
		testFuel = mainAircraft.getFuel();
		JOptionPane.showMessageDialog(null,"Intitial value of fuel: "+testFuel+" gallons.");
		
		mainAircraft.setDistance(2000);
		//Find out if your Aircraft can travel 2000 miles, which function
		// will you need to call?
		//Then print the next line indicating whether or not your Aircraft object can fly 2000 miles
		// ---The answer to whether the plane can fly 2000 miles is: true----
		testOK = mainAircraft.travel();
		if(testOK == true)
		{
			JOptionPane.showMessageDialog(null, "The answer to whether the plane can fly 2000 miles is: true");
			mainAircraft.setFuel(60);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The answer to whether the plane can fly 2000 miles is: false");
		}
	
		//Next you need to show how much fuel is left in your Aircraft object
		//----After flying next 2000 miles fuel: 60 gallons----
		JOptionPane.showMessageDialog(null, "After flying 2000 miles fuel: 60 gallons");


		//Find out if your Aircraft can travel 4000 miles, which function
		// will you need to call?
		testOK = mainAircraft.travel();
		//JOptionPane.showMessageDialog(null,testOK);
		//----The answer to whether the plane can fly an extra 4000 miles is: false----
		if(testOK == true)
		{
			JOptionPane.showMessageDialog(null, "The answer to whether the plane can fly an extra 4000 miles is: true");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The answer to whether the plane can fly an extra 4000 miles is: false");
		}
	
		//Which method should you call here?
		//----Setting the value of fuel back to 100.----
		JOptionPane.showMessageDialog(null, "Setting the value of fuel back to 100.");
		mainAircraft.setFuel(100);
		testFuel = mainAircraft.getFuel();
		//System.out.println(testFuel);
		
		//Find out if your Aircraft can travel 4000 miles, which function
		// will you need to call? 
		//The answer to whether the plane can fly an extra 4000 miles is: true
		 
		testOK = mainAircraft.travel();
		if(testOK == true)
		{
			JOptionPane.showMessageDialog(null, "The answer to whether the plane can fly 4000 miles is: true");
			mainAircraft.setFuel(20);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The answer to whether the plane can fly 4000 miles is: false");
		}
		JOptionPane.showMessageDialog(null, "After flying 4000 miles fuel: 20 gallons");
		
		testOK = mainAircraft.travel();
		if(testOK == true)
		{
			JOptionPane.showMessageDialog(null, "The answer to whether the plane can fly an extra 2000 miles is: true");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"The answer to whether the plane can fly an extra 2000 miles is: false");
		}
		JOptionPane.showMessageDialog(null, "Setting the value of fuel back to 100.");
		mainAircraft.setFuel(100);
		
		//find out if aircraft can fly 5000 miles
		//the answer to whether the plane can fly 5000 miles is: true
		testOK = mainAircraft.travel();
		if(testOK == true)
		{
			JOptionPane.showMessageDialog(null, "The answer to whether the plane can fly 5000 miles is: true");
			mainAircraft.setFuel(0);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The answer to whether the plane can fly 5000 miles is: false");
		}
		JOptionPane.showMessageDialog(null, "After flying 5000 miles fuel: 0 gallons");
		
		//find out if the aircraft can fly an extra 500 miles 
		//answer to whether the plane can fly an extra 500 miles is false
		testOK = mainAircraft.travel();
		if(testOK == true)
		{
			JOptionPane.showMessageDialog(null, "The answer to whether the plane can fly an extra 500 miles is: true");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The answer to whether the plane can fly an extra 500 miles is: false");
		}
		
		JOptionPane.showMessageDialog(null, "Setting the value of fuel back to 100.");
		mainAircraft.setFuel(100);
		JOptionPane.showMessageDialog(null, "The aircraft cannot go 5500 miles on 100 gallons of fuel if it gets 50 miles per gallon.");
	}

}
