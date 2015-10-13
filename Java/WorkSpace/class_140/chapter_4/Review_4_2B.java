package chapter_4;

public class Review_4_2B {

	
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
