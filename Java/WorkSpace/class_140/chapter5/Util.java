package chapter5;

import java.util.Scanner;

public class Util {

	
	public static void main(String[] args) {
		double x = 0;
		//System.out.println("In main 1");//pop off stack
		x = Util.cubeIt2();// variable only exist inside methods.
		System.out.print("x in main is: " +x);
		//System.out.println("in main 2");
	}
	
	//void - does something but doesn't return value.
	public static void cubeIt(){
		System.out.println("in cubeIt 1");
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number:");
		double x = in.nextDouble();
		System.out.println("you entered:"+ x);
		double y = x*x*x;
		System.out.println(y);
			
	}
	
	//Returns the calculated number instead of printing it.
	// "double" is used as the return type instead of "void"
	public static double cubeIt2(){
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number:");
		double x = in.nextDouble();
		System.out.println("you entered:"+ x);
		double y = x*x*x;
		//System.out.println(y);
		//this will return back to place wherever method was called
		//return should be last thing in method
		return y;
		
	}	
}

