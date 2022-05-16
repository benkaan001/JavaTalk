package javatalk;

public class CompareTwoNums {
	
	// Write a Java program to compare two numbers
	/*
	   Input Data:
       Input first integer: 25
       Input second integer: 39
       Expected Output

      25 != 39                                                                          
      25 < 39                                                                           
      25 <= 39
	*/
	
	
	public void compareNums(int num1, int num2) {
		int bigNum = (num1 > num2) ? num1 : num2;
		int smallNum = (num1<= num2) ? num1 : num2;
		

			System.out.println(smallNum + " != " + bigNum);
			System.out.println(smallNum + " < " + bigNum);
			System.out.println(smallNum + " <= " + bigNum);

		
		
		
	}
	
	
}
