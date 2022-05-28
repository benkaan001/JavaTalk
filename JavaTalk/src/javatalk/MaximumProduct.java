package javatalk;

import java.util.Arrays;

public class MaximumProduct {
	
	// Write a Java program to find maximum product of two integers in a given array of integers.
	
	public void maximumProduct() {
		
		int [] nums = {2,3,5,7,-7,5,8,-5};
		
		int product=0;
		String pair = "";
		
		Arrays.sort(nums);
		
		pair+=nums[nums.length-2]+" and "+nums[nums.length-1];
		
		product = nums[nums.length-1] * nums[nums.length-2];
		
		System.out.println("Maximum numbers are: " + pair + "\nMaximum product is: " + product);

	
		
	}

}
