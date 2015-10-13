package chapter_4;
import java.util.Scanner;
public class Loop_practice2 {
//input validation loop
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double initialBalance = 0;
		double rate = 0;
		
		double currentBalance = 0;
		int period = 0;
		double max = 0;
		double annualRate = 0;
		final int totalMonths = 12;
		
		System.out.println("What is the initial balance?");
		initialBalance = in.nextDouble();
		System.out.println("Balance you entered is:" +initialBalance);
		
		while(initialBalance <= 0){
			System.out.println("Wrong Value");
			System.out.println("Entering starting amount");
			initialBalance = in.nextDouble();
			System.out.println("Initial Balance:" +initialBalance);
		}
		
		System.out.println("What is the interest rate?");
		rate = in.nextDouble();
		System.out.println("The Rate you entered is:" +rate);
		
		while(rate < 0 || rate >= 1){
			System.out.println("Invalid rate, must be between 0 and 1, enter another rate");
			rate= in.nextDouble();
			System.out.println("Annual Interest rate:");
		}
		
		System.out.println("Enter the target amount value");
		max = in.nextDouble();
		System.out.println("Target Value is:" +max);
		
		while(max < initialBalance){
			System.out.println("Invalid target value, must be grater than initial balance, enter another value");
			max = in.nextDouble();
			System.out.println("Target Value is:" +max);
		}
		currentBalance= initialBalance;
	
		
		
		//start loop here
		while(currentBalance < max)//While this is true 
		{
			currentBalance = currentBalance + ((annualRate/totalMonths) * (currentBalance));
			System.out.println("Balance is:" + currentBalance);
			period++;
			}
		System.out.printf("\nWith a starting balance of $%.2f and annual interest rate of %.2f compounded yearly,\nit will take *** %d *** years(%d months)\n to reach reach target value of %.2f.",initialBalance,rate,period,period*12,max);
		
	}

}
