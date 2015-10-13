
/**
 *  WeightCalculatorFrame is a GUI that allows
 *  users to convert Pounds to Kilograms and
 *  Kilograms to Pounds.
 * 
 * Note: the only things you have to do in 
 *       this class are add the two Panels to
 *       this as indicated below in setup()
 *       and add another handler method -
 *       as indicated below
 */

/**
 * @author Richard A Roman
 * @author clint fuchs
 * 
 * @version 1.0
 * @email clintf@coastal.edu
 * @email raroman@coastale.edu
 */

import java.awt.*;
import javax.swing.*;

public class WeightCalculatorFrame extends JFrame {
	
	
	public static final int FRAME_WIDTH = 350;
	public static final int FRAME_HEIGHT = 175;
	private TextPanel textPanel;
	private ButtonPanel buttonPanel;

	
	/**
	 * Default Constructor for WeightCalculator
	 */
	public WeightCalculatorFrame(){
		super.setTitle("Weight Calculator ");
		super.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		
		this.setup();
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
	}
	
	/**
	 * Helper method to setup this TextPanel
	 */
	private void setup(){
		
		//JPanel weightCalculator = new JPanel();
		
		textPanel = new TextPanel();
		
		this.add(textPanel,BorderLayout.CENTER);
		
		buttonPanel = new ButtonPanel(this);
		this.add(buttonPanel,BorderLayout.SOUTH);
		

		//LayoutManager layout = new GridLayout();
		//weightCalculator.setLayout(new BorderLayout());
		
		
	}
	

	/**
	 * method that allows the ButtonPanel to 
	 * communicate with this WeightCalculatorFrame
	 */
	public void handlePoundButtonPress(){
		textPanel.doPoundAction();
	}
	
	/**
	 * method that allows the ButtonPanel to 
	 * communicate with this WeightCalculatorFrame 
	 */

	public void handleKiloButtonPress(){
		textPanel.doKiloAction();
	}
	
	

	public static void main(String[] args){
		
		WeightCalculatorFrame testFrame = new WeightCalculatorFrame();
		
	}//End Main
	
	
	
}
