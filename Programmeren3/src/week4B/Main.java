package week4B;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		
		JFrame myFrame = new JFrame();
		myFrame.setTitle("PROG3 Week4b simpel");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		
		JPanel myContentPane = new JPanel();
		myContentPane.setBackground(Color.RED);
		Dimension demension = new Dimension(300,300);
		myContentPane.setPreferredSize(demension);
		
		myFrame.setContentPane(myContentPane);
		
		myFrame.pack();
		
		JPanel mySquare = new JPanel();
		mySquare.setBackground(Color.BLACK);
		myContentPane.add(mySquare);
		
		myContentPane.setLayout(null);
		mySquare.setBounds(50, 50, 200, 200);
		
		
	}
}
