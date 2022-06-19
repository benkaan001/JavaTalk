package javatalk;

// hackerRank viralAdvertising 

public class Challenge53 {
	
	public void getAnswer() {
		
		int n=5;
		
		int shared = 5;
		int liked = (int)Math.floor(shared/2);
		int cumulative =2;
		
	
		
		while(n-1>0) { 
			shared = liked*3;
			liked= (int) Math.floor(shared/2);
			cumulative+=liked;
//			System.out.println("cumulative" + cumulative);
			n-=1;
	
		}
	
			
			System.out.println(cumulative);
			
		}
		

}
