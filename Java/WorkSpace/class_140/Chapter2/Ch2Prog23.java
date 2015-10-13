/*Richard Roman*/

package Chapter2;

import java.util.Scanner;

public class Ch2Prog23 {

	/*
	 * This program describes how to turn a string containing a ten-digit
	phone number (such as "4155551212") into a more readable string with parentheses
	and dashes, like this: "(415) 555-1212".
	Take the substring consisting of the first three characters and surround it with "(" and ") ". This is the
	area code.
	Concatenate the area code, the substring consisting of the next three characters, a hyphen, and the
	substring consisting of the last four characters. This is the formatted number.
	 */
	public static void main(String[] args) 
	{
		Scanner input;
		input = new Scanner(System.in);//Input could be named anything
		/*
		 *  Can declare variable like this
		 *  String phoneNumber;
		 *  string sub1,sub2,sub3;
		 *  I declared each string during program.
		 *  
		 *  sub1 = phoneNummber.substring()
		 */
	
		
		System.out.println(" Enter your 10-digit phone number.\n " + "Dont worry we won't give yuor personal information away! ");
		String phoneNumber = input.next();
		
		String sub1 = phoneNumber.substring(0,3);
		System.out.println("(" + sub1 + ")");//Check to make sure parenthesis were added
		
		String sub2 = phoneNumber.substring(3,6);
		System.out.println(sub2);//check
		
		String sub3 = phoneNumber.substring(6,10);
		System.out.println(sub3);//check

		
		String phoneNumberFormatted = ( "(" + sub1 + ")" + sub2 + "-" + sub3);
		System.out.println(phoneNumberFormatted);
		
		
		
	
		
		
		
		
		
		
		
	}
		

}
