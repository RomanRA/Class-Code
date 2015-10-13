/*
 * Library.java - consists of a mian method that creates an ArrayList.
 * Books are created and stores. A menu is printed with multiple options for user.
 * Name: Richard Roman
 * Course: 150
 * Lab06B: Library
 * Email: raroman@g.coastal.edu
 * Date: 9/26/2013
 * 
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Library {

	public static void main(String[] args){
		
		//Declare variable
		String userAnswer = "";
		boolean done = false;
		String newbook1 = "";
		
		//create  new ArrayList called LibraryListOfBooks
		ArrayList LibraryListOfBooks = new ArrayList();
		
		
		JOptionPane.showMessageDialog(null, "***** Welcome To The Library Program. *****");
		do
		{
			//Create a try catch to get error messages
			try
			{
				while(!done)
				{
					//Ask for user input
					userAnswer = JOptionPane.showInputDialog("Select an option:"+"\nType \"Add\" to add a Book." +
							"\nType \"Show all\" to display the contents of the Library." +
							"\nType \"Count\" to determine the total number of Books in the Library."+
							"\nType \"Quit\" to exit the program."+
							"\nType \"Total Pages\" to find the total number of pages in the Library.");
					String allCapAnswer = userAnswer.toUpperCase();
					
					//check user answer and call the method require
					if (allCapAnswer.equals("ADD"))
					{
						addBook(LibraryListOfBooks);
					}
					else if (allCapAnswer.equals("COUNT"))
					{
						countBooks(LibraryListOfBooks);
					}
					else if(allCapAnswer.equals("SHOW ALL"))
					{
						if((LibraryListOfBooks.size()<=0))//Check to see if there is anything in arraylist
						{
							JOptionPane.showMessageDialog(null, "There are no Books in the Library!");
						}
						else
						{
							showAll(LibraryListOfBooks);
						}
					}
					else if (allCapAnswer.equals("TOTAL PAGES"))
					{
						printPages(LibraryListOfBooks);
					
					}
					else if (allCapAnswer.equals("QUIT"))
					{
						JOptionPane.showMessageDialog(null, "Thank you for visiting the Library today!");
						done = true;
					}
					else//if user enters a choice not in list an error message is printed and user is returned to main menu
					{
						JOptionPane.showMessageDialog(null,"Error: "+userAnswer+" is not a valid selection.");
					}
				}
			}
			catch(NullPointerException npe)
			{
				JOptionPane.showMessageDialog(null,npe.getMessage());
			}
		}
		while(!done);
	}
	
	//Methods
	
	/**
	 * Adds a book to the array called LibraryListOfBooks.
	 * @param LibraryListOfBooks
	 */
	public static void addBook(ArrayList LibraryListOfBooks)
	{
		int numberOfPages = 0;
		String title = "No title yet";
		String author = "No author yet";
		
		//gets title author pages form user
		title = JOptionPane.showInputDialog("Please enter title: ");
		author = JOptionPane.showInputDialog("Please enter author: ");
		numberOfPages = Integer.parseInt(JOptionPane.showInputDialog("Please enter number of pages in book: "));
		
		//create a new book and set user inputs to arrarylist
		Book newBook1 = new Book();
		newBook1.setTitle(title);
		newBook1.setAuthor(author);
		newBook1.setNumberOfPages(numberOfPages);
		
		LibraryListOfBooks.add(newBook1);
		newBook1.getDescription();
		
	}
	
	/**
	 * Counts the LibraryListOfBooks array for the number of books.
	 * @param LibraryListOfBooks
	 */
	public static void countBooks(ArrayList LibraryListOfBooks)throws NullPointerException
	{
		if((LibraryListOfBooks.size()<=0))
		{
			throw new NullPointerException("There are No tems to count!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "There are "+ LibraryListOfBooks.size() + " books in the Library");
		}
	}
	
	/**
	 * Shows the items at each index of the array one at a time.
	 * @param LibraryListOfBooks
	 */
	public static void showAll(ArrayList LibraryListOfBooks)
	{
		String data= "";
		Book temp = null;
		for(int index = 0;index<LibraryListOfBooks.size();index++)
		{
			 temp = (Book)LibraryListOfBooks.get(index);
			 temp.getDescription();
		}
	}
	/**
	 * Determines the total number of pages inside of the LibraryListOfBooksArray
	 * @param LibraryListOfBooks
	 */
	public static void printPages(ArrayList LibraryListOfBooks)
	{
		int sum =0;
		Book temp = null;
		for(int index = 0; index<LibraryListOfBooks.size();index++)
		{
			temp = (Book)LibraryListOfBooks.get(index);
			sum += temp.getNumberOfPages();
		}
		JOptionPane.showMessageDialog(null,"Total number of pages are: "+sum);
	}
	
	
}
