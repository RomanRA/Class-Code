package chapter_4;

import java.util.Scanner;

public class Program_4_3A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String user;
		int position = 1;
		
		System.out.println("Enter a string");
		user = input.next();
		System.out.println("The string entered is: " +user+ "\n");
		
		
		
		while( position < user.length())
		{
			char ch = user.charAt(position);
			
				if((ch>= 65) && (ch<=90))
				{
					System.out.println(ch);
					position+=1;
				}
				else		
				{
					position+=1;
				}
			
					

		
		
	}
	}
}
