package javatalk;

public class Challenge10 {
	
	// Write a Java program to reverse a string
	
	// Input string: The quick brown fox
	// Expected output: xof nworb kciuq ehT
	
	public void reverseString(String inputString) {
		char [] inputStringChars = inputString.toCharArray();
		System.out.println("The reversal of " + inputString + " is: ");
		for(int i=inputStringChars.length-1; i>=0; i--) {
			System.out.print(inputStringChars[i]);
		}
		
	}
	
	


	
	

}
