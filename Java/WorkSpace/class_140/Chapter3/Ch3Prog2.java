//Richard Roman
package Chapter3;
import java.util.Scanner;
public class Ch3Prog2 {

	/*
	 * This program  reads a floating-point number and prints “zero” if the number
	is zero. Otherwise, print “positive” or “negative”. Add “small” if the absolute value
	of the number is less than 1, or “large” if it exceeds 1,000,000.
	 */
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 double num=0;
		 int num2=1000000;
		 
		 System.out.println("Please enter a number");
		 num = input.nextDouble();
		 System.out.println("The number you entered: " +num);
		 
		 if(num==0)
		 {
			 System.out.println("\nThe number is zero ");
		 }
		 else 
		 {
			 if(num>0)
			 {
				 System.out.println("is positive");
				 
			 }
			 else
			 {
				 System.out.println("is negative");
				 
			 }//End Branch
		 }//End
		 
		 if(Math.abs(num)<1)
		 {
			 System.out.println(num+ " is small");
		 }
		 
		 else if (Math.abs(num)>num2)
		 {
			 System.out.println(num+ " is large");
		 }
	}

}
