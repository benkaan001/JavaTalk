package javatalk;

import java.util.ArrayList;
import java.util.List;

public class NextTenLeapYears {
	
	// given a year, print the list of following 10 leap years
	
	public void printNextTenLeapYear() {
		int year = 2017;
		boolean isLeapYear = false;
		
		while(!isLeapYear) {
			if ((year %4 ==0 && year %100 !=0) || year % 400 == 0) {
				isLeapYear = true;
			} else {
				year++;
			}
			
		}
		
		List <Integer> leapYears = new ArrayList<>();
		
		for( int i =0; i<40; i+=4) {
			leapYears.add(year+i);
		
			
		}
		
		System.out.println(leapYears);
	}

}
