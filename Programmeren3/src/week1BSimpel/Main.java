package week1BSimpel;

public class Main {
	public static void main(String[] args) {
		Dog d = new Dog();
		Chiwawa c = new Chiwawa();
		Poodle p = new Poodle();
		Retreever r = new Retreever();
		
		c.setName("Rat");
		p.setName("Dogo");
		r.setName("Snuf");
		
		d.walk();
		c.walk();
		p.walk();
		r.walk();
		
		d.bark();
		c.bark();
		p.bark();
		r.bark();
	}
}
