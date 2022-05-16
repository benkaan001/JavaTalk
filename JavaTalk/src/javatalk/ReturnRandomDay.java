package javatalk;

public class ReturnRandomDay {
	
	public void returnRandomDay() {
		
		String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		int randomNum = (int) (Math.random()*7);
		
		String string1 = "Your lucky number is " + randomNum + ";\n";
		String string2 = "Your lucky day must be "+ days[randomNum];
		String string3 = string1.concat(string2);
		System.out.println(string3);
	}
	
	
	

}
