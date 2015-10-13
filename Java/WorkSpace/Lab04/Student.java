/*
 * Student.java - this is a class for a student that contain its attributes, methods and operations
 * Name: Richard Roman
 * Course: 150
 * Lab04: Student Object
 * Email: raroman@g.coastal.edu
 * Date: 9/18/2013
 */

import javax.swing.JOptionPane;
public class Student
{
	//Attributes are private
	private String name = "";
	private int numberOfCredits;
	private String studentID = "";
	private double fees;
	private String status = "";
	
	//Default constructor to make sure all variable are initialize
	public Student()
	{
		name = "";
		studentID = "";
		numberOfCredits =0;
	}
	
	//overloaded constructor 
	public Student(String aStudentName,String iD ,int aNumberOfCredits)
	{
		name = aStudentName;
		studentID = iD;	
		numberOfCredits = aNumberOfCredits;
	}
	
	
	//Accessor Methods
	public String getName()
	{
		return name;
	}
	public int getCredits()
	{
		return numberOfCredits;
	}
	public String getID()
	{
		return studentID;
	}
	public double getFee()
	{
		return fees;
	}
	public String getStatus()
	{
		return status;
	}
	
	
	//Mutator Methods
	public void setName(String aStudentName)
	{
		name = aStudentName;
	}
	public void setCredits(int aNumberOfCredits)
	{
		numberOfCredits = aNumberOfCredits;
	}
	public void setID(String iD)
	{
		studentID = iD;
	}
	public void setFee(double aFee)
	{
		fees = aFee;
	}
	public void setStatus(String aStatus)
	{
		status = aStatus;
	}
	
	//Other Methods and operations
	public double calculateFees()
	{
		
		if(numberOfCredits >= 12)
		{
			fees = 3200;
		}
		else
		{
			fees = numberOfCredits*400;
		}
		return fees;
	}
	

	public String aStatus()
	{
		
		if(numberOfCredits > 0 && numberOfCredits < 12)
		{
			status = "part-time";
		}
		else if(numberOfCredits >= 12)
		{
			status = "full-time";
		}
		return status;
	}
	
	public void printStudentInfo()	
	{
		//System.out.println(fees);
		JOptionPane.showMessageDialog(null, "Student: "+name+"\nNumber of Credits: "+numberOfCredits+"\nStudent ID: "+studentID+"\nTotal Fees: "+fees+"\nStatus: "+status);
	}
}