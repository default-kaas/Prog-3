package week4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class Oomse extends JPanel {
	public void paintComponent(Graphics g) {
		Rectangle first = new Rectangle(0,0,300,300);
		Rectangle second = new Rectangle(300,0,300,300);
		Rectangle third = new Rectangle(600,0,300,300);
		
		Rectangle fourth = new Rectangle(0,300,300,300);
		Rectangle fifth = new Rectangle(300,300,300,300);
		Rectangle sixth = new Rectangle(600,300,300,300);
		
		Rectangle seventh = new Rectangle(0,600,300,300);
		Rectangle eigth = new Rectangle(300,600,300,300);
		Rectangle nineth = new Rectangle(600,600,300,300);
		
		while(true) {
			g.drawRect(((int)(first.getX())),((int)(first.getY())),((int)(first.getWidth())),((int)(first.getHeight())));
			g.setColor(Color.green);
		}
		
	}
}
