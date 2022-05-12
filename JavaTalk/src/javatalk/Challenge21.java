package javatalk;
// Write a Java program to check whether a given string ends with the contents of another string

public class Challenge21 {
	
	public void hasContents() {
		
		String str1 = "Python Exercises";
		String str2 = "Python Exercise";
		String strEnd = "se";
		String [] strArray = {str1,str2};
		
		for(String string: strArray) {
			
			char [] charArray = string.toCharArray();
			char [] charsToCompare = strEnd.toCharArray();
			System.out.print(string + " ends with " + strEnd);
			System.out.println(" is " + (charArray[charArray.length-1] == charsToCompare[1] && charArray[charArray.length-2] == charsToCompare[0]));
		}
	
	}
	
	// built-in endsWith solution
	
	public void endsWith() {
		String str1 = "Python Exercises";
		String str2 = "Python Exercise";
		String strEnd = "se";
		
		boolean endsWith1 = str1.endsWith(strEnd); 
		boolean endsWith2 = str2.endsWith(strEnd);
		System.out.println(str1 + " ends with " + strEnd + " is " + endsWith1);
		System.out.println(str2 + " ends with " + strEnd + " is " + endsWith2 );
	}

}
