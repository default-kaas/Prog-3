package week5A;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		
		MyContentPane myPane = new MyContentPane();
		myFrame.setContentPane(myPane);
		myPane.creat();
		myFrame.pack();
	}
}
