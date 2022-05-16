package javatalk;

import java.util.Arrays;

public class CalculateAverage {
	//Write a Java program to compute the average value of an array of integers except the largest and smallest values.
	
	public void calcAverage() {
		int [] inputArray = {1,10,20,30,40,50,35};
		Arrays.sort(inputArray);
		int sum=0;
		double average =0;
		System.out.println("After we eliminate " + inputArray[0]+ " and " + inputArray[inputArray.length-1] + " from the original array " + Arrays.toString(inputArray)); // [1, 10, 20, 30, 35, 40, 50]
	    System.out.print("We are left with: ");
		for(int i=1; i<inputArray.length-1;i++) {
			sum+= inputArray[i];
			System.out.print(inputArray[i] + " ");
			
		}
		
		average = sum/(inputArray.length-2);
		System.out.println("\nAnd the average is: " + average);
		
	}

}
