/**
 * MainFrame.java - sets up panel
 * @author Richard A Roman
 * @author Clint
 * Course: 150
 * Lab11
 * Email: raroman@coastal.edu
 * Date: 11/19/2013
 */
package view;

import model.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame{
	
	public final int WIDTH = 350;
	public final int HEIGHT = 350;
	
	
	private JMenuBar menuBar;
	private JMenu select;
	private JMenuItem circleItem;
	private JMenuItem squareItem;
	private DrawingPanel drawingPanel;
	
	public MainFrame(String aTitle){
		super.setTitle(aTitle);
		
		super.setSize(WIDTH,HEIGHT);
		
		setup();
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		super.setVisible(true);
		
	}
	
	private void setup(){
		
		MenuItemListener listener = new MenuItemListener();
		
		menuBar = new JMenuBar();
		
		select = new JMenu ("Select");
		
		circleItem = new JMenuItem("Circle");
		circleItem.addActionListener(listener);
		select.add(circleItem);
		
		squareItem = new JMenuItem("Square");
		squareItem.addActionListener(listener);
		select.add(squareItem);
		
		menuBar.add(select);
		super.setJMenuBar(menuBar);
		
		drawingPanel = new DrawingPanel();
		super.add(drawingPanel,BorderLayout.CENTER);
	}
	
	public class MenuItemListener implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			boolean okay = false;
			model.Point tempPoint = null;
			String input = "";
			
			int x =0;
			int y = 0;
			int radius = 0;
			Color color = Color.RED;
			
			String actionCommand = ae.getActionCommand();
			
			if(actionCommand.equals("Circle")){
				
				//Get X coordinate
				while(!okay){
					input = JOptionPane.showInputDialog(null, "Please enter the x coordinate");
					try{
						x = Integer.parseInt(input);
						okay = true;
					}
					catch(NumberFormatException nfe){
						JOptionPane.showMessageDialog(null, "" + x + "is not valid, please try again");
					}
				}
				okay = false; 
				
				//Get Y coordinate
				while(!okay){
					input = JOptionPane.showInputDialog(null, "Please enter the y coordinate");
					try{
						y = Integer.parseInt(input);
						okay = true;
					}
					catch(NumberFormatException nfe){
						JOptionPane.showMessageDialog(null, "" + y + "is not valid, please try again");
					}
				}
				okay = false; 
				
				//get radius
				while(!okay){
					input = JOptionPane.showInputDialog(null, "Please enter the radius");
					try{
						radius = Integer.parseInt(input);
						okay = true;
					}
					catch(NumberFormatException nfe){
						JOptionPane.showMessageDialog(null, "" + radius + "is not valid, please try again");
					}
					//color =JOptionPane.showInputDialog(this,"Please enter a color (ex COlor.RED) ");
				}
				
				tempPoint = new model.Point(x,y);
				Circle temp = new Circle(color,tempPoint,radius);
				
				//update to draw circle
				drawingPanel.update(temp);
			}
			else if(actionCommand.equals("Square")){
				JOptionPane.showMessageDialog(null, "Square is not implemented");
			}
		}
	}//end listener
}
