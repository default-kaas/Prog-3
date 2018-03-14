package Week3B;

public class Verstoppertje {

	public static void main(String[] args) {
		for(int a = 0; a <=11; a++) {
			if(a<1) {
				System.out.println("I'm it!");
			}else if(a == 10) {
				System.out.println(a);
			}else if(a == 11) {
				System.out.println("Come out, come out, where ever you are!");
			}else {
				System.out.print(a+",");
			}
		}
	}
	
}
