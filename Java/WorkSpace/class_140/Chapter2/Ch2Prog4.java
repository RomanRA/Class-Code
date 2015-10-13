/* 
 * Richard Roman
 * this program computes the sum and difference, product average of two integer
 */

package Chapter2;

import java.util.Scanner;

public class Ch2Prog4 {

	
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
	
	System.out.println(" The sum of the two integers you entered is " + (integer1 + integer2)); 
	System.out.println(" The difference  is " + (integer1 - integer2));
	System.out.println(" The Product is " + (integer1*integer2));
	System.out.println(" The distance is " + (Math.abs(integer1-integer2)));
	System.out.println(" The largest one is " + (Math.max(integer1,integer2))); 
	System.out.println(" The smallest one is " + (Math.min(integer1,integer2))); 
	
	
	}


}
