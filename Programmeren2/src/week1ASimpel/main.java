package week1ASimpel;

public class main {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		
		p1.setAge(20);
		p2.setAge(33);
		p3.setAge(17);
		p4.setAge(40);
		
		p1.setName("Jan");
		p2.setName("Koos");
		p3.setName("Peter");
		p4.setName("Emma");
		
		p1.setGender(0);
		p2.setGender(1);
		p3.setGender(0);
		p4.setGender(1);
		
		GroupOfPeople g = new GroupOfPeople();
		
		g.addPerson(p1);
		g.addPerson(p2);
		g.addPerson(p3);
		g.addPerson(p4);
		
		g.findOldest();
		/*Does not find Peter the youngest while his age is lower then Jans age. */
		g.findYoungest();
		g.findMen();
		g.findWomen();
	}
}
