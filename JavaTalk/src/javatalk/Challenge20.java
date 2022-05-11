package javatalk;

public class Challenge20 {
//	Write a Java program to check if an array of integers is without 0 or -1
	
	public boolean hasZeroOrOne() {
		
		int []inputArray = {0,1,2,3,4,-3,-2,2,1,-1};
		int value1=0;
		int value2=-1;
		
		for(int number:inputArray) {
			return (number== value1 || number == value2);
		}
		
//		for(int i=0; i<inputArray.length; i++) {
//			if(inputArray[i] == value1 || inputArray[i] == value2) {
//				return true;
//				
//			}
//		}
		
		return false;
	}

}
