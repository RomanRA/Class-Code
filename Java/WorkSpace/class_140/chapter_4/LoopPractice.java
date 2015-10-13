package chapter_4;
import java.util.Scanner;
public class LoopPractice {

	
	public static void main(String[] args) {
		//counter controlled while loop
		//1. initialize counter variable
		//2. determine the condition
		//3. write statements to get repeated
		//4. update counter variable(loop controlled variable)
	int counter =0;
	int num=1;
	while(counter < 4)
	{	
		
		System.out.println(num+ ". Hello");
		num = num + 1;
		counter++;
		//counter++
		//counter += 1
		
		
		
	}

	
	System.out.println("Finished");
	}
}