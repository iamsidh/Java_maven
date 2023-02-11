package database_connection;

import java.sql.SQLException;
import java.util.List;

public class TestDatabase {
	
	
	public static void main(String[] args) throws SQLException {
		
		//String query = "select * from dbcon where name='Siddhesh'";
		
		String query= "select * from dbcon";
		
		
		DbManager.setUpMysqlConnection();
		
		DbManager.getSqlQuery(query);
		
		
		
	}

}