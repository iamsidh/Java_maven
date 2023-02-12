package database_apps.student_manager;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;

public class DBConnection {
	
	static Connection con;

	public static Connection sqlDBCon() {

		try {

			String url = "jdbc:mysql://localhost:3306/studentmanager";

			String username = "root";

			String password = "root";

			con = DriverManager.getConnection(url, username, password);

			if (!con.isClosed()) {

				return con;
			} else {

				System.out.println("connection failed");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return con;

	}
}
