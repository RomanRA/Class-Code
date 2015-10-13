package chapter5;

import java.util.Scanner;

public class CharUtil {
	public static void main(String[] args) {
		//char x = CharUtil.secondChar();
		//System.out.println("X is: "+x);
		boolean valid = CharUtil.validateEmail();
		System.out.println(valid);
		
	}
	
	/* 
	 * this method prompts user for email address and
	 * returns  true if its valid(it has a @ character); 
	 * otherwise false
	 */
	public static boolean validateEmail(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		String theStr = in.nextLine();
		int index = theStr.indexOf('@');
		if(index >= 0){
			return true;
		}
		else{
			return false;
		}
		
	}
	/*
	 * This method prompts user for a string and returns second character of the 
	 * string. if there is no second character , return '$'.
	 */
	public static char secondChar(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		String theStr = in.nextLine();
		char theChar = '$';
		if(theStr.length() >= 2){
			theChar = theStr.charAt(1);
		}
		else{
			theChar = '$';
		}
		return theChar;
	}

}
