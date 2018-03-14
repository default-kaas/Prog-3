package week2ABrons;

public abstract class Airplane {
	/*De reden waarom je wel een contructor kan maken in een abstracte klasse
	* is, omdat een abstract klasse meer een controlerende functie heeft. 
	* Waardoor als je wilt dat bepaalde variablen worden meegeven in een contructor
	* in alle klasses die er van over erfen is dit de manier om het opzetten.*/	
	
	public Airplane() {
			
	}
	
	/*Ongeveer het zelfde als bij de contructor maar dan is het de bedoeling dat als
	 * een bepaalde method altijd aanwezige is bij alle sub klasse op de correcte manier*/
	public void takeOff() {
		System.out.println("Woooosh!");
	}
	
}
