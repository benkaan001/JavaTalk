package javatalk;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile2 {
	
   //  Write a Java program to store content of a file line by line into an array
	
	public void read() {
		
		BufferedReader buffy = null;
		String line ="";
		
		List <String> array = new ArrayList<>();
		
		try {
			buffy = new BufferedReader(new FileReader ("/Users/benkaan/Desktop/userdir1/file1/"));
			while ((line = buffy.readLine()) !=null) {
				array.add(line+ " STOP\n");
				
			}
			buffy.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (IOException e) {
			System.out.println("Unable to read the file!");
		}
		System.out.println(array);
		
		//[This is part of BIG DATA session STOP, We are...]
		
		
		
	}

}
