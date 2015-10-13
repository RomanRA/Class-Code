package chapter_4;

public class Program_4_1C {
	/*
	 * This program prints all powers of 2^0 to 2^20.
	 */
	public static void main(String[] args) {
		
		final int x_Base = 2;
		int y_Power = 0;
		int counter = 0;
		double power=0;
		
		while(y_Power < 20)
		{
			y_Power = y_Power + 1;
			power = Math.pow(x_Base, y_Power);
			counter = counter + 1;
			System.out.println("Power is:" +power);
		}
		

	}

}
