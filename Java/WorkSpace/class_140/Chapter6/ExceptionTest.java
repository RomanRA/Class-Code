package Chapter6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x =0;
		//try to catch block for exception 
		boolean valid = true;	
		do{
			try{
				System.out.println("before in try");// any error jumps to catch
				x = in.nextDouble();
				if (x>0 && x <=100)
				{
					valid = true;
					System.out.println("After in try");
				}
				else
				{
					valid = false;
				}	
			}
			catch(InputMismatchException e){
				System.out.println("Error");
				String badData = in.next();
				System.out.println("You cant enter: " +badData);
				
				valid = false;
			}//end catch
			
		}
		while(!valid);
		
		System.out.println("After try catch");	
	System.out.println("x: " +x);
	}

}
