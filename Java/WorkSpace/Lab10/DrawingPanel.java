/**
 * DrawingPanel.java - custom JPanel that draws
 * @author Richard A Roman
 * Course: 150
 * Lab10
 * Email: raroman@coastal.edu
 * Date: 11/5/2013
 */

import  java.awt.*;
import javax.swing.*;


public class DrawingPanel extends JPanel{

	public void paint(Graphics g){
		//draws face
		g.setColor(Color.YELLOW);
		g.fillOval(100, 100, 200, 200);
		
		g.setColor(Color.BLACK);
		g.fillOval(150, 150, 25, 25);
		
		g.setColor(Color.BLACK);
		g.fillOval(225,150,25,25);
		
		
		g.drawLine(150, 250, 250, 250);
		
		g.setColor(Color.RED);
		g.fillArc(175, 205, 50, 90, 0, -180);
		
		//draws bullseye
		g.setColor(Color.BLACK);
		g.fillOval(300, 300, 400, 400);
		
		g.setColor(Color.WHITE);
		g.fillOval(350,350,300,300);
		
		g.setColor(Color.BLACK);
		g.fillOval(400,400,200,200);
		
		g.setColor(Color.WHITE);
		g.fillOval(450,450,100,100);
		
		g.setColor(Color.BLACK);
		g.fillOval(480, 480, 40, 40);
		
		
		
	}
	
	
}
