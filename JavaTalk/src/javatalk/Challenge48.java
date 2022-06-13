package javatalk;

public class Challenge48 {
	/*
	 Watson likes to challenge Sherlock's math ability. 
	 He will provide a starting and ending value that describe a range of integers, 
	 inclusive of the endpoints. Sherlock must determine the number of square integers within that range.
	 
	 Example
	 a = 24
	 b = 49
	 There are three square integers in the range: 25, 36 and 49. Return 3
	 
	 */
	
	public void getAnswer() {
		int a = 24;
		int b = 49;
		
		
		int upperBound = (int) Math.ceil(Math.sqrt(a));
//		System.out.println(upperBound);
		int lowerBound = (int) Math.floor(Math.sqrt(b));
//		System.out.println(lowerBound);
		
		int diff = (int)(lowerBound - upperBound) +1;
		
		System.out.println("No time out of bound solution is "+diff);
		
		int count =0;
		
		for(int i=a; i<=b;i++) {
			if(Math.sqrt(i) * Math.sqrt(i) == i && i % Math.sqrt(i) == 0) {
				count++;
			}
		}
		System.out.println("This works only for small range. The solution is " + count);
		
	
				
		
		
	}

}
