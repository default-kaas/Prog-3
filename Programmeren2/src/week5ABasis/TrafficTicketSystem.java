package week5ABasis;

import java.util.HashMap;

public class TrafficTicketSystem {
	private HashMap<String,String> carTickets = new HashMap();
	
	public void addTicket(String numberPlate, String description) {
		if(carTickets.containsKey(numberPlate)==true) {
			description +=", " + carTickets.get(numberPlate);
			carTickets.put(numberPlate, description);
		}else {
			carTickets.put(numberPlate, description);
		}	
	}
	
	public void showTicket(String numberPlate){
		if(carTickets.containsKey(numberPlate)==true) {
			System.out.println(carTickets.get(numberPlate));
		}else{
			System.out.println("This car has no tickets");
		}
	}
	
	public void payTickets(String numberPlate){
		carTickets.remove(numberPlate);
	}
	
	public void showAllTickets() {
		for (String ticket : carTickets.values()) {
			System.out.println(ticket);
		}
	}
}
