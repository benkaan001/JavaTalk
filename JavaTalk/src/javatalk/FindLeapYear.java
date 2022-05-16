package javatalk;

public class FindLeapYear {
	//Write a Java program that takes a year from user and print whether that year is a leap year or not.
	
	public boolean isLeapYear(int year) {
		
		/*
		 If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
         If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
         If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
         The year is a leap year (it has 366 days).
         The year is not a leap year (it has 365 days).
		 */
		
		boolean step1 = year%4 == 0;
		boolean step2 = year%100 != 0;
		boolean step3 = year%100 == 0 && year%400 ==0;
		
		if(step1 && (step2 || step3)) {
			return true;
		}
		
		return false;
	}
	
	
}
