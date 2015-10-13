package Chapter2;

public class Chp2Prog2 {

	public static void main(String[] args) 
	{

		// mm per inch stays the same because its a constant
		
		final double MILLIMETER_PER_INCH = 25.4;
		final double LENGTH = 11;
		final double WIDTH = 8.5;
		
		System.out.print(MILLIMETER_PER_INCH * LENGTH);
		System.out.print(" by ");
		System.out.println(MILLIMETER_PER_INCH * WIDTH);
		
		

		
	}

}
