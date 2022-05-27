package javatalk;



public class StringReverse {
	
	// Write a Java program to reverse words in a given string
	
	
	/*
	 The given string is: Reverse words in a given string
     The new string after reversed the words: string given a in words Reverse

	 */
	
	public void reverseWords() {
       String inputStr = "Reverse words in a given string";
       String outputStr = "";
       
       for(int i=inputStr.split(" ").length -1; i>=0; i--) {
    	   outputStr += inputStr.split(" ")[i]+" ";
    	   
       }
       
       System.out.println(outputStr);

			
		}
	
		
		
	
}
