package week6A;

public class Person {
	int bodyShape = 0;
	
	public void doPushUps(int times) {
		int amount = 3*times;
		bodyShape = bodyShape + amount;
		System.out.println("Push-ups:");
		
		for(int i=1; i<=amount;i++) {
			System.out.println(i);
		}
	}
	
	public void doSitUps(int times) {
		int amount = 1*times;
		bodyShape = bodyShape + amount;
		System.out.println("Sit-ups:");
		
		for(int i=1; i<=amount;i++) {
			System.out.println(i);
		}
	}
	
	public void doPowerlift(int times) {
		int amount = 3*times;
		bodyShape = bodyShape + amount;
		System.out.println("Power lift:");
		
		for(int i=1; i<=amount;i++) {
			System.out.println(i);
		}
	}
	
	public void doSquads(int times) {
		int amount = 2*times;
		bodyShape = bodyShape + amount;
		System.out.println("Squad:");
		
		for(int i=1; i<=amount;i++) {
			System.out.println(i);
		}
	}
	
	public void admireYourselfInMirror() {
		if(bodyShape < 100) {
			System.out.println("Perhaps you should train some more.");
		}else if(bodyShape >= 100 && bodyShape <= 300) {
			System.out.println(bodyShape);
			System.out.println("Not bad, not bad");
		}else if(bodyShape >= 300 && bodyShape <= 1000) {
			System.out.println("Looking awesome there, buddy");
		}else {
			System.out.println("Oh boy... it's another Arnold!");
		}
	}
}
