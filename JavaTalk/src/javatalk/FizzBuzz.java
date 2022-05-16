package javatalk;

public class FizzBuzz {
	
	// Write a FizzBuzz program that outputs numbers from 1 to input num...
	
	public void printFizzBuzz(int num) {
			
			for(int i=1; i<=num; i++) {
				if(i%5== 0 && i%3 == 0) {
					System.out.println("FizzBuzz");
				} else if(i%5 == 0) {
					System.out.println("Buzz");
				} else if(i%3 ==0) {
					System.out.println("Fizz");
				}else {
					System.out.println(i);
				}
				
			
		}
	}
	
	

}
