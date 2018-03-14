package week4ASimpel;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		int[] numberCollection = { 1, 3, 4, 1, 5, 2, 3, 6, 6, 6, 4, 1, 2, 6, 2, 3, 1, 2, 1, 5, 5, 1, 1, 5, 4 };
		ArrayList<FoundIntNumber> numberOccurences = new ArrayList<FoundIntNumber>();
		int i = 0;

		for (int search : numberCollection) {
			while (i < numberOccurences.size()) {
				if (numberOccurences.get(i).getValue() != numberCollection[search]) {
						FoundIntNumber number = new FoundIntNumber(numberCollection[search]);
						numberOccurences.add(number);
				}else {
					
				}
				i++;
			}
			i=0;
		}
	}
}
