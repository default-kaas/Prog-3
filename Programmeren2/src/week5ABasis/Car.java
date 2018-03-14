package week5ABasis;

import java.util.ArrayList;

public class Car {
	
	private String ownerName;
	private String carType;
	private String color;
	private ArrayList<String> tickets = new ArrayList();
	
	public void printCarInfo() {
		System.out.println("The name of the owner is "+ ownerName + "" + ", the car type is " + carType + " and the colour of the car is "+ color + ".");
	}
	
	public boolean hasOpenTickets() {
		return true;
	}
	
	public void payTickets() {
		
	}
}
