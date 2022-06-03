package javatalk;

import java.util.Arrays;

public class MinimumAbsoluteDifferenceInArray {
	
	// https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem
	
	// Given an array of integers, find the minimum absolute difference 
	// between any two elements in the array.
	
	// using Array, instead of ArrayList 
	
	public void minAbsDiff() {
		
//		int [] input = {1, -3, 71, 68,17}; // 3
		
//		int [] input = {3,7,0}; // 3
		
		int [] input = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};   // 1
		
		Arrays.sort(input);
		
		int min = Math.abs(input[0] - input[1]);
		
		
		for(int i=0; i<input.length-1;i++) {
			int absDiff = Math.abs(input[i] - input[i+1]);
			if( absDiff< min) {
				min = absDiff;
			}
		}
		System.out.println(min);
		
		
	
	}

}
