package week7B;

public class Cake {
	String name;
	String sugarFree;
	
	public Cake(String name, String sugarFree) {
		this.name = name;
		if(sugarFree.equals("suikervrij")) {
			this.sugarFree = "suikervrij";
		}else {
			this.sugarFree = "";
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSugarFree() {
		return sugarFree;
	}
	public void setSugarFree(String sugarFree) {
		this.sugarFree = sugarFree;
	}
	
	
}
