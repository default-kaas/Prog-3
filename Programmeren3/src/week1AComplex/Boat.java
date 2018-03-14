package week1AComplex;

public class Boat {
	protected String type = "Boat";
	private String name;
	private String location;
	
	public void introduceYourself() {
		System.out.println("Ahoy! I am an instance of the class "+ type);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
