package javatalk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge39 {
	
	// HackerRank MigratoryBirds question
	// https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true 
	
	public void test(){
		
		List <Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		arr.add(3);
		arr.add(4);
	
		
	    arr.sort(null);
	    System.out.println(arr);
	    
	    System.out.println(arr.get(5));
	    int count =0;
	    for(int i=0; i<arr.size()-1;i++){
	    	while(arr.get(i) == arr.get(i+1)) {
	    		count++;
	    	}
	    System.out.println("count is " + count);
	      
	    }
		
	    System.out.println(count);

		
		
		
		
	


		
	}

}
