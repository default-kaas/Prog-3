package week2BBrons;

public class CargoPlane extends Airplane implements Trackable{
	private String cargo;
	
	public CargoPlane(int xPos, int yPos, int zPos) {
		super(xPos, yPos,zPos);
		cargo = "Kaas";
	}
	
	public void loadUp(String cargo) {
		this.cargo = cargo;
	}
	
	public void showCargo() {
		System.out.print("The cargo of this cargoplane is "+cargo);
	}
	
	public void showInfoOnRadar() {
		System.out.println("x: "+ xPos+", y: "+ yPos +", altitude: "+ zPos);
	}
}
