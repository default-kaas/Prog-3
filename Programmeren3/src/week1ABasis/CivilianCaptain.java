package week1ABasis;

import java.util.ArrayList;

public class CivilianCaptain extends Captain {
	private ArrayList<SailBoat> boat = new ArrayList<SailBoat>();
	
	public CivilianCaptain() {
		super.name = "CivilianCaptain";
	}
	
	public void addBoat(SailBoat b) {
		boat.add(b);
	}
	
	
	
}
