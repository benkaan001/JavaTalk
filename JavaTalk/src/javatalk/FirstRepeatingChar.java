package javatalk;

public class FirstRepeatingChar {
	
	// Write a Java program to find first non repeating character in a string.
	
	public void findFirstRepeatingChar() {
		String inputStr = "gibbergabber";
		char[] charArray = inputStr.toCharArray();
		char result=charArray[0];
		
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i] == charArray[i+1]) {
				result=charArray[i];
				break;
				
				
			}
		}
		System.out.println(result);
	}


}
