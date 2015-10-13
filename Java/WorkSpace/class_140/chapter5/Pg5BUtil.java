package chapter5;

import java.util.Scanner;

public class Pg5BUtil {

	/*
	 * Write the following method and provide a program to test them
	 * double average(double x, double y, double z), returning the average of the
	 * arguments
	 */
	public static void main(String[] args) {
		double value = Pg5BUtil.average();
		System.out.println("The average is: "+value);

	}

	
	public static double average(){
		Scanner in = new Scanner(System.in);
		double num = 0;
		double sum = 0;
		System.out.println("How many number do you want to average?");
		double times = in.nextDouble();
		for(int i=0;i<times;i++)
		{
			System.out.println("Enter a number you wish to average");
			num = in.nextDouble();
			sum = num+sum;
		}
		double average = sum/times;
		return average;
		
	}
	
}
