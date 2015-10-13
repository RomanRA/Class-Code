package Chapter6;

import java.util.Random;

public class Prog_1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double number[]= new double[10];
		Random gen = new Random();
		
		for(int i =0; i< number.length;i+=2)
		{
			number[i]=gen.nextInt(199);
			System.out.println(/*i+:":"*/+number[i]);
		}

	}

}
