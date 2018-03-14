package week4A;

public class Main {
	

	public static void main(String[] args) {
		int x = 0;
		
		 CoffeeMachine senseo;
		 senseo = new CoffeeMachine(20);
		 
		 CoffeeMachine kaas = new CoffeeMachine(1);
		 
		 /*
		 for(int a=0; a<11; a++) {
			 if(0 < kaas.showAmountOfCoffee()) {
				 kaas.makeCoffee();
			 }else {
				 kaas.makeCoffee();
			 }
			 
			 kaas.makeHotChocolate();
		 } */
		 
		 while(0 < kaas.showAmountOfCoffee()) {
			 kaas.makeCoffee();
		 }
		 
		 
	}
	
	
	
	
}
