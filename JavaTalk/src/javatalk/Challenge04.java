package javatalk;

public class Challenge04 {
	
	// Write a Java program to print the area and perimeter of a circle.
	
	public void circleCalculation(float radius) {
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
		System.out.println("The area is : " + area +"\nThe perimeter is: " + perimeter);
		
	}

}
