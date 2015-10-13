/*Richard Roman*/
 
package Chapter2;

import java.util.Scanner;

public class Ch2Prog7 {

	/*
	 * This program prompts the user for a radius and then prints
	 * the area and circumference of a circle with that radius. 
	 * Also the volume and surface area of a sphere with that radius
	 */
	public static void main(String[] args) 
	{
		Scanner input;
		input = new Scanner (System.in);
	
		//Declare Variable
		double radius =0;
		double area =0;
		double circumference=0; 
		double PI=3.14159;
		double volumeOfSphere=0;
		double surfaceAreaOfSphere=0;
	
		System.out.println(" User, please enter radius of circle" );
		radius = input.nextDouble();
		//Computation
		circumference = 2*PI*radius;
		area = (PI * (radius*radius));
		
		//%.2f prints two digits after decimal point
		System.out.println(" The circumference and area of a circle with a radius of " + radius );
		System.out.printf(" Circumference is: %.2f", circumference); 
		System.out.printf(" The area is : %.2f", area);
		
		//Computation
		volumeOfSphere = (4/3)*PI*(Math.pow(radius,3));
		surfaceAreaOfSphere = 4 * PI * (Math.pow(radius,2));
		
		System.out.println("\nThe Volume and surface area of a sphere with a radius of " + radius);
		System.out.printf(" Volume is: %.2f ", volumeOfSphere);
		System.out.printf(" Surface Area is %.2f", surfaceAreaOfSphere);

	}

}
