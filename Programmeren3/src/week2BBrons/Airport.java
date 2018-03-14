package week2BBrons;

import java.util.ArrayList;

public class Airport {
	private ArrayList<Airplane> airplanes;
	private Radar r;
	
	public Airport() {
		this.airplanes = new ArrayList<Airplane>();
		this.r = new Radar();
	}
	
	public void addPlane(Airplane ap) {
		airplanes.add(ap);
		if(ap instanceof Trackable) {
			r.addTrackable((Trackable)ap);
		}
		/*if(ap instanceof CargoPlane ) {
			CargoPlane cp = (CargoPlane)ap;
			if(cp instanceof Trackable) {
				r.addTrackable(cp);
			}
		}else if(ap instanceof TransportPlane){
			TransportPlane tp = (TransportPlane) ap;
			if(tp instanceof Trackable) {
				r.addTrackable(tp);
			}
		}*/
	}
	
	public Airplane getPlane(int index) {
		return airplanes.get(index);
	}
	
	
	public void showAllContents() {
		r.showTrackables();
		int i =0;
		for(Airplane a: airplanes) {
			if(a instanceof TransportPlane) {
				TransportPlane tp = (TransportPlane)airplanes.get(i);
				tp.showPassengersAmount();
			}else if(a instanceof CargoPlane) {
				CargoPlane cp = (CargoPlane)airplanes.get(i);
				cp.showCargo();
			}else if(a instanceof StealthPlane) {
				StealthPlane sp = (StealthPlane)airplanes.get(i);
				sp.takeOff();
			}
			i++;
		}
	}
	
	
	
	
}
