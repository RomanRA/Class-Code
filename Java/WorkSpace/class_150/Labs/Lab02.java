package Labs;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Lab02.java - this program reads from an input file called inventory.txt
 * and makes changes to that file.
 * Name: Richard Roman
 * Lab: Lab 2 file IO
 * Email: raroman@g.coastal.edu
 * Date : 9/3/2013
 */

public class Lab02 {

	public static void main(String[] args) 
	{
		
		Scanner reader = new Scanner(System.in);//used to read each line
		PrintWriter writer = null;
		File inputFile = null;
		
		
		inputFile = new File("inventory.txt");//go to look for the file.
		System.out.println("Got inventory.txt file.");
		String make = "";
		String model = "";
		String year = "";
		String price = "";
		double appliedDiscount=0;
		double percent1 = .05;
		double percent2 = .10;
		double percent3 = .50;
		double percent4 = .20;
		
		try
		{
			reader = new Scanner(inputFile);//opens to read existing file.
			System.out.println("Opened file for writing...");
		
			while(reader.hasNext())
			{
				System.out.println("Reading file...");
				make = reader.next();
				//System.out.println("Try catch 1");
				
				model = reader.next();
				//System.out.println("Try catch 2");
				
				year = reader.next();
				//System.out.println("Try catch 3");
				
				price = reader.next();
				//System.out.println("Try catch 4");
			
				//reader.nextLine();
				int aYear = Integer.parseInt(year);
				double aPrice = Double.parseDouble(price);		
				
				
				
				if(2013-(aYear)>=1 && (2013-(aYear) <= 5))
				{
					appliedDiscount = aPrice*percent1;
					double newPrice = aPrice - appliedDiscount;
					
					System.out.println("Writing...");
					writer.print(make);
					writer.print(model);
					writer.print(year);
					writer.println(newPrice);
				}
				else if((2013 - (aYear) > 5) && (2013 - (aYear) <= 10))
				{
					appliedDiscount = aPrice*percent3;
					double newPrice = aPrice - appliedDiscount;
					
					System.out.println("Writing...");
					writer.print(make);
					writer.print(model);
					writer.print(year);
					writer.println(newPrice);
				}
				
				else if(2013 - (aYear) > 10)
				{
					appliedDiscount = aPrice*percent2;
					double newPrice = aPrice - appliedDiscount;
					
					System.out.println("Writing...");
					writer.print(make);
					writer.print(model);
					writer.print(year);
					writer.println(newPrice);
				}
				else if(2013 - (aYear) > 20)
				{
					appliedDiscount = aPrice*percent4;
					double newPrice = aPrice + appliedDiscount;
					
					
					System.out.println("Writing...");
					writer.print(make);
					writer.print(model);
					writer.print(year);
					writer.println(newPrice);
				}
			}
		}
		
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
			String message = fnfe.getMessage();
			System.out.println("File was not found: "+message);
		}
		/*catch(NumberFormatException nfe)
		{
			System.out.println("Try catch");
		}
		*/
		finally
		{
			if(reader != null && writer != null)
			{
				writer.close();
				reader.close();
			}
		}
	}
		
			
}


