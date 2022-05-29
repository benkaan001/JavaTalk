package javatalk;

import java.util.Arrays;

public class ChangingIndexNum {
	// insert the given num at the given index of numbersArr while keeping the original numbers in place
	// after sorting the values in ascending order, print out the new index of given number in the sorted array
	
	public void arrayIndex() {
		int [] numbersArr = {100,20,35,400,330,8};
		int inputNum = 33;
		int index = 3;
		
		// expand the original array
		int [] newArr = new int[numbersArr.length+1];
		
		// initiate j at 0
		// loop through the new array
		// if i = index, insert inputNum at i
		// else newArr[i] will be equal to numbersArr[j] and increment j
		
		int j =0;
		
		System.out.println("New Array values after " + inputNum + " is inserted at index " + index);
		for(int i=0; i<newArr.length; i++) {
			if(i == index) {
				newArr[i] = inputNum;
			} else {
				newArr[i] = numbersArr[j];
				j++;
			}
			
		}
		// for console view
		for(int num : newArr) {
			System.out.print(num+",");
			
		}
		
		
		// sort the new given array
		
		Arrays.sort(newArr);
		
		System.out.println("\nsorted array values ");
		for(int num : newArr) {
			System.out.print(num+",");
		}
		
		// print the index num at the new sorted array
		for(int i=0; i<newArr.length; i++) {
			if(newArr[i] == inputNum) {
				System.out.println("\nGiven number " + inputNum+ " now is at index " + i);
			}
		}
	}

}
