/**
 * Drawingpanel.java - draws the shape
 * @author Richard A Roman
 * @author Clint
 * Course: 150
 * Lab11
 * Email: raroman@coastal.edu
 * Date: 11/19/2013
 */
package view;

import java.awt.*;
import javax.swing.*;
import model.*;//package we created

public class DrawingPanel extends JPanel {
	
	private Drawable drawableShape;
	
	public DrawingPanel(){
		
	}
	public void update(Drawable aShape){
		this.drawableShape = aShape;
		super.repaint();
		
	}
	
	public void paint(Graphics g){
		if(drawableShape != null){
			drawableShape.draw(g);
		}
		
	}
}
