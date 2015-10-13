package Chapter6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GradeProg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[]grades= new double[10];//creates array grade size 10
		//grades[0]=100;
		//grades[9]=95;
		Random gen = new Random();
		
		
		for(int i = 0; i<grades.length;i++)
		{
			grades[i]=gen.nextInt(99);
		}
		
		
		/*for(int i=0; i<grades.length;i++)
		{
			System.out.print
		}
		*/
		
		
		for(int i=0; i < grades.length; i++)
		{
			System.out.println(i+": "+grades[i]);
		}
		
		double sum = 0;
		double average = 0;
		
		for(int i = 0; i<grades.length;i++)
		{
			sum = sum + grades[i];
			//System.out.println("The sum is : " +sum);
		}
		
		average = sum/grades.length;
		System.out.println("Average: " +average);
		
		double max= 0;
		for(int i = 0; i<grades.length;i++)
		{
			if(grades[i]>max)
				max = grades[i];
			
			
		}
		System.out.println("Max is: "+max);
		
		double min= grades[0];
		for(int i =0; i<grades.length;i++)
		{
			if(grades[i]<min)
			{
				min = grades[i];
			}
		}
		System.out.println("Min is: " +min);
		
		Arrays.sort(grades);
		//Print array again after sort
		for(int i =0;i<grades.length;i++)
		{
			System.out.println(grades[i]);
		}
		
		//search for a number
		//1. get target
	
		System.out.println("Enter grade to search for:");
		double target = in.nextDouble();
		System.out.println("Searching for " +target+ "..........");
		
		//2.loop through array looking for target
		// if target found print index and target itself.
		int foundPos = -1;
		boolean found = false;
		for (int i =0; i<grades.length; i++)
		{
			if(grades[i]==target)
			{
				foundPos =i;
				found = true;
				break;
			}
		}
		//next part
		if(found)
		{
		System.out.println("Found: " +grades[foundPos]);
		System.out.println("Found at position: "+foundPos);
		}
		else
		{
			System.out.println("The number you entered was not found.");
		}
		
	}

}
