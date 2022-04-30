package javatalk;

public class Challenge03 {
	
	/*
	 Write a Java program to compute a specified formula
	 Specified Formula :  4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
    Expected Output: 2.9760461760461765
	*/
	
	
	private double result;
	
	
	public double calculateResult(double num1, int num2, double num3, double num4, double num5, double num6, double num7) {
		result = num1 * (num2 - (num3) + (num4) - (num5) + (num6) - (num7));
		return result;
	}
	

	

}
