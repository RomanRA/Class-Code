package Chapter6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class Fun_With_Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String names[]=new String[100];
		
		names[0]="bob";
		names[1]="alice";	
		names[2]="carol";
		names[3]="dan";
		names[4]="ed";
		
		// the number 5 is the companion variable. currentSize
		for(int i=0; i<5;i++)
		{
			System.out.print(names[i]+",");
		}
		
		System.out.println("\nEnter name you wish to look for...");
		String name = in.next();
		
		System.out.println("You entered: "+ name);
		int i = 0;
		boolean found = false;
		do
		{
			if(name.equals(names[i]))
			{
				found = true;
				System.out.println("Located at index: "+i);
				i++;//prints out each location of name
			}
			else
			{
				i++;
			}
		}			
		while(i<5);
		
		if(found = false)
		{
			System.out.println("Error that name was not found");
		}
		
		
		
		System.out.println("Which name do you want to count?");
		String name1 = in.next();
		
		int ctr = 0;
		for(int x=0;x<5;x++)
		{
			if(name1.equals(names[x]))
			{
				ctr++;
			}
		}
		System.out.println("The number of times " +name1+ " appears is: "+ctr);
		

		//copies array to 2nd
		String names2[] = new String[5];
		int x=0;
		System.out.println("\nArray 1 copied to Array 2:");
		for(int j=0; j<5; j++)
		{
			names2[j] = names[x];
			System.out.println(names2[j]+",");
			x++;	
		}
		
		
		//Sorts 2nd array
		Arrays.sort(names2);
		
		//Prints 2nd array
		System.out.println("\nArray 2 is now sorted: ");
		for(int j=0; j<5; j++)
		{
			System.out.println(names2[j]+",");
		}
		
		//removing at index name
		System.out.println("\nWhat name do you wish to remove?");
		String target = in.next();
		System.out.println("You want to remove: "+ target);
		
		//System.out.println("Array 2 sorted with "+target+" removed: ");
		
		int currentSize = 5;
		boolean found1 = false;
		for(int j = 0; j<currentSize;j++)
		{
			if(target.equals(names2[j]))
			{
				target=names2[j];
				names2[j-1]=names2[j];
				found1=true;
			}
			
			
		}
		currentSize--;
		if(true)
		{
			names2[j-1]=names2[j];
		}
		

		//prints array again
		System.out.println("\nArray 2 without name: ");
		for(int j=0; j<currentSize; j++)
		{
			System.out.println(names2[j]+",");
		}
		
	}
}
