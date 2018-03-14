package week5ASimpel;

public class main {
	public static void main(String[] args) {
		
		CodeWordChecker cwc = new CodeWordChecker();
		
		cwc.addWord("panda","potato");
		cwc.addWord("pencil","earwax");
		cwc.addWord("java","maniac");
		cwc.addWord("student","superman");
		cwc.addWord("rice","guitar");
		cwc.addWord("humbug","bazinga");
		
		// If all is well, the next statement should give a warning
		cwc.addWord("java","bazinga");
		
		cwc.showRespons("java");
		cwc.showRespons("pencil");
		cwc.showRespons("Java"); // Let op hoofdletter!
		
		cwc.removeCodePair("panda");
	}
}
