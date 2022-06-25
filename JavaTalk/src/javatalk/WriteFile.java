package javatalk;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	public void write() {
		
		String [] kitties = {"Fluffy", "Mr.Trouble", "Butter Ball"};
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/benkaan/Desktop/kitties.txt"));
			writer.write("List of kitties: ");
			for (String kitty: kitties) {
				writer.write("\n"+kitty);
			}
			writer.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void read() {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("/Users/benkaan/Desktop/kitties.txt"));
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
