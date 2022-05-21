package javatalk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySorting {
	
	// given an inputArray of integers, find the sum of the Nth smallest number and Nth largest number
	// and return absolute difference between the Nth smallest and Nth largest number
	
	public void sortArray() {
		
		int [] inputArray = {9,1,5};
		int nthNumber=1;
		
		int index = nthNumber-1;
		
		int nthSmallest =0;
		int nthLargest =0;
		
		int output=0;
		
		
		
		// Solution using Arrays.sort() method
		Arrays.sort(inputArray);
		nthSmallest = inputArray[index];
		nthLargest = inputArray[inputArray.length-nthNumber];
		output = Math.abs(nthSmallest - nthLargest);
		System.out.println("Result using Arrays.sort() method : " + output);
		
		
		// Solution using ArrayList and Collections.sort() method
		
		List<Integer> inputArrayList = new ArrayList<>();
		for(int num:inputArray) {
			inputArrayList.add(num);
		}
		
		Collections.sort(inputArrayList);
		
		nthSmallest =inputArrayList.get(index);
		nthLargest = inputArrayList.get(inputArray.length-nthNumber);
		output = Math.abs(nthSmallest - nthLargest);
		
		
		System.out.println("Result using ArrayList and Collections.sort() method : " + output);
		
		
		
	}
	
	

}
