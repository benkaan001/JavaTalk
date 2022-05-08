package javatalk;

import java.util.ArrayList;

public class Challenge18 {
	// Write a Java program to find the common elements between two arrays (string values).
	
	String [] array1 = {"JaVA", "JS", "CSS", "HTML", "NODE", "REACT", "MONGODB"};
	String [] array2 = {"JS", "PHYTHON", "C++", "JAVA", "MYSQL", "ANGULAR", "REACT"};
	ArrayList<String> commonElements = new ArrayList<String>();

	
	public void findCommonElements() {
	
		for(int i=0; i<array1.length;i++) {
			for(int j=0; j<array2.length;j++) {
				if(array1[i].equalsIgnoreCase(array2[j])) {
					
					System.out.print(array1[i] + " "); // Java JS REACT
					commonElements.add(array1[i]);

				}
			}
		}
		System.out.println(commonElements); // [JaVA, JS, REACT]
	}
	
	

}
