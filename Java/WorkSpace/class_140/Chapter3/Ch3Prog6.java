package Chapter3;
import java.util.Scanner;
public class Ch3Prog6 {

	/*Repeat Exercise P3.5, but before reading the numbers, ask the user whether increasing/
	 *decreasing should be “strict” or “lenient”. In lenient mode, the sequence 3 4 4 is
	 *increasing and the sequence 4 4 4 is both increasing and decreasing.*/
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double num1=0;
		double num2=0;
		double num3=0;
		
		System.out.println("Enter 1 whether increasing/decreasing should be strict or enter 2 for lenient, for the number you enter next ");
		int choice = input.nextInt();
		
		System.out.println(" Enter 3 numbers");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		//System.out.println( num1+ " " +num2+ " " +num3);
		
		
		
		if(choice == 1)
		{
			System.out.println("Your choice was strict");
					if (num1 > num2 && num2 > num3)
		
					{
						System.out.println(" The number are decreasing");
					}
		
					else if ( num1 < num2 && num2 < num3)
					{
						System.out.println( "The numbers are increasing");
					}
			
					else 
					{
			System.out.println(" The numbers are niether increasing nor decreasing");
					}

		

		}
		else
		{
			System.out.println(" Your choice was lenient");
				if (num1 >= num2 && num2 >= num3)
				
				{
					System.out.println(" The number are decreasing");
				}

				else if ( num1 <= num2 && num2 <= num3)
				
				{
					System.out.println(" The numbers are increasing");
				}	
				
				
	
				}
		
		}
	}

			
