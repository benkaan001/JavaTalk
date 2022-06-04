package javatalk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge44 {
	
	// HackerRank Greedy Algo --> Max Min
	
	
	public void maxMin() {
		
//		List <Integer> arr = new ArrayList<>();  // 10
//		arr.add(10);
//		arr.add(100);
//		arr.add(300);
//		arr.add(200);
//		arr.add(1000);
//		arr.add(20);
//		arr.add(30);
		
		
		List <Integer> arr = new ArrayList<>();  // 2
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(350);
		arr.add(400);
		arr.add(401);
		arr.add(402);
		
		int k =3;
		
		// sort the given array
		Collections.sort(arr);
		
		System.out.println("sorted array = " + arr);
		
		// set the output to the largest int value per test constraints
//		int output = Integer.MAX_VALUE;
		
		// or alternatively the max value in the given array
		int output = arr.get(arr.size()-1);
		
		for(int i=0; i<arr.size()-k+1; i++) {
			
			int diff= arr.get(i+k-1) - arr.get(i);
			System.out.println("difference: " + arr.get(i+k-1) + " - " + arr.get(i) + " = " + diff );
			
			if(diff< output) {
				output=diff;
			}

			
		}
		System.out.println("min diff is: " + output);
		
	
		
		
	}
	
	public void arrayApproach() {
		int [] inputArr = {100,200,300,350,400,401,402};
		int k=3;
		
		// sort
		Arrays.sort(inputArr);
		
		int output = inputArr[inputArr.length -1];
		
		// iterate through sub-arrays of size k 
		for(int i=0; i<inputArr.length -k+1; i++) {
			// find the difference between subArray[2] - subArray[0]
			int diff = inputArr[i+k-1] - inputArr[i];
			if (diff <output) {
				output = diff;
			}
		}
		
		System.out.println(output); // 2
 	}
	


}
