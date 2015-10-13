/*
 * Book.java - creates Book class
 * Name: Richard Roman
 * Course: 150
 * Lab06B: Book Object
 * Email: raroman@g.coastal.edu
 * Date: 9/26/2013
 */

import javax.swing.JOptionPane;
public class Book {
	//attributes - member Variable
	private String title = "";
	private String author = "";
	private int numberOfPages = 0;
	
	
	//Default constructor
	public Book()
	{
		title = "No title yet";
		author = "No author yet";
		numberOfPages = 0;
	}
	
	//Overloaded constructor
	public Book(String aTitle, String aAuthor, int pages,String aDescription)
	{
		title = aTitle;
		author = aAuthor;
		numberOfPages = pages;
	}
	
	//Accessor methods - queries the object for some information without changing it.
	/**
	 * gets title
	 * @returns the title
	 */
	public String getTitle()
	{
		return title;
	}
	
	/**
	 * gets author
	 * @returns author
	 */
	public String getAuthor()
	{
		return author;
	}
	
	/**
	 * gets number of pages
	 * @returns the number of pages
	 */
	public int getNumberOfPages()
	{
		return numberOfPages;
	}
	
	//Mutator methods - modifies the object on which it operates.
	/**
	 * Sets the title of Book
	 * @param title: gets the title of book
	 */
	public void setTitle(String aTitle)
	{
		title = aTitle;
	}
	
	/**
	 * sets author of the book.
	 * @param author: gets the author
	 */
	public void setAuthor(String aAuthor)
	{
		author = aAuthor;
	}
	
	/**
	 * Description-- set number of pages only allows greater than zero.
	 * @param sets the number of pages
	 * @throws IllegalArgumentException
	 */
	public void setNumberOfPages(int pages)throws IllegalArgumentException
	{
		try
		{
			if(pages>0)
			{
				numberOfPages = pages;
			}
			else
			{
				throw new IllegalArgumentException("The amount of pages should be greater than 0.");
			}
		}
		catch(IllegalArgumentException iae)
		{
			JOptionPane.showMessageDialog(null, iae.getMessage());
		}
	}
	
	/**
	 * Gets the description of book
	 * @return a String to represent book.
	 */
	public void getDescription()
	{
		if(numberOfPages>0)
		{
			JOptionPane.showMessageDialog(null,title+" by "+author+" with "+numberOfPages+" pages.");
		}
		
	}
}
