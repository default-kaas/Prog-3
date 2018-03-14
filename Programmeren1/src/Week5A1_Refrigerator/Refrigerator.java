package Week5A1_Refrigerator;

public class Refrigerator {
	FoodItem[] vegetableDrawer = new FoodItem[3];
	FoodItem[] refrigerator = new FoodItem[7];
	public boolean isOn;
	
	public void switchOn() {
		isOn = true;
	}
	
	public void switchOff() {
		if(isOn = true) {
			System.out.println("The refrigerator is turned off");
		}
		isOn = false;
	}
	
	public void addToVegetableDrawer(FoodItem foodItem) {
		int a = 0;
		if(foodItem.typeOfFood.equals("vegetable")) {
			while (a < vegetableDrawer.length) {
				if (vegetableDrawer[a] == null) {
					vegetableDrawer[a] = foodItem;
					return;
				}
				a++;
			}
			
		}else {
			System.out.println("In vegetableDrawer mogen alleen vegetable's");
		}
		
		if(vegetableDrawer[vegetableDrawer.length-1] != null ){
			System.out.println("De vegetableDrawer is vol");
		}
	}
	
/// Maak nog dat een refrigertorSpace maar maximaal 17 refrigeratorspace kan hebben.
}
