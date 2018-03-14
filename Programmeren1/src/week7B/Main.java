package week7B;

public class Main {
	public static void main(String[] args) {
		Order bestelling = new Order(10);
		
		Coffee coffee1 = new Coffee("Cappuccino",2);
		Coffee coffee2 = new Coffee("Koffie Verkeerd",1);
		Coffee coffee3 = new Coffee("Espersso",3);
		bestelling.addCoffee(coffee1);
		bestelling.addCoffee(coffee2);
		bestelling.addCoffee(coffee3);
		
		Cake cake1 = new Cake("Moorkop","");
		Cake cake2 = new Cake("Appeltaart","suikervrij");
		Cake cake3 = new Cake("Appeltaart","");
		bestelling.addCake(cake1);
		bestelling.addCake(cake2);
		bestelling.addCake(cake3);
		
		System.out.println(bestelling.listSugarFreeCake());
		System.out.println("");
		
		bestelling.showOrder();
		
	}
	
	
}
