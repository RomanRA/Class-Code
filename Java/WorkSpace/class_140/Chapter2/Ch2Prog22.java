/*Richard Roman*/
package Chapter2;
import java.util.Scanner;
/*
 * The following pseudocode describes how a bookstore computes the price of an
order from the total price and the number of the books that were ordered.
 */
public class Ch2Prog22 {

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		double totalBookPrice=0;
		int numBooks=0;
		final double numTax=.075;//or double NUM_TAX = .075
		final double SHIP_RATE = 2.00;
		double totalShippingCharge=0;
		double totalTax=0;
		double priceForOrder=0;
		
		
		//need price per book however didn't calculated seperately
		//total price for books
		System.out.println("Enter total book Price");
		totalBookPrice = input.nextDouble();
		System.out.println(" You entered " + totalBookPrice);
		//Number of books
		System.out.println("Enter the number of books");
		numBooks = input.nextInt();
		System.out.println("You entered " + numBooks);
		//Compute tax
		totalTax = totalBookPrice * numTax;
		System.out.printf("\nTotal tax is: %.2f", totalTax);
		//Compute Shipping charge
		totalShippingCharge = SHIP_RATE * numBooks; //2 is the price per book
		System.out.printf("\nTotal shipping charge is: %.2f",totalShippingCharge);//format specifier a place holder for total shipping charge
		//Compute total price for order
		priceForOrder = totalBookPrice + totalTax + totalShippingCharge;
		System.out.printf("\nThe price for your order is: %.2f", priceForOrder);
		//System.out.printf("\nThe price for your order is: %20.2f", priceForOrder);
															//20 adds number spaces width
		
	
		//format string (%25s : %20.2f\n, "shippingCharge" , shippignCharge)
		
		
		
		
		
		
	}

}
