package week4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		/*Marijn marijn = new Marijn();*/
		JFrame myFrame = new JFrame();
		
		/*This  determinats the size of the screen 
		 *and after that makes the height and the width one fourth to that for the JFrame.*/
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		myFrame.setSize(screenSize.width/4, screenSize.height/4);
		myFrame.setTitle("PROG3 Week4 Simpel");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*This will place the JFrame in the middle if there are no other components found.
		 * Ask for a more precise explation.*/
		myFrame.setLocationRelativeTo(null);
		
		/*Turn this on if you would like to remove the border around your screen.*/
		myFrame.setUndecorated(false);
		myFrame.setResizable(false);
		myFrame.setVisible(true);
		
		myFrame.getContentPane().setBackground(Color.GREEN);
		/*Be aware that this is not meant for people with epilepsy, because it can harm them.
		while(true) {
			myFrame.getContentPane().setBackground(Color.GREEN);
			myFrame.getContentPane().setBackground(Color.BLUE);
			myFrame.getContentPane().setBackground(Color.RED);
		}
		*/
	}
	
}