package week3ABrons;

import java.util.ArrayList;

public class Flat {
	/*Je kan final classes niet extended, omdat niks uit deze klasse kan worden overwritten*/
	private static final int amount = 10;
	private Apartment apartments[] = new Apartment[5]; 
	
	public Flat() {
		
	}
	
	public void addaApartment(int amount) {
		/*Je kan een final method niet overwritten omdat deze door het keywoord final absoluut is 
		 * en je geeft hier mee aan dat het niet meer wordt aangepast aan de java compiler*/
	}
	
}
