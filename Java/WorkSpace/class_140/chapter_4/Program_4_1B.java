package chapter_4;

public class Program_4_1B {
	/*
	 * this program prints the sum of all squares between 1 and 100.
	 */
	public static void main(String[] args) {
		int counter=0;
		int num = 0;
		int sum = 0;
		int squareNum = 0;
		
		
		while(counter < 10)
		{
			num+=1;
			squareNum= num*num;
			sum = sum + squareNum;
		
			System.out.println("Sum is:" +sum);
			counter++;
		
		}

	}

}
