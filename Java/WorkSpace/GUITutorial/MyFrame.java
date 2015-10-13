
/**
 * MyFame is my personal Frame that i made for me
 * @author Richard
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyFrame extends JFrame {
	
	//attributes
	public final static int WIDTH = 350;
	public final static int HEIGHT = 300;
	
	private JButton clickButton;
	private JTextField inField;
	private JTextField outField;
	private JLabel myLabel;
	
	private int numberOfLives;
	
	//constructors
	public MyFrame(){
		//super();
		super("My Frame");
		
		
	}
	
	public MyFrame(String aTitle){
		super();
		super.setTitle(aTitle);
		
		this.setup();
	}
	
	private void setup(){
		super.setSize(WIDTH,HEIGHT);
		
		Container container = super.getContentPane();
		
		LayoutManager layout = new BorderLayout();
		//setting layput of master container
		container.setLayout(layout);
		
		myLabel = new JLabel("Hello out there");
		
		container.add(myLabel, BorderLayout.NORTH);
		
		
		
	}
	//accessors
	
	//mutators
	

}
