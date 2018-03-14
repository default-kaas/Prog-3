package week5B;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyGui extends JFrame{
	
	public void create() {
		
	}
	
	private void creatMenus() {
		JMenuBar menuBar = new JMenuBar();
		JMenu file = new JMenu("File"), layout = new JMenu("Layout");
		JMenuItem fExit = new JMenuItem("Exit"), lBorder= new JMenuItem("Border layout"), 
				lBox = new JMenuItem("Box layout"), lFlow = new JMenuItem("Flow layout"), 
				lGrid = new JMenuItem("Grid layout");
		
		menuBar.add(file);
		menuBar.add(layout);
		
		file.add(fExit);
		
		layout.add(lBorder);
		layout.add(lBox);
		layout.add(lFlow);
		layout.add(lGrid);
		
		
		
	}
	
}
