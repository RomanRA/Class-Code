//Richard Roman
package TakeHome;

import java.util.Scanner;
import java.util.InputMismatchException;
public class TakeHome_2 {
	
	/* Modified previous program (Take Home 1) to allow the user to repeatedly enter transactions,
 	 * typing "quit" when they're done. (Allow as many transactions as desired, and allow them to be 
	 * entered in any order. For example Withdrawal from Checking, then Deposit to Savings, 
	 * then another Withdrawal from Checking, etc). Modified to also guard against negative numbers,
	 * but also guard against the user entering non-numbers.
	 */

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double newCheckBal=0;
		double newSavingBal=0;
		double checking=0;
		double savings=0;
		double num=0;
		String acctAccess;
		
		boolean valid = false;	
		do{
			try{
				System.out.println("What is the intial balance for your checking?");
				checking = keyboard.nextDouble();
				if (checking < 0)
				{
					valid = false;
					
				}
				else
				{
					valid = true;
				}	
			}
			catch(InputMismatchException e){
				System.out.println("Error");
				String badData = keyboard.next();
				System.out.println(badData+" is not a valid amount. ");
				
				valid = false;
			}//end catch
			
		}
		while(!valid);
		
		do{
			try{
				System.out.println("What is the intial balance for your savings?");
				savings = keyboard.nextDouble();
				if(savings < 0)
				{
					valid = false;
					
				}
				else
				{
					valid = true;
				}
			}
			catch (InputMismatchException e){
				System.out.println("Error");
				String badData = keyboard.next();
				System.out.println(badData+" is not a valid amount.");
				
				valid = false;
			}//end catch
		}
		while(!valid);
				
		//Program loop starts here
		String option = null;
		do{
			System.out.println("\nSelect 1 for deposit,\nSelect 2 for withdrawl,\nSelect 3 for transfer,\nor type quit to end");
			
			option = keyboard.next();
				if(option.equals("quit"))
				{
					break;
				}
				else 
				{
					if(option.equals("1"))
					{
						do
						{
							try
							{
								System.out.println("How much do you want to deposit? ");
								num = keyboard.nextDouble();
								if(num < 0)
								{
									valid = false;
								}
								else
								{
									valid = true;
								}
							}
							catch(InputMismatchException e) 
							{
								System.out.println("Error");
								String badData = keyboard.next();
								System.out.println("You can't enter: " +badData+ " Try again.");
								valid = false;
							}
						}
						while(!valid);
					}
						
				else if(option.equals("2"))
				{
					do
					{
						try
						{
							System.out.println("How much do you want to withdrawl? ");
							num = keyboard.nextDouble();
							if(num < 0)
							{
								valid = false;
								System.out.println("Enter a correct amount.");
								num = keyboard.nextDouble();
							}
							else 
							{
								valid = true;
							}
						}
						catch(InputMismatchException e) 
						{
							System.out.println("Fatal Error! ");
							String badData = keyboard.next();
							System.out.println("You can't enter: " +badData+ " Try again.");
							valid = false;
						}
					}
					while(!valid);
				}
				
				else if (option.equals("3"))
				{	
					do
					{
						try
						{
							System.out.println("How much money do you want to transfer? ");
							num = keyboard.nextDouble();
							if(num < 0)
							{
								valid = false;
								System.out.println("Enter a correct amount.");
								num = keyboard.nextDouble();
							}
							else
							{
								valid = true;
							}
						}
							catch(InputMismatchException e) 
							{
								System.out.println("Error");
								String badData = keyboard.next();
								System.out.println("You can't enter: " +badData+ " Try Again.");
								valid = false;
							}
						}
						while(!valid);
					}
					
					System.out.println("Which account account, checking or savings?(*option 3 only-transfer from*)");
					acctAccess = keyboard.next();
					
					if((acctAccess.equals("savings")&&(option.equals("1")))){
						System.out.println("New Savings balance is: " + (savings + num));
						System.out.println("Checking balance is: " + (checking));
					}
					else if((acctAccess.equals("checking")&&(option.equals("1")))){
						System.out.println("New Checking balance is: " + (checking + num));
						System.out.println("Savings balance is: " + (savings));
					}
				
					else if((acctAccess.equals("savings")&&(option.equals("2")))){
						newSavingBal = (savings - num);
						if(newSavingBal <=0){
							System.out.println("Cannot complete transaction due to one or both accounts being overdrawn or insufficent funds.");
						}
						else
						{
							System.out.println("New Savings balance is: " + (savings - num));
							System.out.println("Checking balance is: " + (checking));
						}
						
					}
					else if((acctAccess.equals("checking")&&(option.equals("2")))){
						newCheckBal = (checking - num);
						if(newCheckBal <=0){
							System.out.println("Cannot complete transaction due to one or both accounts being overdrawn or insufficent funds.");
						}
						else
						{
						System.out.println("New Checking balance is: " + (checking - num));
						System.out.println("Savings balance is: " + (savings));
						}
					}
					else if((acctAccess.equals("savings")&&(option.equals("3")))){
						newSavingBal = (savings - num);
						newCheckBal = (checking + num);
						if((newSavingBal <= 0 )||(newCheckBal <= 0 )){
							System.out.println("Cannot complete transaction due to one or both accounts being overdrawn or insufficent funds.");
						}
						else{
							System.out.println("Your new savings acct balance is: " + newSavingBal);
							System.out.println("Your new checking acct balance is: "+ newCheckBal);
						}//End Nested Branch
						
					}
					else if((acctAccess.equals("checking")&&(option.equals("3")))){
						newCheckBal = (checking - num);
						newSavingBal = (savings + num);
						if((newSavingBal <= 0 )||(newCheckBal <= 0)){
							System.out.println("Cannot complete transaction due to one or both accounts being overdrawn or insufficent funds.");
						}
						else{
							System.out.println("Your new savings acct balance is: " + newSavingBal);
							System.out.println("Your new checking acct balance is: "+ newCheckBal);
						}//End Nested Branch
					}
				}
			}
		
		while(!option.equals("quit"));//End of program do loop
		System.out.println("The transaction was terminated.");
	}
	
}		

		




