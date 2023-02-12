package database_apps.student_manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Students_Operations {

	private static Connection con;

	private static PreparedStatement pstmt;

	public static boolean insertIntoStudentsDB(Students st) throws SQLException {

		boolean flag = false;

		con = DBConnection.sqlDBCon();

		String q = "insert into students(first_name,last_name)values(?,?)";

		pstmt = con.prepareStatement(q);

		pstmt.setString(1, st.getFirst_name());
		pstmt.setString(2, st.getLast_name());

		pstmt.executeUpdate();

		flag = true;

		return flag;

	}

	public static boolean deleteUser(int userID) throws SQLException {

		boolean flag = false;

		con = DBConnection.sqlDBCon();

		String q = "delete from students where id=?";

		pstmt = con.prepareStatement(q);

		pstmt.setInt(1, userID);

		pstmt.executeUpdate();

		flag = true;

		return flag;

	}

	public static void showAllStudents() throws SQLException {

		con = DBConnection.sqlDBCon();

		String q = "select * from students";

		Statement stmt = con.createStatement();

		ResultSet set = stmt.executeQuery(q);

		while (set.next()) {

			int id = set.getInt(1);
			String firstname = set.getString(2);
			String lastname = set.getString(3);
			
			System.out.println(id +" | "+firstname+" | "+lastname);
		}
	}

}
