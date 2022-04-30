package javatalk;

public class Challenge02 {
	
	// Write a Java program to compute the specified expressions and print the output
	
	private double result;
	private double num1;
	private double num2;
	private double num3;
	private double num4;
	
	
	public void computeResult(double num1, double num2, double num3, double num4) {
		
		result = (num1 * num2 - num2 * num2) / (num3 - num4);
		
		System.out.println("Your result is: " + result);
		
	}
	

}
