package week5A;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyContentPane extends JPanel {
	
	public void creat() {
		setPreferredSize(new Dimension(300,300));
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0,0,300,300);
		g.setColor(Color.BLACK);
		g.fillRect(50,50,200,200);
	}
}
