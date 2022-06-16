package javatalk;

import java.util.Arrays;

public class Challenge50 {
	/*
	 * Given two sorted arrays A and B of size p and q, write a Java program to
	 * merge elements of A with B by maintaining the sorted order i.e. fill A with
	 * first p smallest elements and fill B with remaining elements.
	
	 * Example: 
	 * Input : 
	 * int[] A = { 1, 5, 6, 7, 8, 10 } 
	 * int[] B = { 2, 4, 9 }
	 * Output: 
	 * Sorted Arrays: 
	 * A: [1, 2, 4, 5, 6, 7]
	 * B: [8, 9, 10]
	 */
	
	public void getAnswer() {
		
		int [] a = {1,5,6,7,8,10};
		int [] b = {2,4,9};
		
		int [] combined = new int[a.length+b.length];
		for (int i=0; i<a.length;i++) {
			combined[i] =a[i];
		}
		
		
		for (int i=a.length; i<(a.length+b.length); i++) {
			combined[i] = b[i-a.length];
		}
		
		Arrays.sort(combined);
		
		int [] outputA = new int[a.length];
		int [] outputB = new int[b.length];
		
	
		for(int i=0;i<outputA.length;i++) {
			outputA[i]= combined[i];
		}
		
		for (int i=0; i<outputB.length; i++) {
			outputB[i] = combined[a.length+i];
		}
		
		for(int i=0; i<outputA.length;i++) {
			System.out.print(outputA[i]+" ");
		}
		System.out.println("\n-------------");
		for (int i=0; i<outputB.length;i++) {
			System.out.print(outputB[i]+ " ");
		}
		
	}

}
