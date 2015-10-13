//Richard Roman
package Chapter3;
import java.util.Scanner;
public class Ch3Prog4 {
	/*
	 * This program reads three numbers and prints “all the same” if they are all the 
	 * same, “all different” if they are all different, and “neither” otherwise.
	 */
	 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1=0;
		int num2=0;
		int num3=0;
		
		System.out.println("Enter three numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		
		System.out.println("You entered: "+num1+" "+num2+" "+num3);
	
		if ((num1 == num2)&&(num2 == num3))
		{
			System.out.println("All the same");
		}
		else if((num1 != num2) && (num2 != num3))
		{
			System.out.println("All different");
		}
		else
		{
			System.out.println("Neither");
		}
	}
}