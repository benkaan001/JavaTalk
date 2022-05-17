package javatalk;

public class MostOccuringChar {
	// Write a Java program to find the maximum occurring character in a string
	
	public void mostOccuringChar() {
		
		String inputStr = "perseverence";
		char [] charArray = inputStr.toCharArray();
		char mostCommon = charArray[0];
		int maxCount =0;
		
		for(int i=0; i<charArray.length; i++) {
			int count =0;
			for(int j=i+1; j<charArray.length; j++) {
				if(charArray[i] == charArray[j]) {
					count++;
					if(count > maxCount) {
						maxCount=count;
						mostCommon=charArray[i];
					}
				}
			}
//			System.out.println(count);
		}
		System.out.println(mostCommon); // e 
		
	}
	
}
