//Richard Roman
package chapter5;

import java.util.Scanner;

public class Prog5_7 {

	/* This program has a method public static int countWords(String str)
	 * that returns a count of all words in the string str. words are 
	 * seperated by spaces. for example, countWords("Mary had a little lamb") should return 5. 
	 */
	public static void main(String[] args) {
		String str = "Mary had a little lamb";
		int numWords = Prog5_7.countWords(str);
		System.out.println("the number of words are: "+numWords);
	}
	
	public static int countWords(String str){
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ')
			{
				count++;
			}
		}
		return count;
	}
	
}

