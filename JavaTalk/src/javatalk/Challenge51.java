package javatalk;

public class Challenge51 {
	
	//hackerRank pickingNunbers
	// Given an array of integers, find the longest subarray where the absolute difference 
	// between any two elements is less than or equal to 1.
	// CONSTRAINTS ---> 0>n<=100

	public void getAnser() {

		int[] a = { 1, 1, 2, 2, 4, 4, 5, 5, 5 };

		int maxCount = 0;
		int index = 0;
		int frequency[] = new int[101];

		for (int i = 0; i < a.length; i++) {
			index = a[i];
			frequency[index]++;

		}

		for (int i = 1; i < frequency.length - 1; i++) {
			if (frequency[i] + frequency[i + 1] > maxCount) {
				maxCount = frequency[i] + frequency[i + 1];
			}
		}

		System.out.println(maxCount);

	}

}
