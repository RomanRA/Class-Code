//Richard Roman
package Chapter3;
import java.util.Scanner;
public class Ch3Prog30 {

	 /*This program simulates a bank transaction. There are two bank accounts: checking
	  * and savings. First, the initial balances of the bank accounts are asked; rejects negative
	  * Ask for the transactions; options are deposit, withdrawal, and
	  * transfer. Then asks for the account; options are checking and savings. Then asks for the
	  * amount; reject transactions that overdraw an account. Afterwards prints the balances
	  * of both accounts.
	  */
		public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double newCheckBal=0;
		double newSavingBal=0;
		double checking=0;
		double savings=0;
		int option=0;
		double num=0;
		String acctAccess;
	
		System.out.println("What is the intial balance for your checking?");
		checking = keyboard.nextDouble();
		System.out.println("What is the intial balance for your savings?");
		savings = keyboard.nextDouble();
		
		if(checking < 0){
			System.out.println("Rejected transaction due to insufficent funds in one or more accounts.");
		}
		else if(savings < 0){
			System.out.println("Rejected transaction due to insufficent funds in one or more accounts.");
		}
		
		
		if((savings<0)||(checking<0)){
			System.out.println("Please try again!");

		}
			
		else{
			System.out.println("\nSelect 1 for deposit,\nSelect 2 for withdrawl,\nSelect 3 for transfer");
			option = keyboard.nextInt();
			
		
			if(option == 1){
				System.out.println("How much do you want to deposit?");
				num = keyboard.nextDouble();
			}
			else if(option == 2){
				System.out.println("How much do you want to withdrawl?");
				num = keyboard.nextDouble();
			}
			else if (option == 3){
				System.out.println("How much do you want to transfer?");
				num = keyboard.nextDouble();
			}
		
			System.out.println("Which account do you want to access, checking or savings?(*option 3 only-transfer from*)");
			acctAccess = keyboard.next();
			if((acctAccess.equals("savings")&&(option == 1))){
				System.out.println("New Savings balance is: " + (savings + num));
				System.out.println("Checking balance is: " + (checking));
			}
			else if((acctAccess.equals("checking")&&(option == 1))){
				System.out.println("New Checking balance is: " + (checking + num));
				System.out.println("Savings balance is: " + (savings));
			}
		
			else if((acctAccess.equals("savings")&&(option == 2))){
				System.out.println("New Savings balance is: " + (savings - num));
				System.out.println("Checking balance is: " + (checking));
			}
			else if((acctAccess.equals("checking")&&(option == 2))){
				System.out.println("New Checking balance is: " + (checking - num));
				System.out.println("Savings balance is: " + (savings));
			}
			else if((acctAccess.equals("savings")&&(option == 3))){
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
			else if((acctAccess.equals("checking")&&(option == 3))){
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
		else{
		}
		}
	}
}
