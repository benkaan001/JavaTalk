package javatalk;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Challenge22 {
	//  Write a Java program to print current date and time in the specified format.
	
	// Current Date and Time :                                                                                       
	//	June 19, 2017                                                                                                 
	//	3:13 pm 
	
	public void printCurrentDate() {
		
		Date date = new Date();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
		String formattedDate = dateFormatter.format(date);
		
		System.out.println("Today's date in the format of MM/dd/yyyy : " + formattedDate);
		
		dateFormatter = new SimpleDateFormat("E, MMMM dd, yyyy \nHH:mm a");
		formattedDate = dateFormatter.format(date);
		System.out.println("Today's date in the newer format E, MMMM dd, yyyy HH:mm a : \n" + formattedDate);
		
		
	}

}
