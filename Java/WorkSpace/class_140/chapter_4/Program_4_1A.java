package chapter_4;

import java.util.Scanner;

public class Program_4_1A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int num=0;
		int sum = 0;
	
		while(counter < 100)
			{
			num+=2;
			sum=num+sum;
			System.out.println("The sum is:"+sum);
			counter+=2;
		}

}
}