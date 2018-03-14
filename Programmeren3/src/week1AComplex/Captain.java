package week1AComplex;

import java.util.ArrayList;

public class Captain {
	protected String title;
	private Boat boat;
	private String name;
	
	public Captain() {
		this.title = "Captain";
	}
	
	public void introduceYourself() {
		System.out.println("Ahoy! I am an instance of the class "+ title);
	}
	
	public void addBoat(Boat b) {
		boat = b;
	}
	
	public void addBoat(CivilianCaptain cc,Boat b) {
		if(b instanceof SailBoat) {
			boat = b;
		}else {
			
		}
	}
	
	public void addBoat(NavyCaptain nc, Boat b) {
		if(b instanceof Submarine || b instanceof Destroyer) {
			boat = b;
		}else {
			
		}
	}
	
	public Boat getBoat() {
		return boat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
