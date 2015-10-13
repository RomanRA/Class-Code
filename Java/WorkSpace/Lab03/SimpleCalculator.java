/*
 * SimpleCalculator.java - the program displays a menu system that allows the user
 * 						   to select a mathematical operation.for Example: absolute difference,
 *						   add, subtract,square root, or power. 
 * Name: Richard Roman
 * Course: CSCI 150
 * LAB 2: SimpleCalculator
 * Email: raroman@g.coastal.edu
 * Date: 9/10/2013
 */
import javax.swing.JOptionPane;
public class SimpleCalculator {

	public static void main(String args[])
	{
		//Declare variables
		String integer1 = "";
		String integer2 = "";
		String answer = "";
		int addAnswer = 0;
		int subAnswer = 0;
		int absDiff = 0;
		double sqrt = 0;
		double power = 0;
		boolean done = false;
		
		while(!done)
		{
			try
			{
				//Show menu	
				answer = SimpleCalculatorLibrary.showMenu();
				String answerAllCaps = answer.toUpperCase();
				String answerAllCaps2 = "";
				//Check answer
				if(!answerAllCaps.equals("QUIT"))
				{
					
					if(answerAllCaps.equals("ADD"))
					{
						answerAllCaps2 = SimpleCalculatorLibrary.getUser(answerAllCaps);
						integer1 = SimpleCalculatorLibrary.getFirstInt();
						integer2 = SimpleCalculatorLibrary.getSecondInt();
						addAnswer = SimpleCalculatorLibrary.add(integer1,integer2);
						SimpleCalculatorLibrary.outPut(answerAllCaps2, integer1, integer2, addAnswer, subAnswer, absDiff, sqrt, power);
					}
					else if(answerAllCaps.equals("SUBTRACT"))
					{
						answerAllCaps2 = SimpleCalculatorLibrary.getUser(answerAllCaps);
						integer1 = SimpleCalculatorLibrary.getFirstInt();
						integer2 = SimpleCalculatorLibrary.getSecondInt();
						subAnswer = SimpleCalculatorLibrary.subtract(integer1,integer2);
						SimpleCalculatorLibrary.outPut(answerAllCaps2, integer1, integer2, addAnswer, subAnswer, absDiff, sqrt, power);
					}
					else if(answerAllCaps.equals("ABSDIFF"))
					{
						answerAllCaps2 = SimpleCalculatorLibrary.getUser(answerAllCaps);
						integer1 = SimpleCalculatorLibrary.getFirstInt();
						integer2 = SimpleCalculatorLibrary.getSecondInt();
						absDiff = SimpleCalculatorLibrary.absDiff(integer1,integer2);
						SimpleCalculatorLibrary.outPut(answerAllCaps2, integer1, integer2, addAnswer, subAnswer, absDiff, sqrt, power);
					}
					else if(answerAllCaps.equals("SQRT"))
					{
						answerAllCaps2 = SimpleCalculatorLibrary.getUser(answerAllCaps);
						integer1 = SimpleCalculatorLibrary.getFirstInt();
						sqrt = SimpleCalculatorLibrary.sqrtRoot(integer1);
						SimpleCalculatorLibrary.outPut(answerAllCaps2, integer1, integer2, addAnswer, subAnswer, absDiff, sqrt, power);
					}
					else if(answerAllCaps.equals("POW"))
					{
						answerAllCaps2 = SimpleCalculatorLibrary.getUser(answerAllCaps);
						integer1 = SimpleCalculatorLibrary.getFirstInt();
						integer2 = SimpleCalculatorLibrary.getSecondInt();
						power = SimpleCalculatorLibrary.power(integer1, integer2);
						SimpleCalculatorLibrary.outPut(answerAllCaps2, integer1, integer2, addAnswer, subAnswer, absDiff, sqrt, power);
					}
				}
				else 
				{
					SimpleCalculatorLibrary.showQuitMessage();
					done = true;
				}
			}
			catch(IllegalArgumentException iae)
			{
				JOptionPane.showMessageDialog(null,iae.getMessage());
			}
			//end try catch
		}
		//end while loop
	}
}

