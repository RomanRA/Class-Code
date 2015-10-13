/* PetCaretakerTester.java - consist of a main method that instantiates
 * a Pet object and loops continuously, checking on the status of our Pet, and
 * displaying a list of options to work with the Pet object.
 * Name: Richard A. Roman
 * Course: 150
 * HomeWork Assignment 3 Part1
 * Email: raroman@g.coastal.edu
 * Date 10/3/2013
 */
import javax.swing.JOptionPane;
public class PetCaretakerTester 
{
	public static void main(String[] args) 
	{
		//Declare Variables
		String dogName = "";
		String theBreed = "";
		String userEntered = "";
		String userEnteredAllCaps = "";
		int testResult1 = 0;
		int testResult2 = 0;
		boolean done = false;
		boolean valid = false;
		
		//Create Pet Object
		Pet pet1 = new Pet();
		JOptionPane.showMessageDialog(null, "Welcome to the Pet Caretaker.");
		
		
		dogName = javax.swing.JOptionPane.showInputDialog("Please enter the name of your dog:");
		JOptionPane.showMessageDialog(null, "You entered: "+dogName);
		pet1.setName(dogName);
		
		theBreed = javax.swing.JOptionPane.showInputDialog("What breed is "+dogName+":");
		JOptionPane.showMessageDialog(null, "You entered: "+theBreed);
		JOptionPane.showMessageDialog(null,dogName+" is Happy, and Full...");
	

		//setting the bet name and breed
		//pet1.setName("lola");
		//pet1.setBreed("Chihuahua");
		//pet1.printPetInformation();
		
		while(!done)
		{
			
			userEntered = JOptionPane.showInputDialog(null,"Enter \"Feed\" to feed "+dogName+
					"\nEnter \"Play\" to play with "+dogName+ "\nEnter \"Ignore\" to ignore "+dogName+
					"\nEnter \"Exit\" to exit this program ");
			
			
			userEnteredAllCaps = userEntered.toUpperCase();
			if(userEnteredAllCaps.equals("FEED"))
			{
				pet1.feed();
				JOptionPane.showMessageDialog(null, "You are Feeding "+dogName+"...");
				pet1.determineIfHungry();
				pet1.determineIfHappy();
			}
			else if(userEnteredAllCaps.equals("PLAY"))
			{
				pet1.play();
				JOptionPane.showMessageDialog(null, "You are Playing with "+dogName+"...");
				pet1.determineIfHungry();
				pet1.determineIfHappy();
			}
			else if(userEnteredAllCaps.equals("IGNORE"))
			{
				JOptionPane.showMessageDialog(null,"You are Ignoring "+dogName+"...");
				pet1.determineIfHungry();
				pet1.determineIfHappy();
			}
			else if(userEnteredAllCaps.equals("EXIT"))
			{
				done = true;
			}
			
			testResult1 = pet1.getHappy();
			testResult2 = pet1.getHungry();
			
			//This was to check the points ever loop 
			 System.out.println("Result 1 happy is: "+testResult1+
								" Result 2 hungry isi: "+testResult2);
			
			//Each time we execute the loop, the Pet will lose 9 happy points and gain 14 hungry points.
			pet1.pointsGainLose();
			
			//Pauses program each loop cycle
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie) 
			{
        		System.out.println("InterruptedException should not have occurred.");
			}

		}
		
		JOptionPane.showMessageDialog(null, "Thank you for using the PetCaretaker program.");
	}
}
