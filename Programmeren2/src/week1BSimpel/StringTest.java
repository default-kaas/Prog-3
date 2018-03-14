package week1BSimpel;

public class StringTest {
	private String text;
	private int number;
	
	public String addStrings(String string1, String string2) {
		String together = string1 + " " + string2;
		return together;
	}
	
	public String addStringInt(String string1, int int1) {
		String string2 = Integer.toString(int1);
		String together = string1 + " " + string2;
		return together;
	}
	
	public String makeStringOfInt(int int1) {
		String string1 = Integer.toString(int1);
		return string1;
	}
}
