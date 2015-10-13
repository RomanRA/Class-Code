package FileIO;
import java.util.Scanner;
import java.io.PrintWriter;// import  java.io*
import java.io.File;
import java.io.FileNotFoundException;
	/* 
	 * File.java -
	 * Richard Roman
	 * Class:150
	 * Date:8/29/13
	 * Email:raroman@g.coastal.edu
	 */
public class FileIO {
	public static void main(String[] args) 
	{
		if(args.length ==0)
		{
			System.out.println("We have " +args.length+ " number of command line arguments!");
		}
		else
		{
			for(int index=0;index<args.length; index++)
			{
				System.out.println((index+1) + ":" + args[index]);
			}
		}
		Scanner keyboard = new Scanner(System.in);
		PrintWriter writer = null;//brings thing form outside
		File aFile =null;
		
		String name = "";
		int value=0;
		
		aFile = new File("names.150");// also can give a directory so it will go to find
		System.out.println("Just made a file");
		
		try
		{
			writer = new PrintWriter(aFile);
			System.out.println("Successfully opened my writer");
			
			while(!name.equalsIgnoreCase("stop"))
			{
				System.out.println("Enter a name(stop to quit):");
				name = keyboard.nextLine();
				System.out.println("Enter a value: ");
				value = keyboard.nextInt();
				
				//clear newline character form input stream
				keyboard.nextLine();
				System.out.println("Writing...");
				
				writer.println(name);
				writer.println(value);
			}
			//writer.close();
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
			String message = fnfe.getMessage();
			System.out.println("File not found: "+message);
		}
		finally
		{
			System.out.println("Finished writing..");
			if(writer != null);
			writer.close();
		}
	
		
		/*
		Scanner reader = null;
		try
		{
			reader = new Scanner(aFile);
			while(reader.hasNext())
			{
				name = reader.nextLine();
				value= reader.nextInt();
				reader.nextLine();//clears new line character
				System.out.println("Name Is: "+name+ ":"+value);
			}
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
		finally
		{
			if(reader != null)
			{
				reader.close();
			}
		}
		System.out.println("Adios...");*/
	}

}
