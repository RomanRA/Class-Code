/*Richard Roman*/

package Chapter2;

import java.util.Scanner;

public class Ch2Prog8 {
	/* 
	 * This program asks the user for the lengths of the sides
	 * of a triangle. Then it prints the area and perimeter of the rectangle,
	 *  and the length of diagonal of the rectangle.
	 */
	
	public static void main(String[] args) 
	{
		Scanner input;
		input = new Scanner(System.in);
		
		//Set up variables
		double rectangleLength=0;
		double rectangleWidth=0;
		double areaOfRectangle=0;
		double perimeterOfRectangle=0;
		double lengthOfDiagonal=0;
		double diagonal=0;
		double diagonal1=0;
		
		
		System.out.print(" Enter the length of rectangle ");
		rectangleLength = input.nextDouble();
		System.out.print(" Enter the width of rectangle ");
		rectangleWidth = input.nextDouble();
		
		areaOfRectangle = rectangleLength * rectangleWidth;
		perimeterOfRectangle = ((rectangleLength*2)+(rectangleWidth*2));
		
		diagonal =(Math.pow(rectangleLength,2))+(Math.pow(rectangleWidth,2));
		diagonal1 = Math.sqrt(diagonal);
		
		System.out.println(" The Area of rectangle is " + areaOfRectangle);
		System.out.println(" The perimeter of the rectangle is " + perimeterOfRectangle);
		System.out.printf(" The length of the diagonal is %.1f",diagonal1);
		
		
		
		
		
		

	}

}
