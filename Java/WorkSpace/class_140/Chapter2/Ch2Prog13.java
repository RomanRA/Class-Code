/*Richard Roman*/

package Chapter2;

import java.util.Scanner;
/*
 * This program reads a number between 1,000 and 999,999 from the user,
where the user enters a comma in the input. Then prints the number without a
comma.
 */
public class Ch2Prog13 {

	public static void main(String[] args) 
	{
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.print("Enter a number between 1,000 and 999,999");
		String Number = input.next();
		
		int n = Number.length();
		
		
		
		//Seperates the first three characters from last three
		/*Hint: Read the input as a string. Measure the length of the string. Suppose it contains
		n characters. Then extract substrings consisting of the first n – 4 characters and the
		last three characters
		*/
		
		String sub2 = Number.substring((n-3),n);//selects postions 
		String sub1 = Number.substring(0,(n-4));//selects postions 
		
		System.out.print(sub1);
		System.out.println(sub2);
		
		
		
		

	}

}
