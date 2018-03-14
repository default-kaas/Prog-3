package Week3B;

public class Avangers {

	public static void main(String[] args) {
		String[] adjectives = {"Incredible","Mighty","Black","Iron","Hawk" };
		String[] names = {" Hulk", " Thor", " Widow"," Man","eye" };
		int a = -1;
		
		while(a < adjectives.length) {
			if(a<0) {
				System.out.println("Assemble the Avengers!");
			}else if(a == 4) {
				System.out.println(" "+ adjectives[a]+ names[a]);
			}else{
				System.out.println(" "+ adjectives[a]+ " " + names[a]);
			}
			
			a++;
		}
		
		
	}
	
}
