package week2ABrons;

public class TransportPlane extends Airplane {
	
	/*De reden waarom er een foutmelding komt is ,omdat abstract methodes bedoel
	 * zijn voor een controleu fucntie*/
	/*public abstract void unload();*/
	
	private int passenger;
	
	public TransportPlane() {
		this.passenger = 2;
	}
	
	public void board(int amount) {
		passenger = passenger + amount;
	}
	
	public void showPassengersAmount() {
		System.out.println("The amount of passengers aboard of this transportplane is "+passenger);
	}
	
	
}
