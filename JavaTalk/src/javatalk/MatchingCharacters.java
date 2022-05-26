package javatalk;

public class MatchingCharacters {

	public void findMatchingCharacters() {

		// Write a Java program to print list items containing all characters of a given word.
		// Solve it in O(n^2) time complexity
		// no imports- only Array methods
		// Practice ternary

		String word = "bib";
		String str1 = "rabbit";
		String str2 = "bribe";
		String str3 = "dog";

		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;

		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;

		char[] wordChar = word.toCharArray();
		char[] str1Char = str1.toCharArray();
		char[] str2Char = str2.toCharArray();
		char[] str3Char = str3.toCharArray();

		char char1 = wordChar[counter1];
		char char2 = wordChar[counter2];
		char char3 = wordChar[counter3];

		for (int i = 0; i < str1Char.length; i++) {

			for (int j = 0; j < wordChar.length; j++) {

				if (str1Char[i] == wordChar[j]) {
					counter1++;
				}

			}
			if (char1 == wordChar[wordChar.length - 1] && counter1 != 0) {
				flag1 = true;
			}
		}
		
		// check the second word

		for (int i = 0; i < str2Char.length; i++) {
			for (int j = 0; j < wordChar.length; j++) {
				if (str2Char[i] == wordChar[j]) {
					counter2++;
				}
			}

			if (char2 == wordChar[wordChar.length - 1] && counter2 != 0) {
				flag2 = true;
			}
		}
		
		// check the third word

		for (int i = 0; i < str3Char.length; i++) {
			for (int j = 0; j < wordChar.length; j++) {
				if (str3Char[i] == wordChar[j]) {
					counter3++;
				}
			}
			
//			System.out.println(counter3);
			if (char3 == wordChar[wordChar.length - 1] && counter3 != 0) {
				flag3 = true;
			}
		}

		// finish it up with a terribly confusing ternary statement
		boolean finalResult = flag1 ? (flag2 ? (flag3 ? true : false) : false) : false;

		// print out the match result based on flag values
		String result1 = flag1 ? "First word is a match" : "First word is NOT a match";
		String result2 = flag2 ? "Second word is a match" : "Second word is NOT a match";
		String result3 = flag3 ? "Thid word is a match" : "Third word is NOT a match";
		String overallResult = finalResult ? "All in all, everything matched" : "Overall, NOT all words matched!";

		System.out.println(result1 + "\n" + result2 + "\n" + result3 + "\n" + overallResult);

	}

}
