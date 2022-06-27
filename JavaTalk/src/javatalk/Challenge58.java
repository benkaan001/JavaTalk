package javatalk;


public class Challenge58 {
	
	// create a Java method that rotates the first and last 4 digits to match the first 4 digits with the last for digits.
	// i.e. 10-13-0131 -> first4=1013 && last4=0131 -> since we can get last4 by rotating first4 or vice versa, this passess.
	// if the digits meet the criteria, add it to the supplied output array.
	// if not, replace the last4 digit with "Nope"
	// return/print the output. 
	
	public void getAnswer() {
		
		String stringValues [] = {"10-13-0131", "34-05-5043", "25-00-0501"};
		
		String output[] = new String[stringValues.length];
		
		// expected output 
		// ["0131","5034","Nope"]
		
		String first4 ="";
		String last4="";
		
		for(int i=0; i<stringValues.length;i++) {
			
			first4 = stringValues[i].replace("-", "").substring(0,4);
			last4 = stringValues[i].replace("-","").substring(4,8);
			
			char first4nums [] = first4.toCharArray();
			char last4nums [] = last4.toCharArray();
			
						
			int sum1 =0;
			int sum2=0;
			
			for(int j=0; j<4; j++) {
				sum1+=(int)(first4nums[j]);
				sum2+=(int)(last4nums[j]);
			}
		
			
			if(sum1==sum2) {
				output[i] = last4;
			}
			else {
				output[i] = "Nope";
			}
		
		
		
		}
		for(int i=0; i< output.length; i++) {
			
			System.out.print(output[i]+" ");
		}
		
		
		
		
	}

}
