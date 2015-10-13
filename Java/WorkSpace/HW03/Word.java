/* Word.java - A word class that is used to analyze a file.
 * Name: Richard A. Roman
 * Course: 150
 * HomeWork Assignment 3 Part 2
 * Email: raroman@g.coastal.edu
 * Date 10/3/2013
 */
public class Word 
{
	
	//Attributes - member variables
	private String word;
	private int count;
	
	//Default Constructor
	public Word()
	{
		this.word = "";
		this.count = 0;
	}
	
	/**
	 * Overloaded constructor
	 * sets this.word
	 * sets this.count
	 */
	public Word(String aWord)
	{
		//count = aCount;
		this.word = aWord;
		this.count = 1;
	}
	//There are no mutator methodds
	//Accessor methods queries the object for some information without changing it.
	/**
	 * gets count
	 * @returns this.count
	 */
	public int getCount()
	{
		return this.count;
	}
	
	/**
	 * gets word
	 * @returns this.word
	 */
	public String getWord()
	{
		return this.word;
	}

	/**
	 * increments count
	 * @param increment this.count
	 */
	public void incrementCount()//method adds one to the current count
	{
		this.count++;
	}
}
