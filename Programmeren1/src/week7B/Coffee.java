package week7B;

public class Coffee {
	String name;
	int size;
	
	public Coffee(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSize() {
		String sizeName;
		if(size == 1) {
			sizeName = "klein";
		}else if(size == 2) {
			sizeName = "middel";
		}else {
			sizeName = "groot";
		}
		
		return sizeName;
	}
	public void setSize(int size) {
		this.size = size;
	}
}

