package week4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JFrame;

public class Marijn extends JFrame {
	Oomse oomse = new Oomse();
	
	public Marijn() throws InterruptedException {
		JFrame myFrame = new JFrame();
		myFrame.setVisible(true);
		myFrame.setSize(500, 500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(oomse);
		
	}
}
