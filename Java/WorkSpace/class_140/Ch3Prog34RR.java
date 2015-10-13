//Richard Roman
import java.util.Scanner;


public class Ch3Prog34RR {
	/* This program calculates and prints the
	 * value of the coupon a person can receive based on groceries purchased.
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final double coupon_1 = 0;
		final double coupon_2 = .08;
		final double coupon_3 = .10;
		final double coupon_4 = .12;
		final double coupon_5 = .14;
		
		double moneySpent = 0;
		double discount=0;
		
		System.out.println("Please enter the cost of your groceries?");
		moneySpent = in.nextDouble();
		System.out.println("You entered: $"+moneySpent+" dollars.");
		
		while(moneySpent<=0)
		{
			System.out.println("Please enter the CORRECT cost of your groceries?");
			moneySpent = in.nextDouble();
		}
		
			if(moneySpent >0 && moneySpent<10)
			{
				System.out.println("No coupon.");
			}
			else if(moneySpent>=10 && moneySpent<=60)
			{
				discount = (moneySpent * coupon_2);
				System.out.printf("You win a discount of $%.2f dollars.",discount);
				System.out.println("(8% of your purchase)");
			}
			else if(moneySpent>60 && moneySpent<=150)
			{
				discount = (moneySpent * coupon_3);
				System.out.printf("You win a discount of $%.2f dollars.",discount);
				System.out.println("(10% of your purchase)");
			}
			else if(moneySpent>150 && moneySpent<=210)
			{
				discount = (moneySpent * coupon_4);
				System.out.printf("You win a discount of $%.2f dollars.",discount);
				System.out.println("(12% of your purchase)");
			}
			else if(moneySpent>210)
			{
				discount = (moneySpent * coupon_5);
				System.out.printf("You win a discount of $%.2f dollars.",discount);
				System.out.println("(10% of your purchase)");
			}
		}	
	}


