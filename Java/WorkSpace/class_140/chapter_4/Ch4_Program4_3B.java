package chapter_4;

import java.util.Scanner;

public class Ch4_Program4_3B {
	/*
	 * this program prints the second letters of every string
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String user;
		int position = 1;
		
		System.out.println("Enter a string");
		user = input.next();
		System.out.println("The string entered is: " +user+ "\n");
		
		
		
		while( position < user.length())
		{
			char ch = user.charAt(position);
			position+=2;
			{
				System.out.println(ch);
			}
					
				
		}
	}
	
}

		
		

	

