/*
 * BookTester.java - consists of a main 
 * method that tests the implementation of Book class
 * Name: Richard Roman
 * Course: 150
 * Lab06: Book class
 * Email: raroman@g.coastal.edu
 * Date: 9/26/2013
 */

import javax.swing.JOptionPane;
public class BookTester {

	public static void main(String[] args) {
		
		String testTitle = "";
		String testAuthor = "";
		int testNumberOfPages = 0;
		int testsPassed = 0;
		
		JOptionPane.showMessageDialog(null, "Created the Book object.");
		Book book1 = new Book();
		
		//Book book1 = new Book("Harry Potter","J.K. Rowling",950,"A magical fantasy world");
		/*try
		{
			Book book1 = new Book();
		}
		catch(IllegalArgumentException iae)
		{
			JOptionPane.showMessageDialog(null,"Failed to create Book.");
		}*/
		
		//set and test title
		book1.setTitle("Harry Potter");
		testTitle = book1.getTitle();
		if(testTitle.equals("Harry Potter"))
		{
			JOptionPane.showMessageDialog(null,"Title set correctly... Passed test 1.");
			testsPassed++;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Title not set correctly... Test 1 failed.");
			book1.setTitle("Failed test");
		}
		
		//set and test author
		book1.setAuthor("J.K. Rowling");
		testAuthor = book1.getAuthor();
		if(testAuthor.equals("J.K. Rowling"))
		{
			JOptionPane.showMessageDialog(null,"Author set correctly... Passed test 2.");
			testsPassed++;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Author not set correctly... Test 2 failed.");
			book1.setAuthor("Failed test");
		}
	
		//set and test number of pages. if pages set is less than 0 or greater than 1000
		book1.setNumberOfPages(1000);
		testNumberOfPages = book1.getNumberOfPages();
		if(testNumberOfPages>0)
		{
			JOptionPane.showMessageDialog(null,"Number Of Pages set correctly...Passed test 3.");
			testsPassed++;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Number Of Pages not set correctly... Test 3 failed.");
			//book1.setNumberOfPages(0);
		}
		
		
		JOptionPane.showMessageDialog(null,"Total tests Passed: "+testsPassed);
		//get description
		book1.getDescription();
		
		
	}
}
		
		
	
			
		
		

