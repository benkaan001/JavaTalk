package javatalk;

public class Challenge07 {

	// Write a Java program and compute the sum of the digits of an integer

	public void returnSum(int num) {

		int sum = 0;

		while (num != 0) {
			int remainder = num % 10;
			sum += remainder;
			num /=10;

		}

		System.out.println("The sum is: " + sum);

	}

}
