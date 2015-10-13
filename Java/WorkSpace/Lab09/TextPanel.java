/**
 * TextPanel - custom JPanel that has text fields
 * that allow I/O with user(s)
 */

/**
 * @author Richard A Roman <------<<<<<<<<<<<
 * @author clint fuchs
 * @version 1.0
 * @email raroman@coastal.edu
 * @email clintf@coastal.edu
 */

import java.awt.*;
import javax.swing.*;
public class TextPanel extends JPanel {
	
	/**
	 * Label for Kilograms
	 */
	private JLabel kiloLabel;
	
	/**
	 * Label for Pounds
	 */
	private JLabel poundLabel;
	
	/**
	 * Text Field for I/O of kilograms converted or for
	 * conversion
	 */
	private JTextField kiloTextField;
	
	/**
	 * Text Field for I/O of pounds converted or for
	 * conversion
	 */
	private JTextField poundTextField;
	
	public TextPanel(){
		this.setup();
	}
	
	/**
	 * Helper method that creates components and
	 * adds them to this.
	 */
	private void setup(){
		
		//1 first you need to create a grid layout of 2 rows 2 cols
		//2 set the layout of this 
		super.setLayout(new GridLayout(2,2));
		//3 initialize the kilogramsLabel
		kiloLabel = new JLabel("Kilograms:");
		kiloLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		//4 add kilogramsLabel to this (note - you just need
		//   to add, the JPanel will automatically place the
		//   component according to the LayoutManager
		super.add(kiloLabel);
		
		//5 initalize the kilogramsTextField
		kiloTextField = new JTextField();	
		
		//6 add kilogramsTextField to this
		super.add(kiloTextField);
		
		//7 initialize the poundsLabel
		poundLabel = new JLabel("Pounds:");
		poundLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		//8 add poundsLabel to this
		super.add(poundLabel);
		
		//9 initalize the poundsTextField
		poundTextField = new JTextField();
		
		//10 add poundsTextField to this
		super.add(poundTextField);
		
		
	}
	
	

	/**
	 * method takes value from the poundsTextField and converts
	 *   it to kilograms and updates the kilogramsTextField with
	 *   the converted value.
	 */
	public void doPoundAction(){
		//Here you will need to extract the text -
		// see API for JTextField (note you may have to
		// find the method you need up the inheritance chain
		
		//after you extract the text, you will need to convert
		// it to a double value
		
		//after you convert the value, you will need to apply
		// appropriate formula (helper method below)
		//pound to kg
		try{
			double tempPound = Double.parseDouble(poundTextField.getText());
			double kiloTemp = 0.0;
			if(tempPound > 0){
				kiloTemp = tempPound/2.2046;
				String answer = Double.toString(kiloTemp);
				kiloTextField.setText(answer);
			}
			else{
				throw new IllegalArgumentException("Invalid input: " + tempPound);
			}
		}
		catch(IllegalArgumentException iae){
			javax.swing.JOptionPane.showMessageDialog(this,iae.getMessage());
		}
		
			
		}
		//you will then need to place the result in the 
		// kilogramsTextField
		
		

	
	
	/**
	 * method takes value from the kilogramsTextField and converts
	 *   it to pounds and updates the poundsTextField with
	 *   the converted value.
	 */
	public void doKiloAction(){
		
		try{
			double tempKilo = Double.parseDouble(kiloTextField.getText());
			double poundTemp = 0.0;
			//kg to pounds
			if(tempKilo > 0){
				poundTemp = tempKilo * 2.2046;
				String answer = Double.toString(poundTemp);
				poundTextField.setText(answer);
				
			}
			else{
				throw new IllegalArgumentException("Invalid input: " + tempKilo);
			}
		}
		catch(IllegalArgumentException iae){
			javax.swing.JOptionPane.showMessageDialog(null,iae.getMessage());
		}
	}
	
	
	/**
     * @param kilograms represents a value in kilograms
     * 
     * @return the param kilograms converted to pounds
     */
    public double convertKilogramsToPounds(double kilograms){
        double pounds = 0.0;
        
        return pounds;
    }

}
