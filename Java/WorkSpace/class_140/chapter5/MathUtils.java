package chapter5;

import java.util.Scanner;

public class MathUtils {

	public static void main(String[] args) {
		int x=4, y=5;
		
		int value = MathUtils.power2(x,y);//power2
		System.out.println("The power is: "+value);
	}
	/*
	 * This method prompts user for a base and exponent
	 * (they must be positive ints) and returns the base raised to exponent power.
	 * (Without using math.pow.
	 */
	
	public static int power(){
		//Scanner in = new Scanner(System.in);
		int x,y = 0;
		System.out.println("Enter a base: ");
		x = InputUtils.getPosInt();//call method
		
		System.out.println("Enter the exponent: ");
		y = InputUtils.getPosInt();//call method
		
		
		int power = 1;
		//Calculate
		 for(int i=0;i<y;i++){
		   power=power*x;  
		 } 
		return power;
	
		
		
	}
	
	/*
	 * This method prompts user for a base and exponent
	 * as input parameters/arguments.
	 *  and returns the base raised to exponent power.
	 * (Without using math.pow.)
	 */
	// b and e  are called formal parameters
	public static int power2(int b,int e){
		//Scanner in = new Scanner(System.in);
		int power = 1;
		//Calculate
		 for(int i=0;i<e;i++){
		   power=power*b;  
		 } 
		return power;
	
		
		
	}
	
}
