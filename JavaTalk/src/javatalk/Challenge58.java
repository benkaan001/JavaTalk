package javatalk;

public class Challenge58 {
	
	public void getAnswer() {
		
		String stringValues [] = {"10-13-0131", "34-05-5043", "25-00-0501"};
		
		String output[] = new String[stringValues.length];
		
		// expected output 
		// ["0131","5034","Nope"]
		
		String currentStr = "";
		String first4 ="";
		String last4="";
		
		for(int i=0; i<stringValues.length;i++) {
			currentStr+=stringValues[i].split("-")+"";
			first4 = currentStr.substring(0, 4);
			last4 = currentStr.substring(4,8);
//			System.out.println(first4);
		
		
		
		
		
		
		
	}

}
