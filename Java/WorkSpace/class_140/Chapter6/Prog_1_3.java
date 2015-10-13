package Chapter6;

import java.util.Random;

public class Prog_1_3 {
	/*
	 * All elements in reverse order.
	 */
	
	public static void main(String[] args) {
		double list[]= new double[10];
		Random gen = new Random();
		
		for(int i = 9;i<list.length;i-=2)
		{
			list[i]=gen.nextInt();
			System.out.println("Elememt: "+i);
		}

	}

}
