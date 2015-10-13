package chapter_4;

import java.util.Scanner;

public class LoopNestedLoop {


	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int size = 0;
		//Prompts user to enter size
		do
		{	
			System.out.println("Enter the size multiplication table you wish: ");
			size = userInput.nextInt();
			System.out.println("you entered"+ size);
		}
		while(size<0 || size >10000);
		
			//calculate width for each number base on size of table
		int width = 0;
		int biggestNum = size*size;
		String strNum = Integer.toString(biggestNum);//num to string
		width = strNum.length()+ 1;	//counts character plus 1	
		
		//Prints horizontal label row
		System.out.print("          ");
		for(int z =1; z <=size;z++)
		{
			System.out.printf("%"+width+"d",z);
		}
		
		//Printing line under horizontal label row
		System.out.print("\n");
		System.out.print("          ");
		
		for(int x=1; x<(width*size); x++)//width*size, adjust space for lines/underscores
		{	
			System.out.print("_");
		}	
		System.out.print("\n");
	
		//Printing multiplication table, 
		//including the vertical labels, one at the beginning of each row
		for(int i =1; i <= size; i++)//does each row
		{
			System.out.printf("%9d|",i);
			
			for(int j = 1; j <=size;j++)//does each column
			{
			
				System.out.printf("%"+width+"d", i*j);
			}
		System.out.print("\n");
		}
	}
}



