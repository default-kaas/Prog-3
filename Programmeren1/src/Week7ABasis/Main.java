package Week7ABasis;

public class Main {
	public static void main(String[] args) {
		WheeledTransport auto = new WheeledTransport("car","red");
		auto.getAmountOfWheels();
		auto.getWheelSizeFromVehicle();
		auto.countTotalWheelSize();
		
		WheeledTransport scooter = new WheeledTransport("scooter","blue");
		scooter.getAmountOfWheels();
		scooter.getWheelSizeFromVehicle();
		scooter.countTotalWheelSize();
		
		WheeledTransport vrachtwagen = new WheeledTransport("truck","green");
		vrachtwagen.getAmountOfWheels();
		vrachtwagen.getWheelSizeFromVehicle();
		vrachtwagen.countTotalWheelSize();
		
		WheeledTransport none = new WheeledTransport("kaas","yellow");
		none.getAmountOfWheels();
		none.getWheelSizeFromVehicle();
		none.countTotalWheelSize();
	}
}
