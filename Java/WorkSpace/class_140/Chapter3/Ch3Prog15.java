package Chapter3;
import java.util.Scanner;
public class Ch3Prog15 {
/*
 * Reads in three floating-point numbers and prints the largest of
 * the three inputs.
 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double num1=0;
		double num2=0;
		double num3=0;
		
		System.out.println("enter three floating point numbers");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		//Can use and && statements
		if (num1 > num2)
		{
			if (num1>num3)
			{
				System.out.println(num1+ " is the largest");
			}
			else if (num3>num2)
			{
				System.out.println(num3+ " is the largest");
			}
			else 
			{
				System.out.println(num2+ " is the largest");
			}
		}
		else if (num2 > num3)
		{
			System.out.println(num2+ " is the largest");
		}
		else 
		{
			System.out.println(num3+ " is the largest");
		}
	}
}

