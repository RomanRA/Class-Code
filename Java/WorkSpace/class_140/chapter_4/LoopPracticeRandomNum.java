package chapter_4;

import java.util.Random;
import java.util.Scanner;

public class LoopPracticeRandomNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int secret = 0;
		int guess = 0;
		boolean win = false;
		int max = 0;
		int min = 0;
		String choice = null;
		
		System.out.println("Enter min: ");
		min = in.nextInt();
		System.out.println("You entered: "+min);	
		System.out.println("Enter max: ");
		max = in.nextInt();
		System.out.println("You entered: "+max);
		
		Random generator = new Random();
		
		do
		{
				secret = generator.nextInt(max-min)+min;
				//System.out.println(secret);
				
				int counter=0;
				do{
					
					System.out.println("Guess a number: ");
					guess = in.nextInt();
					System.out.println("The number you guessed is: " +guess);
					while(guess < min || guess > max)
					{
						System.out.println("Guess must be between the min: "+min+" and the max: "+max);
						System.out.println("Guess a number: ");
						guess = in.nextInt();
						System.out.println("The number you guessed is: " +guess);
					}	
					do{
						
							
						}while(guess < min || guess > max);
					
							if(guess == secret)
							{
								win = true;
							}
							else if (guess < secret)
							{
								System.out.println("Guess higher");
							}
							else
							{
								System.out.println("Guess lower");
							}
								
							counter++;	
				}while(guess!=secret && counter < 5);
					
				//winner
				if(win)		//or	//(win==true)	//if(guess == secret)
				{
					System.out.print("You won with "+counter);
					if(counter>1){
						System.out.println(" guesses.");
					}
					else
					{
						System.out.println(" guess.");
					}
				}
				else
				{
					System.out.println("Sorry you lost.");
				}
				System.out.println("Do you wanna play again?");
				choice = in.next();
		}while(choice.equalsIgnoreCase("yes"));
		
		System.out.println("GoodBye.");
	}
}
