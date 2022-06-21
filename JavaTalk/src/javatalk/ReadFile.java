package javatalk;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
//  Write a Java program to read a file content line by line
	
	public void read() {
		
		BufferedReader buffy = null;
		String line ="";
		
		try {
			buffy = new BufferedReader(new FileReader("/Users/benkaan/Desktop/userdir1/file1/"));
			while ((line = buffy.readLine()) != null) {
				System.out.println(line);
			}
			buffy.close();
		} catch(FileNotFoundException e) {
			System.out.println("File not found y'all!");
		} catch (IOException e) {
			System.out.println("Unable to read this file!");
		}
		
		
		// This is part of BIG DATA session
		// We are adding this third line via cat >> file1 command
		// ...
		
	}

}
