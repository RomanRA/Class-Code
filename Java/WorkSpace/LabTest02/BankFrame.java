/**
 *  BankFrame is a GUI that allows
 *  users to deposit and withdraw money
 *	
 *	Course: 150
 *	Lab Test 2
 *	Date 11/12/13
 * @author Richard A Roman
 * @email raroman@coastal.edu
 */
import javax.swing.*;
import java.awt.*;


public class BankFrame extends JFrame{

	public static final int FRAME_WIDTH = 450;
	public static final int FRAME_HEIGHT = 200;
	private TextPanel textPanel;
	private ButtonPanel buttonPanel;

	/**
	 * Default Constructor
	 */
	public BankFrame(){
		super.setTitle("Bank Account");
		super.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		
		this.init();
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
	}

	/**
	 * Helper method
	 */
	public void init(){
		
		textPanel = new TextPanel();
		this.add(textPanel,BorderLayout.CENTER);
		
		
		buttonPanel = new ButtonPanel(this);
		this.add(buttonPanel,BorderLayout.SOUTH);
		
	}
	
	/**
	 * handles button press from ButtonPanel
	 */
	public void handleWithdrawPress(){
		textPanel.doWAction();
	}
	public void handleDepositPress(){
		textPanel.doDAction();
	}


	public static void main(String[] args){
		
		BankFrame testFrame = new BankFrame();
		
	}//End Main
}