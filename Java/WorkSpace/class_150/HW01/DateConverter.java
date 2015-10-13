
	/* DateCoverter.java - This program converts a date in the format (MM/DD/YYYY) to the format "Month, OrderedDay, Year.
	 * Name: Richard Roman
	 * Class: 150
	 * Date: 9/5/2013
	 * Email: raroman@g.coastal.edu
	 */
package HW01;
import java.util.Scanner;
public class DateConverter
{
	public static void main (String[] args) {
	boolean valid = true;
	String yourName = "";
	String returnUserName = DateConverter.promptForName(yourName);
	int counter = 0;
		do
		{ 
			try
			{
				String answerEntered = "";
				String date = "";
				String returnUserAnswer = DateConverter.promptToContinue(answerEntered, returnUserName);
				if(returnUserAnswer.equals("yes"))
				{
					String returnDate = DateConverter.promptForDate(date);
					String solvedForMonth = DateConverter.determineMonth(returnDate);
					String formatOfDay = DateConverter.determineSuffix(returnDate);
					String aYear = DateConverter.determineYear(returnDate);
					String day = DateConverter.determineDay(returnDate);
					//System.out.println(returnUserInput); 
					//System.out.println(returnUserAnswer);
					//System.out.println(returnDate);
					
					if(!solvedForMonth.equals("")&& !formatOfDay.equals("") && !aYear.equals("") && !day.equals(""))
					{
						System.out.print(returnDate+ " has been converted to ");
						System.out.print(solvedForMonth+ " ");
						String sub3 = returnDate.substring(3,5);//date
						String sub4 = returnDate.substring(6,10);//year
						System.out.print(sub3);
						System.out.println(formatOfDay+","+sub4+"\n");
						counter++;
						
					}
				}
				else
				{
					//System.out.println("Catch");
					valid = false;
					break;
				}
			}
			catch(NumberFormatException nfe)
			{
				System.out.println("Invalid Input: Not enough characters.");
				System.out.println("\n");
				valid = false;
			}
			catch(IllegalArgumentException e)
			{
				System.out.println("\n");
				valid = false;
			}
		}
		//Note 10/06/2013
		/*Put exclamation point !valid was suppose to be valid only
		which caused to program to end prematurely after executing the main program once*/
		while(!valid);//End loop
		System.out.println(returnUserName+" has converted "+counter+" date, thanks for using the DateConverter.");
		System.out.println("System Shutting Down...");
		
	}//End program main method


	public static String promptForName(String yourName)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Welcome to the DateConverter program, please enter your name: ");
		yourName = input.nextLine(); 
		return yourName;
	}
	//End method

	
	public static String promptToContinue(String answerEntered,String returnUserName)
	{
		Scanner input = new Scanner(System.in);
		System.out.print(returnUserName+ ", please enter \"yes\" to convert a date or \"no\" to quit: ");
		answerEntered = input.nextLine();
		if(!answerEntered.equals("no"))
		{
			return answerEntered;
		}
		else
		{
			String quit = "stop";
			return quit;
		}
	}
	//End method
	
	
	public static String promptForDate(String date)
	{
		Scanner input= new Scanner(System.in);
		System.out.print("Please enter the date in MM/DD/YYYY format:");
		date = input.nextLine();
		return date;
	}
	//End method
	
	
	public static String determineMonth(String returnDate)
	{
		String theMonth ="";
		String sub1 = returnDate.substring(0,2);
		try
		{
			int i = Integer.parseInt(sub1);
			//System.out.println("before catch");
			//System.out.println("I is: "+i);
			if (i<=12 && i>=1)
			{
				//System.out.println("again before catch");
				if(i == 1){theMonth = "January";}
				else if(i == 2){theMonth ="February";}
				else if(i == 3){theMonth ="March";}
				else if(i == 4){theMonth ="April";}
				else if(i == 5){theMonth ="May";}
				else if(i == 6){theMonth ="June";}
				else if(i == 7){theMonth ="July";}
				else if(i == 8){theMonth ="August";}
				else if(i == 9){theMonth ="September";}
				else if(i == 10){theMonth ="October";}
				else if(i == 11){theMonth ="November";}
				else if(i == 12){theMonth ="December";}	
				
				//System.out.println("Try catch");
				return theMonth;
			}
			else
			{
				throw new IllegalArgumentException();
			}
		}
		finally
		{
		
		}
	}
	//End method
	
	
	public static String determineSuffix(String returnDate)
	{
		String theSuffix = "";
		String sub2 = returnDate.substring(4,5);
		try
		{
			int j = Integer.parseInt(sub2);
			if(j>=0 && j<=31)
			{
				if(j == 1){theSuffix = "st";}
				else if(j == 2){theSuffix = "nd";}
				else if(j == 3){theSuffix = "rd";}
				else {theSuffix = "th";}
				return theSuffix;
			}
			else 
			{
				throw new IllegalArgumentException();
			}
		}
		finally
		{
			
		}
	}
	//End method
	
	
	public static String determineYear(String returnDate)
	{
		String theYear="";
		String subYear =returnDate.substring(6,10);
		try
		{
			int k = Integer.parseInt(subYear);
			if(k>1900 && k<2013)
			{
				return subYear;
			}
			else
			{
				System.out.println("Invalid input: "+subYear+ " is not a valid input.");
				throw new IllegalArgumentException();
			}
		}
		finally
		{
			
		}
	}//End method
	
	
	public static String determineDay(String returnDate)
	{
		String theDay = "";
		String subDay = returnDate.substring(3,5);
		try
		{
			int z = Integer.parseInt(subDay);
			if(z>=1 && z<=31)
			{
				return subDay;
			}
			else
			{
				throw new IllegalArgumentException();
			}
		}
		finally
		{
			
		}
	}//End method
}

	