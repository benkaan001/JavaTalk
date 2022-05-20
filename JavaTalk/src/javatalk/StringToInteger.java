package javatalk;

public class StringToInteger {
	
	// Write a Java Program that splits a given string into half at the Character given
	// Second portion composes of 12 digits. If the first 6 digits matches the last 6 digits
	// print the first half of the string by splitting it at "-". Else, print "Numbers don't add up!
	
	public void splitString() {
		
	String inputString = "Jane-Doe/666333111888";
	String inputChar ="/";
	
	// logic
	String [] splitArray = inputString.split(inputChar);
	String name = splitArray[0]; // Jane-Doe
	String number = splitArray[1];  // 666333111888
	
	char [] charArray = number.toCharArray();
	
	int firstSix=0; // 54-108-162-213-264-315
	int lastSix=0;  // 56-112-168-217-266-315
	
	for(int i=0; i<6; i++) {
		firstSix +=charArray[i];
	}
	
	for(int j=charArray.length-1;j>5;j--) {
		lastSix+=charArray[j];
	}
	
	if(firstSix == lastSix) {
		System.out.println("The first six digits are equal to last six digits.");
		System.out.println("First Name is : " + name.split("-")[0]);
		System.out.println("Last Name is : " + name.split("-")[1]);
		System.out.println("I am more than positive that there are better ways to solve this problem.");
	}
	else {
		System.out.println("Numbers don't add up!");
	}

}
	
	
}