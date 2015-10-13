/* 
 * Richard Roman
 * this program computes the sum and difference, product average of two integer
 */

package Chapter2;

import java.util.Scanner;

public class Ch2Prog5 {

	
	public static void main(String[] args) 
	{
	Scanner input; 
	input = new Scanner (System.in);
	
	//User inputs
	int integer1=0;
	int integer2=0;

	System.out.println("Please enter an integer");
	integer1 = input.nextInt();
	
	System.out.println("Please enter another integer");
	integer2 = input.nextInt();
	
	System.out.println(" Sum:        " + (integer1 + integer2)); 
	System.out.println(" Difference: " + (integer1 - integer2));
	System.out.println(" Product:    " + (integer1*integer2));
	System.out.println(" Distance:   " + (Math.abs(integer1-integer2)));
	System.out.println(" Max:        " + (Math.max(integer1,integer2))); 
	System.out.println(" Min:        " + (Math.min(integer1,integer2))); 
	
	
	}


}


