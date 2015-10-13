import javax.swing.JOptionPane;
public class SimpleCalculatorLibrary 
{	
	
	//Menu method shows prints out menu
	public static final String MENU = "**************************\n"
	+ "* Simple Calulator        *\n"+ "*                                        *\n"
	+ "* Please enter one of  *\n"+  "* the following:              *\n\n" 
	+ "* ABSDIFF, ADD, SUBTRACT *\n"+ "* SQRT, POW, or QUIT           *";
	
	//showMenu returns user input answer
	public static String showMenu()
	{
		String userInput= "";
		userInput = javax.swing.JOptionPane.showInputDialog(MENU);
		return userInput;
	}
	//end method
	
	
	//Shows quit message when user enters quit. 
	public static void showQuitMessage()
	{
		JOptionPane.showMessageDialog(null,"Thank you for using the Simple Calculator, have a nice day!");
	}
	//end method
	
	
	//Method gets first integer value. 
	public static String getFirstInt() throws IllegalArgumentException
	{
		String integer1 = javax.swing.JOptionPane.showInputDialog("Enter first integer: ");
		int value = Integer.parseInt(integer1);
		JOptionPane.showMessageDialog(null," The First number you entered is: "+integer1);
		return integer1;
	}
	//end method
	
	
	//Method gets second integer value.
	public static String getSecondInt()
	{
		String integer2 = javax.swing.JOptionPane.showInputDialog("Enter second integer: ");
		JOptionPane.showMessageDialog(null,"The Second number you entered was: "+integer2);
		return integer2;
		
	}
	//end method
	
	
	//Method uses add function - converts integer string to integers to solve for sum.
	public static int add(String integer1, String integer2)
	{	
		int sumValue =0;
		int value1 = Integer.parseInt(integer1);
		int value2 = Integer.parseInt(integer2);
		sumValue = (value1 + value2);
		//JOptionPane.showMessageDialog(null,"Answer: "+value1+" + "+value2+" = "+sumValue);
		return sumValue;
	}
	//end method
	
	
	//Method uses subtraction function - converts integer string to solve for subtraction value.
	public static int subtract(String integer1,String integer2)
	{
		int subtractionValue = 0;
		int value1 = Integer.parseInt(integer1);
		int value2 = Integer.parseInt(integer2);
		subtractionValue = value1 - value2;
		//JOptionPane.showMessageDialog(null,"Answer: "+value1+" - "+value2+" = "+subtractionValue);
		return subtractionValue;
	}
	//end method
	
	
	//Method absolute difference - takes first and second value check to see if greater than zero if it is throw exception. 
	//Otherwise, finds max and minimum of the two values then find absolute difference.
	public static int absDiff(String integer1,String integer2)throws IllegalArgumentException
	{
		int absDiff = 0;
		int max = Integer.parseInt(integer1);
		int min = Integer.parseInt(integer2);
		int tempHolder = 0;
	
		if(max<0 || min <0)
		{
			throw new IllegalArgumentException("The numbers can not be negative for the ABSDIFF function");
		}
		else if(min>max)
		{
			tempHolder = max;
			max = min;
			min = tempHolder;
		}
		absDiff = Math.abs(max-min);
		//JOptionPane.showMessageDialog(null,"Answer: "+"|"+max+" - "+min+"|"+" = "+absDiff);
		return absDiff;
	}
	//end method
	
	
	//Method solves for square root.
	public static double sqrtRoot(String integer1)throws IllegalArgumentException
	{
		double value = Double.parseDouble(integer1);
		if(value<0)
		{
			throw new IllegalArgumentException("The number can not be a negative for the SQRT function");
		}
		double answer = Math.sqrt(value);
		//JOptionPane.showMessageDialog(null, "Answer: "+"\u221A"+value+" = "+answer);
		return answer;
	}
	//end method
	
	
	//Method that the first value and raise it to power of second.
	public static double power(String integer1, String integer2)
	{
		int value1 = Integer.parseInt(integer1);
		int value2 = Integer.parseInt(integer2);
		double powerValue = Math.pow(value1,value2);
		//JOptionPane.showMessageDialog(null, "Answer: "+value1+"^"+value2+" = "+powerValue);
		return powerValue;
	}
	//end method

	
	//Method prints out what math function the user selected.
	public static String getUser(String answerAllCaps)
	{
		String choice ="";
		
		if(answerAllCaps.equals("ADD"))
		{
			JOptionPane.showMessageDialog(null,"You have selected ADD.");
			choice = "ADD";
		}
		else if(answerAllCaps.equals("SUBTRACT"))
		{
			JOptionPane.showMessageDialog(null,"You have selected SUBTRACT.");
			choice = "SUBTRACT";
		}
		else if(answerAllCaps.equals("ABSDIFF"))
		{
			JOptionPane.showMessageDialog(null,"You have selected ABSDIFF.");
			choice = "ABSDIFF";
		}
		else if(answerAllCaps.equals("SQRT"))
		{
			JOptionPane.showMessageDialog(null,"You have selected SQRT.");
			choice = "SQRT";
		}
		else if(answerAllCaps.equals("POW"))
		{
			JOptionPane.showMessageDialog(null,"You have selected POW.");
			choice = "POW";
		}
		return choice;
	}
	//end method
	
	
	//output method
	public static void outPut(String answerAllCaps2,String integer1, String integer2,int addAnswer,int subAnswer,double absDiff,double sqrt,double power)
	{
		if(answerAllCaps2.equals("ADD"))
		{
			JOptionPane.showMessageDialog(null,"Answer: "+integer1+" + "+integer2+" = "+addAnswer);
		}
		else if(answerAllCaps2.equals("SUBTRACT"))
		{
			JOptionPane.showMessageDialog(null,"Answer: "+integer1+" - "+integer2+" = "+subAnswer);
		}
		else if(answerAllCaps2.equals("ABSDIFF"))
		{
			JOptionPane.showMessageDialog(null,"Answer: "+"|"+integer1+" - "+integer2+"|" + " = "+absDiff);
		}
		else if(answerAllCaps2.equals("SQRT"))
		{
			JOptionPane.showMessageDialog(null, "Answer: "+"\u221A"+integer1+" = "+sqrt);
		}
		else if(answerAllCaps2.equals("POW"))
		{
			JOptionPane.showMessageDialog(null, "Answer: "+integer1+"^"+integer2+" = "+power);
		}
	}
	//end method
	
}//end class


