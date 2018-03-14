package week4A;

	public class CoffeeMachine {
		
		int amountOfCoffee = 10;
		 int amountOfChocolate = 10;
		 
		 public CoffeeMachine( int coffee ) {
			 this.amountOfCoffee = coffee;
		 }
		 
		 public int showAmountOfCoffee() {
			 return amountOfCoffee;
		 }
		 
		 void makeCoffee(){
			 
			 if(amountOfCoffee<1) {
				 System.out.println("There is no more coffee");
			 }else {
				 System.out.println("Here you have a cup of coffee");
				 amountOfCoffee = amountOfCoffee - 1;
			 }
		
			
		 	}
		 
		 
		 void makeHotChocolate(){
			 
			 if(amountOfChocolate<1) {
				 System.out.println("There is no more hot chocolate");
			 }else {
				 System.out.println("Here you have a cup of hot chocolate");
				 amountOfChocolate = amountOfChocolate - 1;
			 }
		 
		 }
		 
		 
		 
		 void restock(){
		 amountOfCoffee = 10;
		 amountOfChocolate = 10;
		 }
		
	}
