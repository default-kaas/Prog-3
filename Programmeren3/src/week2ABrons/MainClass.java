package week2ABrons;

public class MainClass {
	public static void main(String[] args) {
		Airport schiphol = new Airport();
		CargoPlane flowers = new CargoPlane();
		/*
		schiphol.addPlane(flowers);
		
		CargoPlane cp;
		
		cp = (CargoPlane)schiphol.getPlane(0);
		
		cp.showCargo();
		*/
		/*Ja dit resulaat was wat ik had verwacht alleen was ik vergeten dat je in de main methode 
		 * Variable kon aan maken.*/
		CargoPlane sun = new CargoPlane();
		TransportPlane cryingBaby = new TransportPlane();
		TransportPlane fatPerson = new TransportPlane();
		
		schiphol.addPlane(flowers);
		schiphol.addPlane(cryingBaby);
		schiphol.addPlane(sun);
		schiphol.addPlane(fatPerson);
		
		schiphol.showAllContents();
	}

}
