package javatalk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
	
	// Create a custom array reverse method that reverses a given ArrayList of integers
	
	public void reverse() {
		
		List <Integer> inputArrList = new ArrayList<>();
		inputArrList.add(1);
		inputArrList.add(2);
		inputArrList.add(3);
		inputArrList.add(4);
		inputArrList.add(5);
		
		List<Integer> reversedList = new ArrayList<>();
		
		for(int i=inputArrList.size()-1; i>=0;i--) {
			reversedList.add(inputArrList.get(i));
			
		}
		System.out.println("Given list -> "+inputArrList);
		System.out.println("Reversed -> " + reversedList);
		
		// Using the reverse() method of collections
		
		
		Collections.reverse(reversedList);
		System.out.println("Contents after reversing it back using Collections.reverse() method : ");
		for(int i=0; i<reversedList.size();i++) {
			System.out.print(reversedList.get(i));
		}
	   
	}

}
