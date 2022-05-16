package javatalk;

public class ArmstrongNum {
	
	public void isArmstrong (int num) {
		/*
		
		An Armstrong number of three digits is an integer such that the sum of the 
		cubes of its digits is equal to the number itself.
        Write a program to test whether a given number is an Armstrong number or not.
        
        Return yes or no.
        
        
		*/
		
		if(num == 0 || num == 1) {
			System.out.println("Yes");
		} else {
			int originalNum = num;
			int sumOfPowers =0;
			while(num >0) {
				int remainder = num%10;
				sumOfPowers += Math.pow(remainder, 3);
				num /=10;
			}
			
			if(sumOfPowers == originalNum) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
		}
		
		
	}

}
