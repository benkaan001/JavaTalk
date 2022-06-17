package javatalk;

import java.util.Arrays;

/* 
   hackerRank DesignerPdfViewer
 
 */

public class Challenge52 {
	
	public void getAnswer() {
		
		String word = "zaba";
		
		int [] h = {1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7};
		
		char letters [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	    int []word_arr = new int[word.length()];
	    
	    int index=0;
	    
	    for (int i=0; i<word.length();i++){
	        if(new String(letters).contains(word.split("")[i])){
	       
	        		index =new String(letters).indexOf(word.split("")[i]);
	        		word_arr[i] = h[index];	
	        
	        }
	    }
	    
	    Arrays.sort(word_arr);
	     
	    int tallest = word_arr[word_arr.length-1];
//	    System.out.println("tallest " + tallest);
	    
	    int output = tallest * word.length();
	    
	  
	    
	    System.out.println(output);
		
	}

}
