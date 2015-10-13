package Chapter6;

import java.util.Scanner;

public class ArrayPract_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		
		// array arithmetic
		//declaring and creating spaces for arrays for primitives
		double[] numsD = new double[10];
		int[] numsI = new int [10];
		//object types
		String[] strs = new String[10];
		//Scanner[] myScanners = new Scanner[10];
		//myScanners[0] = new Scanner(System.in);
		
		//numsD[0] = 90;
		//numsD[1] = 85;
		
		System.out.println("enter the numbers:");
		numsD[0]= in.nextDouble();//90
		numsD[1]= in.nextDouble();//85
		
		double sum = numsD[0] + numsD[1];
		numsD[2] = numsD[0] +numsD[1];
		
		
		//double sum = numsD[0] + numsD[1];
		
		System.out.println("nums0:" +numsD[0]);
		System.out.println("nums1:" +numsD[1]);
		System.out.println("nums2:" +numsD[1]);
	}

}
