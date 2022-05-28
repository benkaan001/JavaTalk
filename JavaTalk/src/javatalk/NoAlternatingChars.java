package javatalk;

public class NoAlternatingChars {
	/*
	 
	You are given a string containing characters A and B only. 
	Your task is to change it into a string such that there are no matching adjacent characters. 
	To do this, you are allowed to delete zero or more characters in the string.
    Your task is to find the minimum number of required deletions.
    Example
    s = AABAAB
    Remove an A at positions 0 and 3 to make s = ABAB in 2 deletions.
	
	*/
	
	public void alternatingCharacters() {
		
//		String s = "AAAA";   // 3
//		String s = "BBBBB";  // 4
//		String s = "ABABABAB"; // 0
//		String s = "BABABA"; // 0
		String s= "AAABBB"; // 4
		
		int count =0;
		
		char [] input = s.toCharArray();
		
		for(int i=0; i< input.length-1; i++) {
			if(input[i] == input[i+1]) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
		
	
	}
	
	

}
