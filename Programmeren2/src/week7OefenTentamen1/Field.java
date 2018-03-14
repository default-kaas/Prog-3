package week7OefenTentamen1;

import java.util.HashMap;

public class Field {
	private int countShipsSunk;
	private HashMap<String,Square> field = new HashMap();
	
	public void print(){
		for(int a=10; a>=0;a--) {
			
			System.out.print(a);
			for(int b=10; b>0;b--) {
				squareNameSwitchs(b,a);
			}
		
			System.out.print('\n');
		}
	}
	
	public String squareNameSwitchs(int squareLetter, int rowNumber) {
		String fieldName = "";
		
		switch(squareLetter) {
		case 10:
			fieldName = "A" + rowNumber;
			break;
		case 9:
			fieldName = "B" + rowNumber;
			break;
		case 8:
			fieldName = "C" + rowNumber;
			break;
		case 7:
			fieldName = "D" + rowNumber;
			break;
		case 6:
			fieldName = "E" + rowNumber;
			break;
		case 5:
			fieldName = "F" + rowNumber;
			break;
		case 4:
			fieldName = "G" + rowNumber;
			break;
		case 3:
			fieldName = "H" + rowNumber;
			break;
		case 2:
			fieldName = "I" + rowNumber;
			break;
		case 1:
			fieldName = "J" + rowNumber;
			break;
		}
		
		return fieldName;
	}
	
	public void fire(String atPosition){
		
	}
	
	public void areAllShipsSunk(){
		
	}
}
