//Richard Roman
package Chapter3;
import java.util.Scanner;
public class Ch3Prog14 {
	/*
	 * This  program takes user input describing a playing card in the following
	 * shorthand notation
	 */
	String card;
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter card notation");
		String card = input.next();
		
		
		int length= card.length();
		String suit;
		String value= null;
		
		
		
		//Can do if statement but doesn't change variable after statement
		suit = card.substring(length-1);
		if(length==2)
		{
			 value = card.substring(0,1);
			 suit = card.substring(1,2);
		}
		else if(length==3)
		{
			 value = card.substring(0,2);
			 suit = card.substring(2,3);
		}
		
				
		if(value.equals("J"))
		{
			System.out.println("Jack of");
		}
		else if(value.equals("K"))
		{
			System.out.println("King of");
		}
		else if(value.equals("Q"))
		{
			System.out.println("Queen of");
		}
		else if(value.equals("A"))
		{
			System.out.println("Ace of");
		}
		else 
		{
			System.out.print(value+ " of ");
		}
		
	
		if(suit.equals("D"))
		{
			System.out.println("Diamonds");
		}
		else if(suit.equals("H"))
		{
			System.out.println("Hearts");
		}
		else if (suit.equals("S"))
		{
			System.out.println("Spades");
		}
		else if (suit.equals("C"))
		{
			System.out.println("Clubs");
		}
		
		}
	
}
	
	

	
	

			
		