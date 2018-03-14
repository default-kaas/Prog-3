package week1BSimpel;

public class Dog {
	private String name = "";
	
	protected String getName() {
		return name;
	}
	
	protected void setName(String name) {
		this.name = name;
	}

	protected void bark() {
		System.out.println("Wroof!");
	}
	
	protected void walk() {
		System.out.println("Walking "+ name + " the dog!");
	}
	
}
