package chapter_4;

import java.util.Scanner;

public class Review_4_2D {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		int lastDigit = 0;
		
		System.out.println("Enter a number to compute the sum of all of the odd digits within the number");
		num = input.nextInt();
		System.out.println("You entered:" +num);
		
		while(num >0)
		{
			lastDigit = num%10;
			sum = sum +lastDigit;
			num = num/10;
		}
		System.out.println("The sum is:"+sum);
	}
}
		
		
		





