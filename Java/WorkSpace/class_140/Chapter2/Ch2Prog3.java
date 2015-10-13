//Richard Roman

package Chapter2;

import java.util.Scanner;// must go above class

public class Ch2Prog3 
{


	public static void main(String[] args) 
	{
		
		Scanner input;
		input = new Scanner(System.in); 
		//Declare variables
		double num =0;
		double square=0;
		double cubed=0;
		double fourth=0;
		
		//User input
		System.out.println("Please enter a number then press enter.");
		num = input.nextDouble();
		//Calculations
		square = num*num;
		cubed =  num*num*num;
		fourth = Math.pow(num,4);/* method called for power function from Math
								** A power calls for a double*/
		//Outputs
		System.out.println("The number squared is " +(square));
		System.out.println("The number cubed is " + (cubed)); 
		System.out.println("The number to the fourth power is " + fourth); 
	}


}
