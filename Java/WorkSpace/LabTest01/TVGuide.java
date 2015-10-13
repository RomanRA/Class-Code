/* TVGuide.java 
 * Name:Richard Roman
 * Class:150
 * LabTest01
 * Email: raroman@coastal.edu
 * Date; 10/3/2013
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
public class TVGuide {
	
	//public static final int CONSTANT_MAXSIZE = 25;
	
	public static void main(String[] args) {
		
		//Declare variable
		String fileName = "";
		boolean done = false;
		
		
		//Print greeting
		JOptionPane.showMessageDialog(null,"Welcome to the TV Guide");
		
		//Create an an Arraylist
		ArrayList<Program> programList = new ArrayList<Program>();
		
			try
			{
				
				//Prompt user for the name of file
				fileName = JOptionPane.showInputDialog(null,"Please enter a file name: ");
				
				//Loop and create new program objects with values for name and runTime use >>operator
				loadFile(fileName,programList);
				
				
				while(!done)
				{
					//a. print menu
					String returnedMenuOption = TVGuide.menu();
					System.out.println("You entered: "+ returnedMenuOption+ "\n");
					String allCapsMenuOption = returnedMenuOption.toUpperCase();
					
					//if selects quit end the program
					if(!allCapsMenuOption.equals("QUIT"))
					{
						done = false;
						//1.if selects print all print all program objects
						if(allCapsMenuOption.equals("PRINT ALL"))
						{
							
						}
						
						//2. if find the program will prompt the user for the name of the Program to find
						else if(allCapsMenuOption.equals("FIND"))
						{
							//a. if found print the found Program's info
							if((programList.size()>0))//Check to see if there is anything in arraylist
							{
								
							}
							//b.otherwise print the Program was not found
							else
							{
								
							}
						}
						
						//3. if user selects “Total 30”, the program will determine the total run time of all Programs that have
						//   a 30 minute runtime that are currently loaded in the TV Guide.
						else if(allCapsMenuOption.equals("TOTAL"))
						{
							// a. if found,, print all of the Programs’ info that have the given duration.
							
							// b.  if no Programs are found, a message indicating that no Programs of the given length were found
						}
					}
					
				}
			}
			catch(FileNotFoundException fnfe)
			{
				JOptionPane.showMessageDialog(null,fnfe.getMessage());
			}
}
		
	
		//load file method
		public static void loadFile(String fileName,ArrayList<Program> program) throws FileNotFoundException
		{
			//create file
			File aFile = new File(fileName);
			String temp = "";
			int temp1 = 0;
			String temp2 = "";
			try
			{
				//System.out.println(" In Try");
				//opens file for reading
				Scanner reader = new Scanner(aFile);
				while(reader.hasNext())
				{
					temp = reader.next();
					temp1 = reader.nextInt();
					temp2 = reader.next();
					Program temporary = new Program(temp,temp1,temp2);
					program.add(temporary);
					//program.getInfo();
				}
			}
			catch(FileNotFoundException fnfe)
			{
				throw new FileNotFoundException(" The file: "+fileName+" was not found");
			}
		}
	
		
		//Print menu
		public static String menu()
		{
			String userAnswer = "";
			userAnswer = JOptionPane.showInputDialog(null, "Enter 'Print All': to print all\n"
					+ "Enter 'Find': to search for a Program\n"
					+ "Enter 'total': to print the run time of 30 min Programs\n"
					+ "Enter 'Quit': to exit Program");
			
			return userAnswer;
		}
		
		public static  void printList(ArrayList<Program>ProgramList)
		{
			Program temp = null;
			String text = "";
			
		}

}
