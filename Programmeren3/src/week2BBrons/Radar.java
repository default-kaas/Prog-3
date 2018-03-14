package week2BBrons;

import java.util.ArrayList;

public class Radar {
	ArrayList<Trackable> trackables;

	public Radar() {
		trackables = new ArrayList<Trackable>();
	}

	public void addTrackable(Trackable t) {
		trackables.add(t);
	}
	
	public void showTrackables() {
		for(Trackable t: trackables) {
			t.showInfoOnRadar();
		}
	}
	
}
