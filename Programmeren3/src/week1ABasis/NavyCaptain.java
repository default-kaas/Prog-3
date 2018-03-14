package week1ABasis;

import java.util.ArrayList;

public class NavyCaptain extends Captain {
	private ArrayList<NavyBoat> boat = new ArrayList<NavyBoat>();
	
	public NavyCaptain() {
		super.name = "NavyCaptain";
	}
	
	public void addBoat(NavyBoat b) {
		boat.add(b);
	}
	
}
