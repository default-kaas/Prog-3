package PROG1_PR5a_SIMPEL;

public class Student {
	public String name;
	public int age;
	public boolean bAdvies;
	public char gender ;
	public double gCijfer;
	
	
	public void identify(){
		if(gender == 'v') {
			System.out.println(name +" "+ age +" "+ bAdvies + " Geslacht: vrouw " + gCijfer);
		}else if(gender == 'h') {
			System.out.println(name +" "+ age +" "+ bAdvies + " Geslacht: man " + gCijfer);
		}else {
			System.out.println(name +" "+ age +" "+ bAdvies + " Geslacht niet bekent " + gCijfer);
		}
	}
	
	public void haveBirthday() {
		if(age>= 120) {
			
		}else {
			age++;
		}
	}
	
}
