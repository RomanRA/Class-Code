/**
 * ButtonPanel - custom JPanel that has JButton Fields
 * that allow I/O with user(s)
 * 
 * Course: 150
 *	Lab Test 2
 *	Date 11/12/13
 * @author Richard A Roman
 * @email raroman@coastal.edu
 * 
 */
import java.awt.event.*;
import javax.swing.*;


public class ButtonPanel extends JPanel{

	/**
	 * JButton for withdrawing
	 */
	private JButton withDrawButton;
	
	/**
	 * JButton for deposit
	 */
	private JButton depositButton;
	
	/**
	 * JFrame reference to allow communication with
	 *   the main container
	 */
	private BankFrame tempBankFrame;
	
	/**
	 * Default Constuctor
	 * @param aFrame
	 */
	public ButtonPanel(BankFrame aFrame){
		//Call to JPanel Constructor
		super();
		tempBankFrame = aFrame;
		
		//Private helper methods
		init();
	}
	
	/**
	 * Helper method
	 */
	private void init(){
			//create a withdraw button
			withDrawButton = new JButton("Withdraw");
			
			//create a withdraw listener
			WithDrawAndDeposit listener = new WithDrawAndDeposit();
			
			//add listener to button
			withDrawButton.addActionListener(listener);
			
			//add to this
			this.add(withDrawButton);
			
			depositButton = new JButton("Deposit");
			depositButton.addActionListener(listener);
			this.add(depositButton);
		}
	
	
	/**
	 * private inner class to handle the event of the poundsButton
	 *   being pressed. 
	 */
	private class WithDrawAndDeposit implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			
				String actionString = ae.getActionCommand();
				//System.out.println(actionString);
				
				if(actionString.equals("Withdraw")){
					tempBankFrame.handleWithdrawPress();
				}
				if(actionString.equals("Deposit")){
					tempBankFrame.handleDepositPress();
				}
				
				
		}
	}
}
	
