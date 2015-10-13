//Richard Roman
package Chapter2;
import java.util.Scanner;
public class Ch2Prog26 {

	/*
	 * This program that shows prospective customers
	 * how their deposits will grow. The program  reads the initial balance and the
	 * annual interest rate. Interest is compounded monthly then prints out the balances after the
	 * first three months.
	 */
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 //Varaiables
		 double intBalance=0;
		 double annualInterest=0;
		 double annualInterest1=0;
		 double moneyEarned=0;
		 double newBalance=0;
		
		 
		 System.out.println("Enter initial Balance");
		 intBalance=input.nextDouble();
		 //System.out.println("Initial Balance is:" + intBalance);
		 
		 System.out.println("Enter interest rate");
		 annualInterest=input.nextDouble();
		 annualInterest1 = annualInterest/100;//The user inputs percent, this calculates interest as decimal.
		 //System.out.println("Annual Interest Rate is: " + annualInterest1);
		 
		
		 moneyEarned = intBalance * annualInterest1;
		 newBalance = intBalance + moneyEarned;
		 
		 
		 System.out.println("Initial Balance is:      " + intBalance);
		 System.out.println("Annual Interest Rate is: " + annualInterest1);
		 System.out.println("After first month:       " +newBalance);
		
		 moneyEarned = newBalance * annualInterest1;
		 newBalance = newBalance + moneyEarned;
		 
		 System.out.println("After second month:      " +newBalance); 
		 
		 moneyEarned = newBalance * annualInterest1;
		 newBalance = newBalance + moneyEarned;
		 
		 System.out.println("After third month:       " +newBalance);
		 
		 
		 
				 

	}

}
