package Week7ABasis;

public class WheeledTransport {
	String type;
	String color;
	Wheel[] wheels;
	
	public WheeledTransport(String type, String color){
		this.color = color;
		
		int a = 0;
		int amountOfWheels;
		Wheel w = new Wheel(0);
		
		if(type.equals("car")) {
			this.type = type;
			amountOfWheels = 4;
			wheels = new Wheel[amountOfWheels];
			w.setSize(5);
				while(a<wheels.length) {
					wheels[a]=w;
					a++;
				}
			
		}else if(type.equals("scooter")) {
			this.type = type;
			amountOfWheels = 2;
			wheels = new Wheel[amountOfWheels];
			w.setSize(2);
			while(a<wheels.length) {
				wheels[a]=w;
				a++;
			}
			
		}else if(type.equals("truck")) {
			this.type = type;
			amountOfWheels = 6;
			wheels = new Wheel[amountOfWheels];
			w.setSize(10);
			while(a<wheels.length) {
				wheels[a]=w;
				a++;
			}	
		}else {
			this.type = "none";
			System.out.println("This type vehicle of  does not exist");
		}
	
		System.out.println("We made a " + this.color + " " + this.type + ".");
	}
	
	public void getAmountOfWheels() {
		 System.out.println("Amount of wheels on "+ this.type+ ": " + wheels.length);
	}
	
	public void getWheelSizeFromVehicle() {
		int a = 0;
		int wheelSize = 0;
		while(a < wheels.length) {
			if(wheels[a] != null) {
				wheelSize = wheels[a].getSize();
				break;
			}
			a++;
		}
		
		System.out.println("Wheelsize of "+ this.type+ ": " +wheelSize);
	}
	
	public void countTotalWheelSize() {
		int a = 0;
		int total = 0;
		while(a < wheels.length) {
			total = total + wheels[a].getSize();
			a++;
		}
		System.out.println("Total size of the wheels of "+ this.type+ ": " +total);
	}
	
}
