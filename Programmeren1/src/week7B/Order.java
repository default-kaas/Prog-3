package week7B;

public class Order {
	int tableNumber;
	Coffee[] coffeeArray;
	Cake[] cakeArray;
	
	public Order(int newTableNumber) {
		setTableNumber(newTableNumber);
		coffeeArray = new Coffee[10];
		cakeArray = new Cake[10];
	}
	
	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber){
		if (tableNumber > 0)
		{
			this.tableNumber = tableNumber;
		} else
		{
			System.out.println("Table number must be greater than 0");
		}
	}
	
	public void addCake(Cake newCake) {
		int a = 0;
		while(a<cakeArray.length) {
			if(cakeArray[a] == null) {
				cakeArray[a] = newCake;
				break;
			}
			a++;
		}
	}
	
	public void addCoffee(Coffee newCoffee) {
		int a = 0;
		while(a<coffeeArray.length) {
			if(coffeeArray[a] == null) {
				coffeeArray[a] = newCoffee;
				break;
			}
			a++;
		}
	}
	
	public void listSugarFreeCake() {
		int a = 0;
		while(a<cakeArray.length) {
			if(cakeArray[a].getSugarFree().equals("suikervrij")) {
				System.out.println(cakeArray[a].getName() + " " + cakeArray[a].getSugarFree());
			}
			a++;
		}
	}
	
	public void showOrder() {
		System.out.println("Tafelnummer: " + getTableNumber());
		int total = 0;
		int a = 0;
		while(a<coffeeArray.length) {
			if(coffeeArray[a] == null) {
				break;
			}else {
				System.out.println(coffeeArray[a].getName()+" - "+coffeeArray[a].getSize());
				total = total+1;
			}
			a++;
		}
		
		System.out.println("\n"+"Total: " + total + "\n");
		
		total = 0;
		a = 0;
		while(a<cakeArray.length) {
			if(cakeArray[a] == null) {
				break;
			}else {
				System.out.println(cakeArray[a].getName()+" "+cakeArray[a].getSugarFree());
				total = total+1;
			}
			a++;
		}
		
		System.out.println("\n"+"Total: " + total);
	}
		
}
