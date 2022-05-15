package javatalk;


import java.util.LinkedHashSet;
import java.util.Set;

public class Challenge24 {
	// Write a Java program to print after removing duplicates from a given string
	
	//The given string is: w3resource
	//After removing duplicates characters the new string is: w3resouc

	
	public void removeDuplicates() {
		String inputString = "coolstring";
		
		// using LinkedHashSet 
		Set<String> inputStringSet = new LinkedHashSet<>();
		inputStringSet.add(inputString);
//		System.out.println(inputStringSet); // [coolstring]
		char[] charArray = inputString.toCharArray();
//		System.out.println(charArray); //coolstring
	
		Set<Character> charHashSet = new LinkedHashSet<>();
		for(char singleChar: charArray) {
			charHashSet.add(singleChar);
		}
		System.out.println(charHashSet.toString()); // [c, o, l, s, t, r, i, n, g]
		
		// for loop method
		String inputString2 = "betterstring";
		String finalString = "";
		
		for(int i=0; i<inputString2.length(); i++) {
			String temp = inputString2.charAt(i)+"";
			if(!(finalString.contains(temp))) {
				finalString+=temp;
				
			}
			
			
		}
	
		System.out.println(finalString);

		
	}
}
