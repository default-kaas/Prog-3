package PROG1_PR5a_SIMPEL;

public class StudentAdmin {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.identify();
		s1.name = "kaas";
		s1.age = 20;
		s1.bAdvies = true;
		s1.gCijfer = 7.3;
		s1.gender = 'h';
		s1.identify();
		s1.haveBirthday();
		s1.identify();
		
	}
}
