package javatalk;

public class Regex2 {
	
	public void getAnswer() {
		
		/*
		 1)Replace all vowels with ***
		 2)Remove all vowels
		 3)Return the number of vowels present
		 4)Remove all non-alphanumberic characters (EXCEPT space characters)
		 */
		
		String str = "Time to practice Regex";
		
		String regex = "(?i)[aeiou]";
		
		System.out.println(str.replaceAll("[aeiou]","***")); // T***m*** t*** pr***ct***c*** R***g***x
		
		System.out.println(str.replaceAll(regex, "")); // Tm t prctc Rgx
		
		System.out.println(str.replaceAll("[^aeiouAEIOU]", "").length()); // 8
		
		
		String str2 = "Remove all NON %%%%%%@@@####alpha----!!!!numeric values$$$$";
		
		System.out.println(str2.replaceAll("[^a-zA-Z0-9 ]", "")); // Remove all NON alphanumeric values

		
	
	}

}
