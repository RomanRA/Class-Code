package chapter_4;

import java.util.Scanner;

public class Program_4_5 {
	/*
	 * This program  reads a set of floating-point values. then prints the average
	 * the largest and smallest of the values as well as the range,
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double total = 0;
		double num = 0;
		double num2 = 0;
		int counter = 0;
		double average = 0;
		
		System.out.println("Enter a postive number, or enter -99 to quit");
		num = input.nextDouble();
		
		double low = num;
		double high = num;
		
		while (num != -99 )
		{
				total = total + num;
				counter+=1;
				
				num2=num;
				if(num2>high)
				{
					high = num2;
				}
				else if(num2<low) 
				{
					low = num2;
				}
			System.out.println("Enter another number, or -99 to quit");
			num = input.nextDouble();
		}
		
		average = total/counter;
		
		System.out.printf("The average for the numbers you entered is %.1f.\n",average);
		System.out.print("The high is: "+high+" ");
		System.out.println("and the low is: "+low);
		System.out.println("The range is: "+(high-low));
	}

}
