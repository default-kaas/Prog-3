package week1AComplex;

public class NavyBoat extends Boat {
	private int ammunition;
	
	public NavyBoat() {
		super.type = "NavyBoat";
	}

	public int getAmmunition() {
		return ammunition;
	}

	public void setAmmunition(int ammunition) {
		this.ammunition = ammunition;
	}
	
}
