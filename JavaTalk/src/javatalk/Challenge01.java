package javatalk;

public class Challenge01 {
	
	// Write a Java program that takes a number as input 
	// and prints its multiplication table up to 10;
	
	private int result;
	private int num;
	
	// using the implicit parameterless constructor 
	
	
	
	public void printTable(int num) {
		result=1;
		System.out.println("Here is your multiplication table for number " + num + " : \n_______________________\n");
		for(int i=1; i<=10; i++) {
			result =num*i;
			System.out.println(num + " x " + i + " = " + result);
		}
		System.out.println("_______________________");
	}

}
