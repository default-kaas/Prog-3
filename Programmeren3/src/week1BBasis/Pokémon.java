package week1BBasis;

public class Pokémon {
	protected String name;
	protected String mainAttack;
	protected String secAttack;
	protected String mainType;
	protected String sound;
	
	protected void speak() {
		System.out.println(sound);
	}
	
	protected void doMainAttack() {
		System.out.println(mainAttack + " primary attack");
	}
	
	protected void doSecAttack() {
		System.out.println(secAttack + " secondairy attack");
	}
	
	protected void showData() {
		System.out.println(
				"name: "+ name + "\n" +
				"mainAttack: " + mainAttack + "\n" +
				"secAttack: " + secAttack + "\n" +
				"mainType: " + mainType + "\n" +
				"sound: " + sound
				);
	}
}
