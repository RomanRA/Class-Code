/**
 * ButtonPanel.java - custom JPanel that has JButtonFields that extends Minefield.java
 * Name: Richard Roman
 * Course: 150
 * Homework06
 * Email: raroman@coastal.edu
 * Date: 11/18/2013
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonPanel extends JPanel{
	/**
	 * JButtton for resetting game
	 */
	private JButton clearButton;
	
	/**
	 * JButton for user to select done
	 */
	private JButton doneButton;
	
	/**
	 * JFrame reference to allow communication with the main constructor
	 */
	private Minefield tempFrame;
	
	/**
	 * Default Constructor
	 * @param aFrame represents a valid Minefield
	 */
	public ButtonPanel(Minefield aFrame){
		super();
		tempFrame  = aFrame;
		
		//Call to helper method
		init();
		
	}
	
	
	/**
	 * Helper method to setup button panel
	 */
	public void init(){
		//Creating clear button
		clearButton = new JButton("Clear");
		clearButton.setToolTipText("Press this button to reset game.");
		ClearAndDoneListener clearListener = new ClearAndDoneListener();
		clearButton.addActionListener(clearListener);
		super.add(clearButton);
		
		//Creating done button
		doneButton =  new JButton("Done");
		doneButton.setToolTipText("Press this button to finish game.");
		ClearAndDoneListener doneListener = new ClearAndDoneListener();
		doneButton.addActionListener(doneListener);
		super.add(doneButton);
	}
	
	/**
	 * private inner class to handle clear and done listeners
	 */
	private class ClearAndDoneListener implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String actionString = ae.getActionCommand();
			
			//System.out.println(actionString);
			
			if(actionString.equals("Clear")){
				tempFrame.handleClearPress();
			}
			if(actionString.equals("Done")){
				tempFrame.handleDonePress();
			}
		}
		
	}
	
}
