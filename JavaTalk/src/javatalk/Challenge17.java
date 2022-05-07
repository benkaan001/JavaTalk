package javatalk;

import java.util.Arrays;

public class Challenge17 {
	//Write a Java program to find the duplicate values of an array of integer values
	
	public void findDuplicates() {
		
		int [] inputArray = {1,2,3,1,2,1,0,0,0,0,0};
		int count=0;
		int duplicate=0;
	
		// sort the array
		Arrays.sort(inputArray);
		
		for(int i=0; i<inputArray.length-1; i++) {
			while(inputArray[i] == inputArray[i+1]) {
				count++;
				duplicate = inputArray[i];
				i++;
			}	
			if(count>0) {
				System.out.println(duplicate + " is a duplicate!");
			}
		}
		System.out.println("********************************");
	}
	
	
	public void findDuplicates2() {
		int[] inputArray = {0,1,2,3,4,0,99,4,99};
		int count=0;
		for(int i=0; i< inputArray.length-1; i++) {
			for(int j=i+1; j<inputArray.length; j++) {
				if((inputArray[i] == inputArray[j]) && (i != j)) {
					count++;
					System.out.println(inputArray[i] + " is a duplicate!");
				}
				
			}
		}
		System.out.println("You have a total of " + count + " duplicate values.");
	}
}
