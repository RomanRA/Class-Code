package chapter_4;

import java.util.Scanner;


public class  Ch4_Prog_18 {
	/*
	 * 
	 * 
	 */
	public static void main(String[] args) 
	{
	
		Scanner input = new Scanner(System.in);
		
		int num;
		int count=0;
		
		System.out.println("enter the number you wish to find primes up to: ");
			num=input.nextInt();
			
			for(int i=2;i<num;i++)
			{
				count=0;
				for(int x=2;x<i;x++)
				{
					if(i%x==0)
					count=1;
				}
				if(count==0)
					System.out.println(i);
			}
		}
	}

