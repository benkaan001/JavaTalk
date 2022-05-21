package javatalk;

public class Regex {
	// Write a Java program that returns true if the given String
	// contains more than 15 characters composed of only lowerCase and upperCase letters and whiteSpace
	
    public boolean isMatch() { 
    	
    	String inputString = "Become A    Better   Butter   Burner";
    	System.out.println(inputString.length()); // 36
    	String regex ="[A-Za-z ]{16,}";
    	
    	
    	return inputString.matches(regex);
    }

}
