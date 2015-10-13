/**
 * ButtonPanel - custom JPanel that has JButton Fields
 * that allow I/O with user(s)
 */

/**
 * @author Richard A Roman <------<<<<<<<<<<<
 * @author clint
 * @version 1.0
 * @email raroman@coastal.edu
 * @email clintf@coastal.edu
 */

import java.awt.event.*;
import javax.swing.*;

//JPanel
public class ButtonPanel extends JPanel {
	/**
	 * JButton for converting Kilograms to Pounds
	 */
	private JButton kiloButton;
	
	/**
	 * JButton for converting Pounds to Kilograms
	 */
	private JButton poundButton;
	
	/**
	 * JFrame reference to allow communication with
	 *   the main container
	 */
	private WeightCalculatorFrame tempCalcFrame;
	
	/**
	 * Default Constructor
	 * @param aFrame represents a valid WeightCalculatorFrame
	 */
	public ButtonPanel(WeightCalculatorFrame aFrame){
		//Call to JPanel Constructor
		super();
		tempCalcFrame = aFrame;
		
		//Private helper methods
		setup();
	}
	
	/**
	 * Helper method to setup the ButtonPanel
	 */
	private void setup(){
		
		//create kilo Button
		kiloButton = new JButton("Kilograms to Pounds");
		kiloButton.setToolTipText("Press this button to convert Kilograms to Pounds");
		//create kiloListener object
		ActionListener kiloListener = new KilogramsListener();
			
		kiloButton.addActionListener(kiloListener);
		this.add(kiloButton);
			
		
		poundButton = new JButton("Pounds to Kilograms");
		poundButton.setToolTipText("Press this button to convert Pounds to Kilograms");

		ActionListener poundListener = new PoundsListener();
		
		poundButton.addActionListener(poundListener);
		this.add(poundButton);
	}
	/**
	 * private inner class to handle the event of the poundsButton
	 *   being pressed.
	 *   
	 * @author clint
	 * @version 1.0
	 * @email clintf@coastal.edu
	 */
	private class PoundsListener implements ActionListener{
		
		/**
		 * method must be implemented from the ActionListener
		 * interface
		 * 
		 * @param ae represents a valid ActionEvent
		 */
		public void actionPerformed(ActionEvent ae){
			tempCalcFrame.handlePoundButtonPress();
		}
			//String actionString  = ae.getActionCommand();
			//call to method in the WeightCalculatorFrame
			/*if(actionString .equals("Pounds to Kilograms")){
				tempCalcFrame.handlePoundButtonPress();
			}
			else if(actionString.equals("Kilograms to pounds"){
				tempCalcFrame.handleKilogramButtonPress();
			
		}*/
			
	}
	
	/**
	 * private inner class to handle the event of the kilogramsButton
	 *   being pressed.
	 *   
	 * @author Richard A Roman <------------<<<<<<<<<<<
	 * @version 1.0
	 * @email raroman@coastal.edu
	 */
	private class KilogramsListener implements ActionListener{
		/**
		 * method must be implemented from the ActionListener
		 * interface
		 * 
		 * @param ae represents a valid ActionEvent
		 */
		public void actionPerformed(ActionEvent ae){
			tempCalcFrame.handleKiloButtonPress();
		}
	
	
	}	

}
