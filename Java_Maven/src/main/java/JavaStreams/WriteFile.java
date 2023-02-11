package JavaStreams;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {
		try {
			String ProjDir = System.getProperty("user.dir");
			
			if(ProjDir.equals(null)) {
				System.out.println("ProjDir not found");
				
			}else {

			System.out.println(ProjDir);

			FileWriter file = new FileWriter(ProjDir + "/src/main/java/JavaStreams/Teachers.txt");
			
			file.write("This file has information of Teachers\n");
			file.write("Name: Rosy Fernandes, Age: 36\n");
			file.write("Name: Isha Mheta, Age: 29\n");
			file.close();
			System.out.println("File has been written into.");
			}
		} catch (IOException e) {
			System.out.println("Error......");
			e.printStackTrace();
		}
		
	}
}