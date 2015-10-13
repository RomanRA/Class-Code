package Chapter3;
import java.util.Scanner;
public class Ch3Prog9 {

	/* Write a program that reads a temperature value and the letter C for Celsius or F for
	Fahrenheit. Print whether water is liquid, solid, or gaseous at the given temperature
	at sea level.*/
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		
		double tempEntered=0;
		
		System.out.println("Enter temperature");
		tempEntered = input.nextDouble();
		System.out.println("What is the temperature measurement,\n" +
						   "Enter 1 for celcius or 2 for fahrenheit");
		int choice = input.nextInt();
		
		if(choice==1)
		{
			System.out.println("You entered choose: Celcius");
			if(tempEntered <= 0)
			{
				System.out.println("The water is a solid");
			}
			else
			{
				if  (tempEntered >= 100)
				{
					System.out.println("The water is a gas");
				}
				else
				{
					System.out.println("The water is a liquid");
				}//End branch
			}//End Branch
		}
		else
		{
			
		}//End
		if(choice==2)
		{
			System.out.println("You choose Fahrenheit");
			if(tempEntered <= 32)
			{
				System.out.println("The water is a solid");
			}
			else
			{
				if(tempEntered >= 212)
				{
					System.out.println("The water is a gas");
				}
				else
				{
					System.out.println("The water is a liquid");
				}//End Branch
			}//End Branch
		}//End
	
	}
}

		
					
			


