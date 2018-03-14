package week1ASimpel;

public class Convertible {
	private int key;
	public int speed = 155;
	public int weight = 1600;
	public String engine = "3.2 L S54 inline-6";
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public String toString() {
		return speed + " " + weight + " " + engine;
	}
	
}
