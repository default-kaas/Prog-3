package week3BSimpel;

import java.util.ArrayList;

public class LifeGuardStation {
	ArrayList<LifeGuard> lifeGuards = new ArrayList<LifeGuard>();

	public void addGuard(LifeGuard lg) {
		lifeGuards.add(lg);
	}

	public void lifeGuardsInformation() {
		int amount = 0;
		int total = 0;
		for (LifeGuard lg : lifeGuards) {
			System.out.println(lg.getName() + lg.isSwimmingDiploma());
			if (lg.isSwimmingDiploma() == false) {
				amount++;
			}
			total++;
		}
		if ((total / 2) < amount) {
			System.out.println("Het stand is gesloten.");
		}
	}

}
