package javatalk;

public class Challenge14 {
	
	// Write a Java program to count the letters, spaces, numbers and other characters of an input string
	
	
	public void processString(String inputString) {
		char[] charArray = inputString.toCharArray();
		int letters=0;
		int numbers=0;
		int spaces=0;
		int allElse=0;
		for(int i=0;i<charArray.length;i++) {
			if(Character.isLetter(charArray[i])) {
				letters++;
			} else if(Character.isDigit(charArray[i])) {
				numbers++;
			} else if(Character.isSpaceChar(charArray[i])) {
				spaces++;
			} else {
				allElse++;
			}
		}
		System.out.println("In the string '" + inputString + "' \nThere are " + letters + " letters, " + numbers + " numbers," + spaces +" spaces, " + allElse + " other characters!");
	}

}
