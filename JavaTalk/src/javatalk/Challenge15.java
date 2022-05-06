package javatalk;

import java.util.Arrays;

public class Challenge15 {
	
	// Write a Java program to reverse an array of integer values.
	
     public void reverseArray() {
		int [] randomArray = {1,2,3,4,5,6,7,8,9};
		int [] copyArray = new int[randomArray.length];
		
		for(int i=randomArray.length-1, j=0; i>=0 && j<=randomArray.length; i--, j++) {
			copyArray[j]=randomArray[i];
		}
	
		System.out.println(Arrays.toString(copyArray));
		
	    
	}

}
