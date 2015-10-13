package chapter5;

import java.util.Scanner;

public class Pg5Util {

/* write the following methods and provide a program to test them
 * double smallest(double x, double y, double z), returning the smallest of the
 * arguments
 */
	public static void main(String[] args) {
		double x= 85,y=10,z=20;
		double num = Pg5Util.smallest(x,y,z);
		System.out.println(" The smallest is: "+num);
	}

	public static double smallest(double x, double y, double z){
		
		double answer = 0;
		Scanner in = new Scanner(System.in);
		//System.out.println("You entered: "+x+" "+y+" "+z);
		
		if(x<=y && x<=z)
		{
			return x;
			
		}
		else if(y<=x && y<=z)
		{
			return y;
			
		}
		else 
		{
			return z;
			
		}
		
	}
}



