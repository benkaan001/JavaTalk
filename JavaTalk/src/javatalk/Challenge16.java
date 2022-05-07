package javatalk;

import java.util.Arrays;

public class Challenge16 {
	//Write a Java program to find the maximum and minimum value of an array.
	
	public void findMinMax() {
		int [] inputArray = {9,2,0,3,14,501,1,6,-99,8,2,-99,1,4};
		int min = inputArray[0];
		int max=0;
		
		for(int i=0; i<inputArray.length; i++) {
			if(inputArray[i]< min) min=inputArray[i];
			if(inputArray[i]> max) max=inputArray[i];
		}
		System.out.println("Given the inputArray of "+ Arrays.toString(inputArray));
		System.out.println( "Mininum value is " + min +"\nMaximum is " + max);
		
		
	}

}
