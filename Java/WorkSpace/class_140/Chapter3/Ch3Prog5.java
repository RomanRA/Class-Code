package Chapter3;
import java.util.Scanner;
public class Ch3Prog5 {
/*
 * Write a program that reads three numbers and prints “increasing” if they are in
 * increasing order, “decreasing” if they are in decreasing order, and “neither” otherwise.
 * Here, “increasing” means “strictly increasing”, with each value larger than its
 * predecessor. The sequence 3 4 4 would not be considered increasing.
 */
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double num1=0;
		double num2=0;
		double num3=0;
		
		System.out.println(" Enter 3 numbers");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		//System.out.println( num1+ " " +num2+ " " +num3);
		
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
			System.out.println( " The numbers are niether increasing nor decreasing");
		}


	}
}

