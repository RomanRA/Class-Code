package chapter_4;

import java.util.Scanner;

public class Prog_4_2B {

	
	public static void main(String[] args) {
		
		Scanner userIn = new Scanner(System.in);
		
		double num = 0;
		double counter = 0;
		double totalNum = 0;
		double odd = 0;
		double even = 0;
		
		System.out.println("Enter number");
		num = userIn.nextDouble();
		
		while(counter==0)
		{
			
			if(num%2==0)
			{
				even+=1;
				counter+=1;
				num+=1;
				System.out.println("Enter number");
				num = userIn.nextDouble();
				
			}
			else if(num%2!=0)
			{
				odd+=1;
				counter+=1;
				num+=1;
				System.out.println("Enter number");
				num = userIn.nextDouble();
			}
		System.out.println("total evens"+even);
		System.out.println("total odds"+odd);
		}
	}	
}
