package week4ASimpel;

public class FoundIntNumber {
	private int value;
	private int nrCounted;
	
	FoundIntNumber(int newValue){
		this.value = newValue;
	}
	
	public int getValue() {
		return value;
	}
	
	public int getNrCounted() {
		return nrCounted;
	}
	
	public void increaseNrCounted() {
		nrCounted ++;
	}
	
}
