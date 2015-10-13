package chapter_4;

import java.util.Scanner;

public class Review_4_2C {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int sum = 0;
		int num = 0;
		int min = 0;
		int max = 0;
		
		System.out.println("Enter min number");
		min = input.nextInt();
		System.out.println("Your entered:" +min);
		
		System.out.println("Enter max number");
		max = input.nextInt();
		System.out.println("Your entered:" +max);
		
		num = min;
		
		if(num%2==0){
			num = num+=1;
			while (num <= max){
				sum = num + sum;
				System.out.println("Sum is:"+sum);
				counter+=1; 
				num+=2;
			}
		}
		else{
			while (num <= max){
				sum = num + sum;
				System.out.println("Sum is:"+sum);
				counter+=1; 
				num+=2;
		}
		 
	}
	}
}


