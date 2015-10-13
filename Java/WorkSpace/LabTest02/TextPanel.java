/**
 * TextPanel - custom JPanel that has text fields
 * that allow I/O with user(s)
 *
 *	Course: 150
 *	Lab Test 2
 *	Date 11/12/13
 * @author Richard A Roman
 * @email raroman@coastal.edu
 */
import java.awt.*;
import javax.swing.*;

public class TextPanel extends JPanel{
	
	/**
	 * Attributes - JLabels and TextFields
	 */
	private JLabel depositLabel;
	private JLabel withdrawLabel;
	private JLabel showBalance;
	
	private JTextField depositTextField;
	private JTextField withdrawTextField;
	private double balance;
	
	
	/**
	 * Default Constructor
	 */
	public TextPanel(){
		this.init();
	}
	
	/**
	 * helper Method
	 */
	private void init(){
		// Create a grid layout and set to super
		super.setLayout(new GridLayout(3,2));
		
		//initialize deposit label and textfield
		depositLabel = new JLabel("Deposit:");
		depositLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		super.add(depositLabel);
		
		depositTextField = new JTextField();
		super.add(depositTextField);
		
		withdrawLabel = new JLabel("Withdraw:");
		withdrawLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		super.add(withdrawLabel);
		
		withdrawTextField = new JTextField();
		super.add(withdrawTextField);
		
		showBalance = new JLabel("Balance: "+balance);
		showBalance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		super.add(showBalance);
	}
	
	/**
	 * 	method takes value from the withdraw or  updates the balance with
	 *   the new value.
	 */
	public void doWAction(){
		//System.out.println("In withdraw");
		
		double tempWithDraw = Double.parseDouble(withdrawTextField.getText()); 
		double getBalance = Double.parseDouble(showBalance.getText());
		
		try{
			
			if(tempWithDraw < getBalance){
				getBalance = getBalance - tempWithDraw;
				String answer = Double.toString(getBalance);
				showBalance.setText(answer);
			}
			if(tempWithDraw >= getBalance){
				 throw new IllegalArgumentException("Invalid input. With draw cannot exceed balance.");
			}
		}
		catch(IllegalArgumentException iae){
			javax.swing.JOptionPane.showMessageDialog(null,iae.getMessage());
		}
			
}
		
	/**
	 * 	method takes value from  deposit and updates the balance with
	 *   the new value.
	 */
	public void doDAction(){
		double tempDeposit = Double.parseDouble(depositTextField.getText());
		
		try{
		
			if(tempDeposit > 0){
				balance = tempDeposit + balance;
				String answer = Double.toString(balance);
				showBalance.setText(answer);
			}
			else{
				throw new IllegalArgumentException("Invalid input.");
			}
		}
		catch(IllegalArgumentException iae){
			javax.swing.JOptionPane.showMessageDialog(null,iae.getMessage());
		}

	}
}
