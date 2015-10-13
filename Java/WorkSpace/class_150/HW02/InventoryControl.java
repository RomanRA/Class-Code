package HW02;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class InventoryControl {
	/*
	 * InventoryControl.java-
	 * 
	 * Name: Richard A Roman
	 * Class: 150
	 * Date: 9/12/2013
	 * Email: raroman@g.coastal.edu
	 */
	
	//Use global constant for max or default size of the arrays.
	public static final int CONSTANT_MAXSIZE = 50;
	public static final double DISCOUNT0_10 = 0;
	public static final double DISCOUNT11_21 =.05; 
	public static final double DISCOUNT22_50 = .25;
	public static final double DISCOUNT51_INFINITY = .50;
	
	public static void main(String[] args) 
	{
		
		//Declare Variables
		Scanner reader = null;
		PrintWriter writer = null;
		File inputAFile=null;
		File writeAFile= null;
		String item = "";
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		String[] itemNumbers = new String[CONSTANT_MAXSIZE];
		String[] names = new String[CONSTANT_MAXSIZE];
		double[] prices = new double[CONSTANT_MAXSIZE];
		int[] quantity = new int[CONSTANT_MAXSIZE];
		boolean done = false;
		int numberOfItemsInEachArray = 0;
		
		//2a. check 2 command line args
		/*if(args.length !=2)
		{
			System.out.println("Usage java HW02 InventoryControl HS1291.txt");
			System.out.println("System shutting down.");
			System.exit(2);
		}
		*/
		//call method for menu
		System.out.println("Welcome to the Home Store Inventory Control Program!\n\n");
		String answer = "";
		
		while(!done)
		{
			try
			{
				String returnedMenuOption = InventoryControl.menu(answer);
				//System.out.println("You entered: "+ returnedMenuOption+ "\n");
				System.out.println("\n");
				String allCapsMenuOption = returnedMenuOption.toUpperCase();
				
				if(!allCapsMenuOption.equals("QUIT"))
				{
					//create method to find number of items
					//numberOfItemsInEachArray = InventoryControl.load(keyboard,reader,inputAFile,itemNumbers,names,prices,quantity);
					//System.out.println("Total number of items is: "+ numberOfItemsInEachArray+"\n");
					if(allCapsMenuOption.equals("ADD"))
					{
						//create a method to add a new item(to the arrays).
						numberOfItemsInEachArray= add(keyboard,itemNumbers,names,prices,quantity,numberOfItemsInEachArray);
					}
					else if(allCapsMenuOption.equals("REMOVE"))
					{
						//create a method to remove an item(form the arrays).
						numberOfItemsInEachArray = remove(keyboard,itemNumbers,names,prices,quantity,numberOfItemsInEachArray);
					}
					else if(allCapsMenuOption.equals("SEARCH"))
					{
						//create a method to search for an item by name(returning the index to print item found).
						int itemSearchedFor = InventoryControl.search(keyboard,itemNumbers,names ,prices ,quantity,numberOfItemsInEachArray);
						System.out.println("Item searched for was found at position "+itemSearchedFor);
					}
					else if(allCapsMenuOption.equals("PRINT ALL"))
					{
						//create a method to print
						print(itemNumbers,names,prices,quantity,numberOfItemsInEachArray);
						System.out.println("\n");
					}
					else if(allCapsMenuOption.equals("TOTAL"))
					{
						System.out.println("Processing Inventory...");
						//create a method to  determine the total value of all inventory(sent to main).
						double returnedTotalValue = InventoryControl.determineTotalValue(prices, numberOfItemsInEachArray);
						System.out.printf("The total value of all products has been calculated to be $" + "%.6s\n",returnedTotalValue);
					
					}
					else if(allCapsMenuOption.equals("LOWEST NUMBER"))
					{
						//create method to find item with highest number of items. returns -1 when there are no items in inventory
						String lowest = InventoryControl.determineTheLowestNumberOfItems(names,quantity, numberOfItemsInEachArray);
						System.out.println("The item with the \"Lowest Number\" of items is "+lowest);
					}
					else if(allCapsMenuOption.equals("HIGHEST NUMBER"))
					{
						//create method to find item with lowest number of items. returns -1 when there are no items in inventory
						String highest = InventoryControl.determineTheHighestNumberOfItems(names,quantity, numberOfItemsInEachArray);
						System.out.println("The item with the \"Highest Number\" of items is "+highest);
					}
					else if(allCapsMenuOption.equals("LOWEST PRICE"))
					{
						//Create a method that will determine the index of the item with the lowest number of items in the inventory of items. returns -1 if empty 
						String lowestPrice = InventoryControl.determineLowestPrice(names,prices,numberOfItemsInEachArray);
						System.out.println("The item with the \"Lowest Price\" is "+lowestPrice);
					}
					else if(allCapsMenuOption.equals("HIGHEST PRICE"))
					{
						//Create a method that will determine the index of the item with the highest number of items in the inventory of items. returns -1 if empty
						String highestPrice = InventoryControl.determineHighestPrice(names,prices,numberOfItemsInEachArray);
						System.out.println("The item with the \"Highest Price\" is "+highestPrice);
					}
					else if(allCapsMenuOption.equals("LOAD"))
					{
						numberOfItemsInEachArray = InventoryControl.load(keyboard,reader,inputAFile,itemNumbers,names,prices,quantity);
					}
					else if(allCapsMenuOption.equals("SAVE"))
					{
						//method to save a data to a file
					}
					else if(allCapsMenuOption.equals("WRITE"))
					{
						//create method that will  write  the contents of inventory arrays  to a file, entered by user.
						createReport(keyboard,writer ,inputAFile,writeAFile,itemNumbers,names,prices,quantity,numberOfItemsInEachArray);
					}
				}
				else
				{
					System.out.println("Thank you for using the Home Inventory, have a nice day!");
					done = true;
				}
			}
		
			catch(IndexOutOfBoundsException ioobe)
			{
				System.out.println(ioobe.getMessage());
			}
			catch(InputMismatchException ime)
			{
				System.out.println("Input Mismatch Exception: " +ime.getMessage());
			}
			catch(FileNotFoundException fnfe)
			{
				System.out.println(fnfe.getMessage());
			}
			catch(NullPointerException npe)
			{
				System.out.println(npe.getMessage());
			}
		}
	}//end main method
	
	
	
	//Methods
	public static String menu(String answer)
	{
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.println("*****************************************");
		System.out.println("* Home Store Inventory                  *");
		System.out.println("*                                       *");
		System.out.println("* Enter \"Add\" to add item");
		System.out.println("* Enter \"Remove\" to remove item");
		System.out.println("* Enter \"Print All\" to print all items");
		System.out.println("* Enter \"Search\" to find an item");
		System.out.println("* Enter \"Remove\" to remove an item");
		System.out.println("* Enter \"Total\" to see total\n" +
	   						"*        inventory value");
		System.out.println("* Enter \"Lowest Number\" to see the item\n" +
	   						"*	with the lowest number of item");
		System.out.println("* Enter \"Highest Number\" to see the item\n" +
							"*  	with the most number of items");
		System.out.println("* Enter \"Lowest Price\" to see the item\n" +
							"*  	with the lowest price");
		System.out.println("* Enter \"Highest Price\" to see the item\n" +
							"*  	with the highest price");
		System.out.println("* Enter \"Load\" to load a data file");
		System.out.println("* Enter \"Save\" to save a data file");
		System.out.println("* Enter \"Write\" to write a report");
		System.out.println("* Enter \"Quit\" to exit program");
		System.out.println("*****************************************");
		System.out.print("Please enter your selection:");
		answer = keyboardInput.nextLine(); 
		return answer;
		
	}
	
	//load method
	public static int load(Scanner keyboard,Scanner reader,File inputAFile,String[]itemNumbers,String[]names,double[]prices,int[]quantity) throws FileNotFoundException
	{
		//System.out.println("Inside load method.");
		int numberOfItemsReadFromFile = 0;
		boolean found = false;
		try
		{
			System.out.print("Please enter the File Name:");
			inputAFile = new File(keyboard.next());
			//System.out.println("Creating readfile");
			
			//Open fill for reading
			reader = new Scanner(inputAFile);
			System.out.println("Loading "+inputAFile+"\n");
		}
		catch(FileNotFoundException fnfe)
		{
			throw new FileNotFoundException("Error: "+inputAFile+" does not exist!\n");
		}
		
		System.out.println("Load complete..."+"\n");
		//loop through to read entire contents within the file
		while(reader.hasNext())
		{
			
			//read the item number and store in itemNumber array
			itemNumbers[numberOfItemsReadFromFile] = reader.next();
			//System.out.println(itemNumbers[numberOfItemsReadFromFile]);
			
			//read the item name and store in item name array
			names[numberOfItemsReadFromFile] = reader.next();
			//System.out.println(names[numberOfItemsReadFromFile]);
			
			//read price and store in price array
			prices[numberOfItemsReadFromFile] = reader.nextDouble();
			//System.out.println(prices[numberOfItemsReadFromFile]);
			
			//read quality and store in quality array
			quantity[numberOfItemsReadFromFile] = reader.nextInt();
			//System.out.println(quantity[numberOfItemsReadFromFile]+"\n");
			
			//increase count to track total
			numberOfItemsReadFromFile++;
		}	
		if(reader != null)
		{
			reader.close();
		}
		
		//return the number of items contained in each array.
		return numberOfItemsReadFromFile;
	}
	//end method
	
	
	//print method
	public static void print(String[]itemNumbers,String[]names,double[]prices,int[]quantity,int numberOfItemsInEachArray)
	{
		for(int index = 0; index<numberOfItemsInEachArray; index++)
		{
			System.out.println(itemNumbers[index]+" "+names[index]+" "+prices[index]+" "+quantity[index]);
		}
	}
	//end method

	
	//add item method
	public static int add(Scanner keyboard,String[]itemNumbers,String[]names,double[]prices,int[]quantity,int numberOfItemsInEachArray)
	{
		//System.out.println("Inside add method");
		String inventoryNumber = "";
		String name = "";
		double price = 0;
		int itemQuantity = 0;
		
		numberOfItemsInEachArray++;	
		System.out.print("Please enter Inventory#: ");
		inventoryNumber = keyboard.next();
		itemNumbers[numberOfItemsInEachArray-1] = inventoryNumber;
		
		System.out.print("Please enter item name: ");
		name = keyboard.next();
		names[numberOfItemsInEachArray-1] = name;
		
		System.out.print("Please enter price: ");
		price = keyboard.nextDouble();
		prices [numberOfItemsInEachArray-1] = price;
		
		System.out.print("Plese enter quantity: ");
		itemQuantity = keyboard.nextInt();
		quantity[numberOfItemsInEachArray-1] = itemQuantity;
		
		
		System.out.println("\n"+inventoryNumber+" successfully added to inventory.\n");
		return numberOfItemsInEachArray;
	}
	//end method
	
	
	//remove item method
	public static int remove(Scanner keyboard,String[]itemNumbers,String[]names,double[]prices,int[]quantity,int numberOfItemsInEachArray) throws IndexOutOfBoundsException
	{
		System.out.println("Work in progress");
		String nameToRemove = "";
		System.out.print("Please enter item name: ");
		nameToRemove = keyboard.next();
		int index;
		//need  a variable to keep track of array size
		
		for(index = 0; index < numberOfItemsInEachArray; index++)
		{
			if(nameToRemove.equals(names[index]))
			{
				//System.out.println("Try in");
				itemNumbers[index] = itemNumbers[index+1];
				names[index] = names[index+1];
				prices[index] = prices[index+1];
				quantity[index] = quantity[index+1];
				
				numberOfItemsInEachArray --;
			}
		}
		if(index<=numberOfItemsInEachArray)
		{
			throw new IndexOutOfBoundsException("There are no items in the inventory");
		}
		System.out.println("You removed "+nameToRemove+ " from inventory\n");
		return numberOfItemsInEachArray;
	}
	
	//method to search for inventory item by name
	public static int search(Scanner keyboard,String[]itemNumbers,String[]names,double[]prices,int[]quantity,int numberOfItemsInEachArray)throws NullPointerException
	{
		int index = 0;
		boolean found = false;
		String itemSearch = "";
		System.out.print("Enter item name to search: ");
		itemSearch = keyboard.next();
		while(index<numberOfItemsInEachArray && !found)
		{
			
			if(names[index].equals(itemSearch))
			{	System.out.println("\n");
				System.out.println("Found "+names[index]);
				System.out.println("Item #: "+itemNumbers[index]);
				System.out.println("Price: "+prices[index]);
				System.out.println("Quantity: "+quantity[index]);
				found = true;
			}
			else
			{
				index++;
			}
		}
		if(!found)//work to display different reason why!
		{
			throw new NullPointerException("ERROR: no items currently exsist in inventory.\n");
		}
		return index;
	}
	
	//method to determine total value of all inventory items in store
	public static double determineTotalValue(double[]prices,int numberOfItemsInEachArray)throws IndexOutOfBoundsException
	{
		double totalValue = 0;
		int index = 0;
		
		while(index<numberOfItemsInEachArray)
		{
			totalValue = totalValue + prices[index];
			index++;
			//System.out.println("Try here");
		}
		if(index>numberOfItemsInEachArray)	
		{
			throw new IndexOutOfBoundsException("There are no items in the inventory");
		}
		return totalValue;
	}
	//end method
	
	
	//Method to determine the index of the item with the lowest number of items in the inventory of items at the Home Store. 
	public static String determineTheLowestNumberOfItems(String[]names,int[]quantity,int numberOfItemsInEachArray)throws IndexOutOfBoundsException
	{
		System.out.println("Searching for item with the lowest number quantity...");
		int index = 0;
		int theLowest = quantity[index];
		String theLow = names[index];
		
		for(index = 1; index < numberOfItemsInEachArray; index++)
		{
			if(quantity[index]< theLowest)
			{
				theLowest = quantity[index];
				theLow = names[index];
			}	
		}
		if(index>numberOfItemsInEachArray)	
		{
			throw new IndexOutOfBoundsException("There are no items in the inventory");
		}
		return theLow;
	}
	//end method
	
	//method to determine the index of the item with the highest number of items in inventory of item at the hoime store
	public static String determineTheHighestNumberOfItems(String []names,int[]quantity, int numberOfItemsInEachArray)
	{
		System.out.println("Searching for item with the highest number quantity...");
		int index = 0;
		int theHighest = quantity[index];
		String theHigh = "";
		
		for(index = 1; index < numberOfItemsInEachArray; index++)
		{
			if(quantity[index]>theHighest)
			{
				theHighest = quantity[index];
				theHigh = names[index];
			}
		}
		if(index>numberOfItemsInEachArray)	
		{
			throw new IndexOutOfBoundsException("There are no items in the inventory");
		}
		return theHigh;
	}//end method

	
	public static String determineLowestPrice(String[]names,double prices[],int numberOfItemsInEachArray)throws IndexOutOfBoundsException
	{
		System.out.println("Searching for item with the lowest price...");
		int index = 0;
		double theItemWithLowestPrice = prices[index];
		String theLowItem = names[index];
		
		//System.out.println("try out");
		for(index = 1; index <numberOfItemsInEachArray;index++)
		{
			//System.out.println("try");
			if(prices[index]<theItemWithLowestPrice)
			{
				//System.out.println("try in");
				theItemWithLowestPrice = prices[index];
				theLowItem = names[index];
			}
		}
		if(index>numberOfItemsInEachArray)	
		{
			throw new IndexOutOfBoundsException("There are no items in the inventory");
		}
		return theLowItem;
		
	}//end method
	
	public static String determineHighestPrice(String[]names,double prices[],int numberOfItemsInEachArray)throws IndexOutOfBoundsException
	{
		System.out.println("Searching for item with the highest price...");
		int index = 0;
		double theItemWithHighestPrice = prices[index];
		String theHighItem = names[index];
		
		
		for(index = 1; index <numberOfItemsInEachArray; index++)
		{
			if(prices[index]>theItemWithHighestPrice)
			{
				theItemWithHighestPrice = prices[index];
				theHighItem = names[index];
			}
		}
		if(index>numberOfItemsInEachArray)	
		{
			throw new IndexOutOfBoundsException("There are no items in the inventory");
		}
		return theHighItem;
	}
	//end method
	
	public static void createReport(Scanner keyboard, PrintWriter writer ,File inputAFile,File writeAFile,String[]itemNumbers,String[]names,double[]prices,int[]quantity, int numberOfItemsInEachArray)
	{
		System.out.println("Preparing to write report.");
		int index = 0;
		writeAFile = new File("Created_Report.txt");
		
		try
		{
			//create file to write
			writer = new PrintWriter(writeAFile);
			//System.out.println("Successfully opened the writer");
			determineDiscount(itemNumbers,names,prices,quantity,numberOfItemsInEachArray);
			System.out.println("Writing...\n");
			
			//create a method that will apply a discount to the price of an item based on how many in stock.
			while(index < numberOfItemsInEachArray)
			{
				if (index == 0)
				{
					writer.printf("%15s", "Inventory#");
					writer.printf("%15s","Item Name");
					writer.printf("%15s","Price");
					writer.printf("%15s","Quantity\n");
					
				}
				writer.print("\n");
				writer.printf("%15s",itemNumbers[index]);
				writer.printf("%15s",names[index]);
				writer.printf("%15.6s",prices[index]);
				writer.printf("%15s",quantity[index]);
				index++;
			}
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("Error: File Not Found");
		}
		finally
		{
			System.out.println("Finished writing..");
			if(writer != null);
			writer.close();
		}
		//end method		
				
	}
		//create a method that will apply a discount to the price of an item based on how many in stock.	
	public static void determineDiscount(String[]itemNumbers,String[]names,double[]prices,int[]quantity,int numberOfItemsInEachArray)
	{
		double newPrice = 0;
		for(int index = 0;  index < numberOfItemsInEachArray;index++)
		if(quantity[index]>=0 && quantity[index]<=10)
		{
			
		}
		else if(quantity[index]>10 && quantity[index]<=21)
		{
			prices[index] = prices[index] -(prices[index] * DISCOUNT11_21);
		}
		else if(quantity[index]>=22 && quantity[index]<=50)
		{
			prices[index] = prices[index] -(prices[index] * DISCOUNT22_50);
		}
		else
		{
			prices[index] = prices[index] -(prices[index] * DISCOUNT51_INFINITY);
		}
		
	}	
}
