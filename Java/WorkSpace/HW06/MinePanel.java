/** 
 * MinePanel.java - custom JPanel that create a 2D array with JButtons
 * that allow I/O with user(s)
 * Name: Richard Roman
 * Course: 150
 * Homework06
 * Email: raroman@coastal.edu
 * Date: 11/18/2013
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class MinePanel extends JPanel{

	/**
	 * JButton for holding grid buttons
	 */
	private JPanel gridButtons;
	
	/**
	 * JPanel for placing mines
	 */
	private JPanel placeMines; 
	
	/**
	 * JFrame reference to allow communication with the main constructor
	 */
	private Minefield tempMineField;
	
	/**
	 * JButton for placing buttons into grid 
	 */
	private JButton [][] buttonInGrid = new JButton[5][5];
	
	
	/**
	 * Start Coordinates for user and mines
	 */
	private int xPosStart;
	private int yPosStart;
	private int xPosMine1;
	private int yPosMine1;
	
	/**
	 * End Coordinates for user and mines
	 */
	private int xPosEnd;
	private int yPosEnd;
	private int xPosMine2;
	private int yPosMine2;
	
	/**
	 * Default Constructor
	 */
	public MinePanel(Minefield aFrame){
		super();
		tempMineField  = aFrame;
		init();
	}
	
	public void init(){
		
		//System.out.println("Inside MinePanel init");
		//Create Minefield
		gridButtons = new JPanel();
		gridButtons.setLayout(new GridLayout(5,5));
		
		for(int i = 0; i < 5 ;i++){
			for(int j = 0; j < 5  ; j++){
				
				//create a button
				buttonInGrid[i][j] = new JButton();
				//buttonInGrid[i][j].setOpaque(true);
			
				//create/add listener
				SelectionListener listener = new SelectionListener();
				buttonInGrid[i][j].addActionListener(listener);
				
				//set size of button
				buttonInGrid[i][j].setPreferredSize(new Dimension(100,100));
				buttonInGrid[i][j].setActionCommand(i+","+j);
				
				//add button at locaation in 2d array to grid
				gridButtons.add(buttonInGrid[i][j]);
				
				//Check the coordinates
				//System.out.println("The coordinates:" +i+" , "+j);
				
			
			}
		}
		//call method to set start and end point for user
		setStartAndEnd();
		
		//call method for mines
		setMines();
		
		this.add(gridButtons);
	}	
	
	private class SelectionListener implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			
			String actionString = ae.getActionCommand();
			//System.out.println(actionString);
			

			for(int i = 0; i < 5 ;i++){
				for(int j = 0; j < 5  ; j++){
					if(actionString.equals(i+","+j)){
						buttonInGrid[i][j].setBackground(Color.BLUE);
					}
					if(actionString.equals(xPosMine1+","+yPosMine1)){
						buttonInGrid[xPosMine1][yPosMine1].setText("Mine");
						buttonInGrid[xPosMine1][yPosMine1].setBackground(Color.RED);
					}
					if(actionString.equals(xPosMine2+","+yPosMine2)){
						buttonInGrid[xPosMine2][yPosMine2].setText("Mine");
						buttonInGrid[xPosMine2][yPosMine2].setBackground(Color.RED);
					}
				
					
				}//End inner for loop
			}//End for loop
			
			
		}//End ActionPerformed
		
	}//End Listener class
	
	//Method to create start and end button
	public void setStartAndEnd(){
		//generate random number between 0 and 4
		Random random = new Random();
		boolean valid = true;
		
		do{
			//2D array is from 0-4
			xPosStart = (random.nextInt(5));
			yPosStart = (random.nextInt(5));
		
			xPosEnd = (random.nextInt(5));
			yPosEnd = (random.nextInt(5));
			
			//System.out.println("Start at : "+xPosStart+","+yPosStart);
			//System.out.println("End at : "+xPosEnd+","+yPosEnd);
			
			//check to make sure start  ad end point are different
			if((xPosStart != xPosEnd) && (yPosStart  != yPosEnd)){
				
				buttonInGrid[xPosStart][yPosStart].setText("Start");
				buttonInGrid[xPosStart][yPosStart].setBackground(Color.GREEN);
				
				buttonInGrid[xPosEnd][yPosEnd].setText("End");
				buttonInGrid[xPosEnd][yPosEnd].setBackground(Color.GREEN);
				
				valid = true;
			}
			else {
				valid = false;
			}
			  
		}
		while(!valid);
		
		
	}
	
	//Methods set random mines
	public void setMines(){
		Random random = new Random();
		boolean valid = true;
		
		do{
			//System.out.println("Finding location");
			
			xPosMine1 = (random.nextInt(5));
			yPosMine1 = (random.nextInt(5));
		
			xPosMine2 = (random.nextInt(5));
			yPosMine2 = (random.nextInt(5));
			
			//Check to make sure the mines are not placed in same location as the user start or end
			if((xPosStart != xPosMine1) && (xPosStart != xPosMine2) && (yPosStart != yPosMine1) && (yPosStart != yPosMine2) && 
				(xPosEnd != xPosMine1) && (xPosEnd != xPosMine2) && (yPosEnd != yPosMine1) && (yPosEnd != yPosMine2)){	
				//System.out.println("Generating mines...");
				
				buttonInGrid[xPosMine1][yPosMine1].setActionCommand(xPosMine1+","+yPosMine1);
				buttonInGrid[xPosMine2][yPosMine2].setActionCommand(xPosMine2+","+yPosMine2);
				
				valid = true;
			}
			else{
				valid = false;
			}
			
		}
		while(!valid);
		
	}
	
	//clears the board
	public void clearBoard(){
		System.out.println("Clear in class MinePanel");
		
		this.init();
	}
	
	
	
}//End MinePanel class

