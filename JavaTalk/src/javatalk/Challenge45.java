package javatalk;

import java.util.Arrays;

// given an array of integers return the minimum and maximum absolute difference

public class Challenge45 {
	
	public void absDiff() {
		int [] arr = {-1,-10,-600000,-4,-18};
		
	
		Arrays.sort(arr);
		int minAbsDiff=Integer.MAX_VALUE;
		int maxAbsDiff=0;
		
		for(int i=0; i<arr.length-1; i++) {
			for (int j=i+1; j<arr.length; j++) {
				int absDiff = Math.abs(arr[i] - arr[j]);
				if(absDiff > maxAbsDiff) {
					maxAbsDiff = absDiff;
					
				} else if (absDiff < minAbsDiff) {
					minAbsDiff = absDiff;
				}
				
			}
		}
		
		System.out.println("Maximum Absolute Difference = "+maxAbsDiff);  //599999
		System.out.println("Minimum Absolute Difference = " + minAbsDiff); // 3
	}

}
