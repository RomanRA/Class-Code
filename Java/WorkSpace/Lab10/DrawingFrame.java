/**
 * DrawingFrame.java - contains main method that has a testframe which displays two drawings
 * @author Richard A Roman
 * Course: 150
 * Lab10
 * Email: raroman@coastal.edu
 * Date: 11/5/2013
 */
import javax.swing.*;
import java.awt.*;

/**
 * Default Constructor
 */
public class DrawingFrame extends JFrame {

	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 800;
	private DrawingPanel drawingPanel;
	
	public DrawingFrame(){
		super.setTitle("Picture Frame");
		super.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		
		this.init();
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
	}
	
	
	/**
	 * Helper method
	 */
	private void init(){
		
		//create face
		drawingPanel = new DrawingPanel();
		//add to frame
		super.add(drawingPanel);
		
		
	}
	
	
	public static void main(String[] args) {
		DrawingFrame testFrame = new DrawingFrame();
	}//end main

}
