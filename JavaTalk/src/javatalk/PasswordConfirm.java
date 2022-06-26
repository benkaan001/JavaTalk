package javatalk;

import java.util.Scanner;

public class PasswordConfirm {
	
	// Write a Java method to check whether a string is a valid password. 
	// Use Scanner for userInput
	// No regex expression
	
	
	public void confirmPassword() {
		Scanner input = new Scanner(System.in);
		
		System.out.print(
				"Let's go over the rules real quick...\n"+
		        "1. Password must have a minimum of 8 characters.\n"+
			    "2. Password must consist of only LETTERS and DIGITS.\n"+
		        "3. Password must contain minimum 2 digits.\n"
			    );
		
		String userInput = input.nextLine();

		if(isValidPassword(userInput)) {
			System.out.println("The password you entered " + userInput + " is valid!");
		} else {
			while(!isValidPassword(userInput)) {
				
				System.out.println("The pasword you entered " + userInput + " is not valid! Let's try it again: ");
				
				userInput= input.nextLine();
			}
		}
		
		
		
		input.close();
	    System.out.println("You got it!!!");
	
	
	}

	public static boolean isLetter(char letterChar) {
		letterChar = Character.toUpperCase(letterChar);
		return (letterChar >= 'A' && letterChar <= 'Z');
		
	}
	
	public static boolean isDigit(char digitChar) {
		return (digitChar >='0' && digitChar <='9');
	}
	
	public static boolean isValidPassword(String password) {
		if(password.length()<8) {
			return false;
		}
		
		int letterCharCount=0;
		int digitCharCount=0;
		for(int i=0; i<password.length();i++) {
			char currentChar = password.charAt(i);
			if (isLetter(currentChar)) {
				letterCharCount++;
			}
			else if (isDigit(currentChar)) {
				digitCharCount++;
			} else {
				return false;
			}
		}
		
		return (letterCharCount>=2 && digitCharCount>=2);
		
	}
	
}
