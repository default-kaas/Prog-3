package week2BBrons;

public class TransportPlane extends Airplane implements Trackable {
	
	/*De reden waarom er een foutmelding komt is ,omdat abstract methodes bedoel
	 * zijn voor een controleu fucntie*/
	/*public abstract void unload();*/
	
	private int passenger;
	
	public TransportPlane(int xPos, int yPos, int zPos) {
		super(xPos, yPos,zPos);
		this.passenger = 2;
	}
	
	public void board(int amount) {
		passenger = passenger + amount;
	}
	
	public void showPassengersAmount() {
		System.out.println("The amount of passengers aboard of this transportplane is "+passenger);
	}
	
	public void showInfoOnRadar() {
		System.out.println("x: "+ xPos+", y: "+ yPos +", altitude: "+ zPos);
	}
	
}
