package chapter5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {

	public static void main(String[] args) {
		int num = InputUtils.getInt("Enter Guess",0,Integer.MAX_VALUE);
		System.out.println(num);

	}
	
	public static int getInt(String prompt,int min,int max){
		Scanner in = new Scanner(System.in);
		int x = -1; //temp for storage
		
		do{
			System.out.println(prompt);
			
			try{
				x = in.nextInt();
			}
			catch(InputMismatchException e){
				in.next();
				System.out.println("Error invalid string");
				
			}

		}
		while(x < min || x > max);
		return x;
		
		
		
		
		/*public static int getPosInt(){
			Scanner in = new Scanner(System.in);
			int x = -1; //temp for storage
			
			do{
				System.out.println("Enter a postive integer: ");
				
				try{
					x = in.nextInt();
				}
				catch(InputMismatchException e){
					in.next();
					System.out.println("Error invalid string");
					
				}

			}
			while(x<0);
			return x;
		*/
	}
}
