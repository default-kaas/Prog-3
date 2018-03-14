package Week3B;

public class Average {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12} ;
		int a = 0;
		double b = 0;
		
		while(a <= numbers.length) {
			if(a < numbers.length) {
				b = b + numbers[a];
			}else{
				b = b / numbers.length;
			}
			a++;
		}
		
		System.out.print(b);
	}
}
