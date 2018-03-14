package test;

import java.util.HashMap;

public class TestMethodes {
HashMap<Integer, String> squares = new HashMap<Integer, String>();

public String squarSymbol(int number) {
	if(number == 0) {
		return "X";
	}else if(number == 1) {
		return "O";
	}else {
		return ".";
	}
}

public void startOptions(int number) {
	if(number == 0) {
		for(int a1=1;a1<11;a1++) {
			if((a1 % 2)==0&& a1!= 10) {
				squares.put(a1, squarSymbol(0));
			}else if(a1==10) {
				squares.put(a1, squarSymbol(2));
				squares.put(11, squarSymbol(0));
			}else {
				squares.put(a1, squarSymbol(1));
			}
		}
		for(int a2=12;a2<31;a2++){
			squares.put(a2, squarSymbol(2));
		}
	}else if(number == 1) {
		for(int b1=1;b1<31;b1++) {
			switch(b1) {
			case 1: case 8: case 16: case 23:
				squares.put(b1, squarSymbol(0));
				break;
			case 2: case 4: case 6: case 10:
			case 12: case 14: case 17: case 18: case 20:
			case 21: case 24: case 25: case 26:
				squares.put(b1, squarSymbol(1));
				break;
			default:
				squares.put(b1, squarSymbol(2));
				break;
			}
		}
	}else if(number == 2) {
		for(int c1=1;c1<31;c1++) {
			switch(c1) {
			case 28:
				squares.put(c1, squarSymbol(0));
				break;
			case 22: case 23: case 24:
				squares.put(c1, squarSymbol(1));
				break;
			default:
				squares.put(c1, squarSymbol(2));
				break;
			}
		}
	}else if(number == 3) {
		for(int d1=1;d1<31;d1++) {
			switch(d1) {
			case 13: case 25: case 26: case 28: case 29:
				squares.put(d1, squarSymbol(0));
				break;
			case 6: case 18: case 22:
				squares.put(d1, squarSymbol(1));
				break;
			default:
				squares.put(d1, squarSymbol(2));
				break;
			}
		}
	}else {
		System.out.println("This option is not available");
	}
}

public void print() {	
	System.out.println("+----------+");
	for(int a1=0; a1<12; a1++){
		if(a1==0||a1==11) {
			System.out.print("|");
		}else{
			System.out.print(squares.get(a1));
		}
	}
	System.out.println();
	for(int b1=21; b1>9; b1--){
		if(b1==21||b1==10) {
			System.out.print("|");
		}else{
			System.out.print(squares.get(b1));
		}
	}
	System.out.println();
	for(int c1=20; c1<32; c1++){
		if(c1==20||c1==31) {
			System.out.print("|");
		}else{
			System.out.print(squares.get(c1));
		}
	}
	System.out.println();
	System.out.println("+----------+");
}	
	
}
