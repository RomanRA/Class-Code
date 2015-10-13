//Richard Roman
package Chapter3;
import java.util.Scanner;
public class Ch3Prog12 {

	/*
	 * This program translates a letter grade into a number grade. Letter grades are
	 * A, B, C, D, and F, possibly followed by + or –. Their numeric values are 4, 3, 2, 1, and
	 * 0. There is no F+ or F–. A + increases the numeric value by 0.3, a – decreases it by 0.3.
	 * However, an A+ has value 4.0. 
	 */
	public static void main(String[] args) {
		
		Scanner userIn = new Scanner(System.in);
		String letterGrade;
		int A=4;
		int	B=3;
		int C=2;
		int D=1;
		int F=0;
		double plus=0.3;
		
		System.out.println("Enter the letter grade");
		letterGrade = userIn.next();
		
		if(letterGrade.equals("A")|| letterGrade.equals("A+"))
		{
			System.out.println(A);
		}
			if(letterGrade.equals("A-"))
			{
				System.out.println(A - plus);
			}
			else
			{
			
			}
		
		
		if(letterGrade.equals("B"))
		{
			System.out.println(B);
		}
			if(letterGrade.equals("B"))
			{
				System.out.println(B);
			}
				if (letterGrade.equals("B+"))
				{
					System.out.println(B + plus);
				}
				else
				{
					
				}
			if (letterGrade.equals("B-"))
			{
				System.out.println(B - plus);
			}
			else{
				
			}
			

		if(letterGrade.equals("C"))
		{
			System.out.println(C);
		}
			if(letterGrade.equals("C"))
			{
				System.out.println(B);
			}
				if (letterGrade.equals("C+"))
				{
					System.out.println(C + plus);
				}
				else
				{
						
				}
			if (letterGrade.equals("C-"))
			{
				System.out.println(C - plus);
			}
			else{
					
			}
				

		if(letterGrade.equals("D"))
		{
			System.out.println(D);
		}
			if(letterGrade.equals("D"))
			{
				System.out.println(D);
			}
				if (letterGrade.equals("D+"))
				{
					System.out.println(D + plus);
				}
				else
				{
					
				}
			if (letterGrade.equals("D-"))
			{
				System.out.println(D - plus);
			}
			else{
					
				}
		if (letterGrade.equals("F"))
		{
			System.out.println(F);
		}
		else{
			
		}
	}
}


