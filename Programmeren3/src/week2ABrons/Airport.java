package week2ABrons;

import java.util.ArrayList;

public class Airport {
	ArrayList<Airplane> airplanes;
	
	public Airport() {
		this.airplanes = new ArrayList<Airplane>();
	}
	
	public void addPlane(Airplane ap) {
		airplanes.add(ap);
	}
	
	public Airplane getPlane(int index) {
		return airplanes.get(index);
	}
	
	
	public void showAllContents() {
		int i =0;
		for(Airplane a: airplanes) {
			if(a instanceof TransportPlane) {
				TransportPlane tp = (TransportPlane)airplanes.get(i);
				tp.showPassengersAmount();
			}else if(a instanceof CargoPlane) {
				CargoPlane cp = (CargoPlane)airplanes.get(i);
				cp.showCargo();
			}
			i++;
		}
	}
	
	
}
