/**
 * Minefield.java 
 * Name: Richard Roman
 * Course: 150
 * Homework06
 * Email: raroman@coastal.edu
 * Date: 11/18/2013
 */
import java.awt.*;
import javax.swing.*;

public class Minefield extends JFrame {

	public static final int FRAME_WIDTH = 600;
	public static final int FRAME_HEIGHT = 600;
	private ButtonPanel buttonPanel;
	private MinePanel buttonPanelGrid;
	
	/**
	 * Default constructor
	 */
	public Minefield(){
		super.setTitle("MineField Game");
		super.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		
		this.init();
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
		
	}
	
	/**
	 * Helper method
	 */
	public void init(){
		
		//Create clear and done buttons
		buttonPanel = new ButtonPanel(this);
		this.add(buttonPanel,BorderLayout.SOUTH);
		
		//create grid panel
		buttonPanelGrid = new MinePanel(this);
		this.add(buttonPanelGrid,BorderLayout.CENTER);
	
		
		
	}
	
	/**
	 * handlesClearPress handles button press from ButtonPanel
	 */
	public void handleClearPress(){
		//reset program here
		System.out.println("In Clear");
		buttonPanelGrid.removeAll();
		buttonPanelGrid.clearBoard();	
		
		//call to MinePanel clearBorad method
	}
	
	/**
	 * handleDonePress handles button press from ButtonPanel
	 */
	public void handleDonePress(){
		//finish game and determine if user chose the correct path
		System.out.println("Game Ended");
		
	}
	
	/**
	 * Main method 
	 */
	public static void main(String[] args){
		//creates a new game
		Minefield mineFieldGame = new Minefield();
		

	}//end main

}
