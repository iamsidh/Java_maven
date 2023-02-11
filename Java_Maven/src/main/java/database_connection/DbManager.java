package database_connection;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DbManager {

	private static Properties prop;
	private static File file;
	private static FileInputStream fis;
	private static Connection con;

	public static void setUpMysqlConnection() {

		try {

			Class.forName(loadDatabaseConfig("drivername"));

			con = DriverManager.getConnection(loadDatabaseConfig("ip"), loadDatabaseConfig("username"),
					loadDatabaseConfig("password"));

			if (!con.isClosed()) {
				System.out.println("Successfully connected to MySQL Server");
			}
		} catch (Exception e) {

			System.out.println("Connection to MySql server failed");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static String loadDatabaseConfig(String Prop) {
		String PropValue = null;

		try {

			String ProjectPath = System.getProperty("user.dir");

			file = new File(ProjectPath + "/src/main/java/database_connection/Database.config");

			fis = new FileInputStream(file);

			prop = new Properties();

			prop.load(fis);

			fis.close();

			PropValue = prop.getProperty(Prop);

		} catch (Exception e) {

			System.out.println("Error Occured");
		}
		return PropValue;
	}

	public static List<String> getSqlQuery(String Query) throws SQLException {

		Statement st = con.createStatement();

		ResultSet res = st.executeQuery(Query);

		List<String> values = new ArrayList<String>();

		while (res.next()) {
			String id = res.getString("id");
			String name = res.getString("name");
			String mob = res.getString("mobile");
			
			System.out.println(id+ " "+name+" "+mob);

		}
		con.close();
		return values;

	}

}
