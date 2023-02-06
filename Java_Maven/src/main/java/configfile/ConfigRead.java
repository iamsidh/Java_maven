package configfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigRead {

	public static void main(String[] args) {
		try {
			File file = new File("./src/main/java/configfile/properties.config");

			Properties prop = new Properties();

			FileInputStream fis = new FileInputStream(file);

			prop.load(fis);

			fis.close();

			System.out.println("username is :" + prop.getProperty("username"));
			System.out.println("password : " + prop.getProperty("password"));

		} catch (FileNotFoundException e) {

			System.out.println("error file not found");
			
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
