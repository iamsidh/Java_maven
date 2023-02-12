package database_apps.student_manager;

import java.sql.SQLException;
import java.util.Scanner;

public class Index {

	public static void main(String[] args) throws SQLException {

		System.out.println("Select from options below");

		System.out.println("Press 1 for Insert Student");
		System.out.println("Press 2 for Delete Student");
		System.out.println("Press 3 for Show All Students");

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		if (input == 1) {

			System.out.println("Enter First name");

			String fname = sc.next();

			System.out.println("Enter Last Name");

			String lname = sc.next();

			Students st = new Students(fname, lname);

			System.out.println(st);

			boolean result = Students_Operations.insertIntoStudentsDB(st);

			if (result) {

				System.out.println("Query executed successfully");
			} else {

				System.out.println("Query execution failed");
			}

			sc.close();
		}

		else if (input == 2) {

			System.out.println("Enter user id to delete\n");

			int userID = sc.nextInt();

			boolean result = Students_Operations.deleteUser(userID);

			if (result) {

				System.out.println("User deleted successfully" + userID);
			} else {
				System.out.println("User deletion failed");
			}
			sc.close();
			
		} else if (input == 3) {
			
			System.out.println("Values from table are");
			System.out.println("------------------------");

			Students_Operations.showAllStudents();
			sc.close();

		}

	}

}
