package Chapter2;

import java.util.Scanner;

public class Ch2Prog2 {

	public static void main(String[] args) 
	{
		Scanner input;
		input = new Scanner(System.in);//Have to declare object variable beforehand
	
		//User inputs
		double paperLength=0;
		double paperWidth=0;
		
		//Calculated
				double diagonal=0;
				double diagonalLength=0;
				double totalWidth=0;
				double totalLength=0;
				double totalPerimeter=0;
				
				
			
				System.out.println(" Enter Length ");
				paperLength = input.nextDouble();
				
				System.out.println(" Enter Width ");
				paperWidth = input.nextDouble();
				
				//Calculated
				totalWidth = paperWidth + paperWidth;
				totalLength = paperLength + paperLength;
				
				totalPerimeter = totalWidth + totalLength;
				diagonal = (Math.pow(paperLength,2)+ Math.pow(paperWidth,2));
				diagonalLength = Math.sqrt(diagonal);
				
		System.out.println(" Total Perimeter is " + totalPerimeter);
		System.out.printf(" The diagonal Length is %.2f ", diagonalLength);
				
		
		
		
		
		
		
		
		
		
		

	}

}
