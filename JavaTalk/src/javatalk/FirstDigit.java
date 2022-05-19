package javatalk;

public class FirstDigit {
	
	// Write a java program to find the first digit of a number
	
	public void returnFirstDigit() {
		int num =654589;
		int lastDigit=0;
		while(num>10) {
			num = num/10;
		}
		lastDigit=num;
		System.out.println(lastDigit);
	}

}
