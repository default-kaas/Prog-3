package week2BBrons;

public abstract class Airplane {
	protected int xPos;
	protected int yPos;
	protected int zPos;
	
	public Airplane(int xPos, int yPos, int zPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.zPos = zPos;
	}
	
	public void takeOff() {
		System.out.println("\n"+"Woooosh!");
	}
	
}
