/* WordAnalyzer.java - consists of a main method which prompts user for a name of 
 * a file to be analyzed. The file will be analyzed for certain words and any non-repeated words will be added to array. 
 * However, the word with the most number of times repeated will be counted and display for user. 
 * Name: Richard A. Roman
 * Course: 150
 * HomeWork Assignment 3 Part2
 * Email: raroman@g.coastal.edu
 * Date 10/3/2013
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class WordAnalyzer 
{
	
	public static void main(String[] args) throws FileNotFoundException
	{
		try
		{
			//Declare variables
			String fileName = "";
			String largestWord = "";
			int largestWordCount = 0;
			
			//Create ArrayList called wordsArray
			ArrayList<Word> wordsArray = new ArrayList<>();
			
			JOptionPane.showMessageDialog(null,"* * * * Welcome to the word Analyzer * * * *");
			
			//Get the file name by user input
			fileName = JOptionPane.showInputDialog(null,"Please enter a file name to be analyzed: ");
			
			JOptionPane.showMessageDialog(null,"Analyzing....");
		
			// Loads the ArrayList Calls method
			loadList(fileName,wordsArray);
	
		
			//Finds the largest Word and count
			largestWord = findLargestCount(wordsArray).getWord();
			largestWordCount = findLargestCount(wordsArray).getCount();
			
			//Largest word that is found is displayed
			//System.out.println(largestWord+" and "+largestWordCount); 
			JOptionPane.showMessageDialog(null,"The word '" + largestWord + "' appears the most at " + largestWordCount + " times in " + fileName+ ".");
				
			//Exit message
			JOptionPane.showMessageDialog(null, "Have a nice day!");
		}
		catch(NullPointerException npe)
		{
			
		}
			
			//If user enters a bad file name  this message displays an error because the the index will be out of bounds and quits.
			//JOptionPane.showMessageDialog(null, "Error! Shutting down program...");
			
	}
	//End Main Method
	
	/**
	 * LoadsList scans/reads file found
	 * @param fileName
	 * @param words
	 * @throws FileNotFoundException if file is not found
	 */
	public static void loadList(String fileName, ArrayList<Word> words) throws FileNotFoundException
	{
		// create the file
		File aFile = new File(fileName);
		String temporaryWord = "";
		int wordIndex;
		
		// Create file scanner from file
		try 
		{
			Scanner reader = new Scanner(aFile);
			while(reader.hasNext())
			{
				//scan new word
				temporaryWord = reader.next();
				
				if (isValidWord(temporaryWord)) 
				{
					//check if word exists
					wordIndex = wordExists(temporaryWord, words);
					if(wordIndex == -1) 
					{
						words.add(new Word(temporaryWord));
					}
					else 
					{
						words.get(wordIndex).incrementCount();
					}	
				}
			}
		} 
		catch (FileNotFoundException fnfe) 
		{
			//fnfe.printStackTrace();
			//System.out.println("In catch");
			JOptionPane.showMessageDialog(null,"The file: " +fileName+ " was not found. Please try again." );
		}
		return;
	}
	//End method

	/**
	 * isValidWord- - checks to see if word is valid
	 * @param word
	 * @returns true or false
	 */
	public static boolean isValidWord(String word)
	{
		//Checks valid Word
		if (word.equalsIgnoreCase("a") 
				|| word.equalsIgnoreCase("also")
				|| word.equalsIgnoreCase("you")
				|| word.equalsIgnoreCase("and")
				|| word.equalsIgnoreCase("i")
				|| word.equalsIgnoreCase("is")
				|| word.equalsIgnoreCase("or")
				|| word.equalsIgnoreCase("on")
				|| word.equalsIgnoreCase("that")
				|| word.equalsIgnoreCase("the")
				|| word.equalsIgnoreCase("them")
				|| word.equalsIgnoreCase("then")
				|| word.equalsIgnoreCase("me")
				|| word.equalsIgnoreCase("am")) 
		{
			return false;
		}
		//Will return true for any other Words
		return true;
	}
	//End method
	
	public static int wordExists(String tempWord, ArrayList<Word> words) 
	{
		for (int i = 0; i < words.size(); i++) 
		{
			if (words.get(i).getWord().equalsIgnoreCase(tempWord)) 
			{
				return i;
			}
		}
		//Not found returns this
		return -1;
	}
	//End method
	
	/**
	 * findLargestCount - repeated most number of times 
	 * @param words
	 * @returns the Word 
	 * @throws IndexOutOfBoundsException 
	 */
	public static Word findLargestCount(ArrayList<Word> words)
	{
		int wordCount = 0;
		int wordIndex = 0;
		
		//Check to see if  array size is zero. 
		if(words.size() == 0)
		{
			return null;
		}
		
		for (int i = 0; i < words.size(); i++) 
		{
			if (words.get(i).getCount() > wordCount) 
			{
				wordCount = words.get(i).getCount();
				wordIndex = i;
			}
		}
		return words.get(wordIndex);
	}
	//End method
}	
//End class WordAnalyzer		
		
		
	

