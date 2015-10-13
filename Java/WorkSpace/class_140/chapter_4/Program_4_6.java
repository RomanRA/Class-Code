package chapter_4;

import java.util.Scanner;

public class Program_4_6 {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean a = true;
		double smallest = 0;
		double largest = 0;
		
		System.out.println("Enter a value");
		largest= input.nextDouble();
		
		while(input.hasNextDouble())
		{
			double num = input.nextDouble();
			if(num > largest)
			{
				largest = num;
			}
		
		smallest = input.nextDouble();
		
		while(input.haasNextDouble)
	}

}
