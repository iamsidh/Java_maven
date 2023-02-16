package JavaStreams;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		try {
			String ProjDir = System.getProperty("user.dir");

			System.out.println(ProjDir);

			File myObj = new File(ProjDir + "/src/main/java/JavaStreams/students.txt");

			// myObj.delete();
			if (myObj.createNewFile()) {
				System.out.println("Created Successfully: " + myObj.getName());
			} else {
				System.out.println("Sorry, File Exists." + myObj);
			}

		} catch (IOException e) {
			System.out.println("Error.....");
			e.printStackTrace();
		}

	}
}