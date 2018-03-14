package week3BSimpel;

import java.util.Random;

public class LifeGuard {
	private String name;
	private boolean swimmingDiploma;

	public LifeGuard() {
		Random random = new Random();
		int n = random.nextInt(2);
		if (n == 1) {
			swimmingDiploma = true;
		} else {
			swimmingDiploma = false;
		}
	}

	public String getName() {
		return name;
	}

	public boolean isSwimmingDiploma() {
		return swimmingDiploma;
	}

}
