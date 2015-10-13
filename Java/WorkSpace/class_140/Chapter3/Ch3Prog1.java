//Richard Roman
package Chapter3;
import java.util.Scanner;
public class Ch3Prog1 {
/*
 * This program reads an integer and prints whether it is 
 * negative, zero, or postive.
 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		int num=0;
		
		System.out.println( "Please enter an integer");
		num = input.nextInt();
		
		if (num<0)
		{
			System.out.println( "Your Number is a negative: " +num);
		}
		
		else if (num>0)
		{
			System.out.println( "Your Number is postive: " +num);
		}
		
		else
		{
			System.out.println( "Your Number is: " +num);
		}
	}

}
