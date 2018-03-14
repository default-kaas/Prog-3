package week1BSimpel;

public class Chiwawa extends Dog{
	
	@Override 
	public void bark() {
		System.out.println("...");
	}
	
	@Override 
	protected void walk() {
		System.out.println("Walking "+ getName() + " the dog!");
	}
}
