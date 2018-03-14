package week2ABrons;

public class CargoPlane extends Airplane{
	private String cargo;
	
	public CargoPlane() {
		cargo = "Kaas";
	}
	
	public void loadUp(String cargo) {
		this.cargo = cargo;
	}
	
	public void showCargo() {
		System.out.println("The cargo of this cargoplane is "+cargo);
	}
}
