//Richard Roman
package Labs;

import java.util.Scanner;

public class Primes {
	/* Lab: Lab 1 Primes
	 * This program determines the number of and prints the number 
	 * of prime numbers between 2 and 10,000.
	 * 
	 * Instructor: Professor Fuchs
	 * Email: raroman@g.coastal.edu
	 * Date: 8/28/2013
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number you wish to find primes up to?");
		int highestNumber = input.nextInt();
		int numOfPrimes = 0;
		int count = 0;
		
		//nested for loops with a method for the inner loop
		System.out.print("The prime numbers from 1 to "+highestNumber+" \n");
		for(int i=2;i<highestNumber;i++)
		{
			
			boolean primeNumber=Primes.isPrime(i);//Calls method that determines primes	
			if(primeNumber == true)
			{
				//System.out.println(i+" ");
				numOfPrimes++;
				count++;
				if(count<=10)
				{
					System.out.println("\n");
					count = 0;
				}
				
			}
		}//end nested loops
	}
		
	
	// Method determines if a number is prime giving a true false value
	public static boolean isPrime(int i)
	{
		for(int x=2;x<i;x++)
		{
			if(i%x==0)// if i is not prime
			{
				return false;
			}
		}
		return true;//otherwise the number is prime
	}//end method
	
	
}

		
	


	

	


	


