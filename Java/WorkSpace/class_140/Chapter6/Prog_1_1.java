package Chapter6;

import java.util.Random;

public class Prog_1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double numbers[]= new double[10];
		Random gen = new Random();
		
		for(int i = 0;i<numbers.length;i+=2)
		{
			numbers[i]=gen.nextInt(199);
			System.out.println(i);
		}
	}

}
