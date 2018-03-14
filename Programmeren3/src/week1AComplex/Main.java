package week1AComplex;

public class Main {
	public static void main(String[] args) {
		
		Captain c = new Captain();
		CivilianCaptain cc = new CivilianCaptain();
		NavyCaptain nc = new NavyCaptain();
		
		c.introduceYourself();
		cc.introduceYourself();
		nc.introduceYourself();
		
		Boat b = new Boat();
		SailBoat sb = new SailBoat();
		NavyBoat nb = new NavyBoat();
		Submarine s = new Submarine();
		Destroyer d = new Destroyer();
		
		b.introduceYourself();
		sb.introduceYourself();
		nb.introduceYourself();
		s.introduceYourself();
		d.introduceYourself();
	}
}
