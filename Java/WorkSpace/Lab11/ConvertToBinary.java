/**
 * ConvertToBinary.java - determines through recursion the binary number of user input.
 * Course: 150
 * Lab 11
 * Date:11/21
 * @author Richard A Roman
 * Email: raroman@coastal.edu
 */
import java.util.*;

public class ConvertToBinary {

	public static void main(String[] args){
		/**
		 * Variables
		 */
		Scanner keyboardInput = new Scanner(System.in);
		String answer = "";
		int aNumber = 0;
		boolean done = false;
		
		System.out.println("Welcome to the ConvertToBinary program.");
		
		while(!done){
			try{
				System.out.print("\nWould you like to convert a positive integer to its binary equivalent(yes/no)?: ");
				answer = keyboardInput.next();
				
				if(answer.equalsIgnoreCase("yes")){
					System.out.print("Enter a positive integer to convert: ");
					aNumber = keyboardInput.nextInt();
					
					
					if(aNumber <=0){
						throw new NumberFormatException();
					}
					else{
						System.out.print("The Binary number for the integer "+aNumber+ " is: ");
						determineBinary(aNumber);
						System.out.println("\n");
						
					}
				}
				else if(answer.equalsIgnoreCase("no")){
					done = true;
					System.out.println("\nThank you for using the ConvertToBinary program, have a nice day!");
				}
			}
			catch(NumberFormatException nfe){
				System.out.println(aNumber+" is not a positive integer, please input a positive integer.");
			}
			catch(InputMismatchException ime){
				System.out.println("That was not a positive integer!, please input a positive integer.");
				keyboardInput.nextLine();//clear newline character
			}
		}//End while loop
		
	}//End Main
	
	/**
	 * determineBinary determines the binary number from the user input
	 * prints out each remainder to show the binary number
	 */
	public static void determineBinary(int aNumber){
		int remainder = 0;
		int temp = 0;
		//stop case
		if(aNumber <=0){
			return;
		}

		if((aNumber % 2) == 0){
			remainder = 0;
		}
		else{
			remainder = 1;
		}
		temp = aNumber/2;
		//Calls this methos inside itself
		determineBinary(temp);
		System.out.print(remainder);
		
	}
}
