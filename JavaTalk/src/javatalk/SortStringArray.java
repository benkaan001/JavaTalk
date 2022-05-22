package javatalk;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortStringArray {
	
	public void sortStringArray() {
		//Given an input String array
		//Alphabetically order the array in ascending order
		//Print out the sorted array item along with its original index position
		
		
		String [] inputStringArray = {"This","Is","Gonna","Be","A","Fun","Challenge"};
		
		
		String [] cloneArray = inputStringArray.clone();
	
		
		Arrays.sort(inputStringArray);
		
		int index =0;
		
//		System.out.println(Arrays.asList(cloneArray)); // [This, Is, Gonna, Be, A, Fun, Challenge]
//		System.out.println(Arrays.asList(inputStringArray)); // [A, Be, Challenge, Fun, Gonna, Is, This]
		
		
		for(int i=0; i<inputStringArray.length;i++) {
				index=Arrays.asList(cloneArray).indexOf(inputStringArray[i]);
				
				System.out.println("_________________________________________________");
				System.out.println("Ordered list at position " + i + ": " + inputStringArray[i]);
				System.out.println("Original index value: " + index );
			}
			
		
		
	
		
	}
	
	

}
