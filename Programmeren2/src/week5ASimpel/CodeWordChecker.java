package week5ASimpel;

import java.util.HashMap;

public class CodeWordChecker {
	private HashMap<String,String> words = new HashMap<>();
	
	public void addWord(String codeWord, String respons) {
		if(words.containsKey(codeWord)==true) {
			System.out.println("An existing code word is being overwritten.");
		}
		words.put(codeWord, respons);
	}
	
	public void showRespons(String codeWord) {
		if(words.containsKey(codeWord)==true) {
			System.out.println(words.get(codeWord));
		}else {
			System.out.println("This code word does not exist.");
		}
	}
	
	public void removeCodePair(String codeWord) {
		if(words.containsKey(codeWord)==true) {
			System.out.println("This code word is being removed "+words.get(codeWord)+ ".");
			words.remove(codeWord);
			
		}else {
			System.out.println("This codeword does not exist.");
		}
	}
	
}
