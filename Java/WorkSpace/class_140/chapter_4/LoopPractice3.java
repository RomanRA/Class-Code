package chapter_4;

import java.util.Scanner;

public class LoopPractice3 {
//sentinel loopo
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		
		
		double grade = 0;
		double average = 0;
		double sum = 0;
		final double SENTINEL = -99;
	
		int counter=0;
		
		System.out.println("Enter Grade:");
		grade = input.nextDouble();
		System.out.println("You entered:" +grade);
		while(grade != SENTINEL)
		{
			//can put 3 above statements in loop
			//OR if(grade == SENTINEL)
				//break;
			
			//OR if(grade != SENTINEL){
			
				sum = grade + sum;
				counter++;
				
				System.out.println("Enter Grade:");
				grade = input.nextDouble();
				System.out.println("You entered:" +grade);
			}
		
		System.out.println("Sum: " +sum);
		average = sum/counter;
		System.out.println("Average: " + average);
	}

}
