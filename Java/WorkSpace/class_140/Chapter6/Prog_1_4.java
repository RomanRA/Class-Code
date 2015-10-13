package Chapter6;

import java.util.Random;

public class Prog_1_4 {

	/*
	 * Only the first and last element.
	 */
	public static void main(String[] args) {
		double array[]= new double[10];
		Random gen = new Random();
		
		for(int i =0;i<array.length;i+=9)
		{
			System.out.println("Element: "+i);
		}
		
		

	}

}
