package week1AComplex;

public class Attack {
	
	public void shoot(Boat b, Boat b2) {
		boolean result = insight(b,b2);
		boolean ammo;
		
		if(result == true) {
			if(b instanceof NavyBoat) {
				NavyBoat nb = (NavyBoat)b;
				ammo = hasAmmontion(nb);
			}else if(b2 instanceof NavyBoat) {
				NavyBoat nb = (NavyBoat)b2;
				ammo = hasAmmontion(nb);
			}else{
				System.out.println("None of the ships is a submarine or a destroyer");
			}
		}else {
			System.out.println("The ships are not in the same location");
		}
	}
	
	public boolean insight(Boat b,Boat b2) {
		if(b.getLocation().equals(b2.getLocation())) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean hasAmmontion(NavyBoat b) {
		if(b.getAmmunition()>0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
