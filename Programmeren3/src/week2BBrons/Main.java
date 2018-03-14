package week2BBrons;

public class Main {
	public static void main(String[] args) {
		Airport LAA = new Airport();
		TransportPlane meeuw = new TransportPlane(10,10,1000);
		CargoPlane eend = new CargoPlane(20,20,2000);
		StealthPlane blackBird = new StealthPlane(30,30,3000);
		
		
		LAA.addPlane(meeuw);
		LAA.addPlane(eend);
		LAA.addPlane(blackBird);
		
		LAA.showAllContents();
	}
}
