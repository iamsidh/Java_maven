package logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class On_demand_logs {

	static boolean flag = true;

	public static void directoryCreator() {

		Path path = Paths.get("C:\\Test\\On-demand-Logs-Test");

		try {
			Files.createDirectories(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		directoryCreator();
		logger();

	}

	public static void logger() {

		if (flag == true) {

			try {
				FileWriter myWriter = new FileWriter("C:\\Test\\On-demand-Logs-Test\\test.log", true);
				BufferedWriter br = new BufferedWriter(myWriter);
				br.write("Test Log\n");
				br.close();
				myWriter.close();
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}

			System.out.println("Log written because flag found as :" + flag);

		}else {
			System.out.println("Logg written skipped because flag is :" + flag);
		}

	}

}
