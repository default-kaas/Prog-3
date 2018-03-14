package week1BSimpel;

public class Main {
	public static void main(String[] args) {
		StringTest stringTest = new StringTest();
		System.out.println(stringTest.addStrings("Test string 1 plus", "Test string 2"));
		System.out.println(stringTest.addStringInt("The value of this number is", 3));
		System.out.println(stringTest.makeStringOfInt(203));
	}
}
