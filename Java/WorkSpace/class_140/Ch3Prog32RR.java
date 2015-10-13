//Richard Roman
import java.util.Scanner;


public class Ch3Prog32RR {
	/*
	 * Assuming that the user's PIN is "1234", this program asks the user for the PIN no more than 3 times, 
	 * and does the following: 
	 * If the user enters the right number, prints, “Your PIN is correct”, and ends the program.
	 * If the user enters a wrong number, prints, “Your PIN is incorrect” and, if you have asked for the PIN less than three times, ask for it again.
	 * If the user enters  a wrong number three times, prints “Your bank card is blocked” and end the program.
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ctr = 0;
		String pin = null;
		do{
			System.out.println("To access account enter your PIN");
			pin = in.next();
			ctr++;
			if(pin.equals("1234"))
			{
				System.out.println("Your PIN is correct");
				break;
			}
			else
			{
				System.out.println("Your PIN is incorrect");
			}
		}
		while(ctr <3);
			if(!pin.equals("1234"))
			{
				System.out.println("Your bank card is blocked.");
				System.out.println("Program terminated.");
			}
	}
}
	


