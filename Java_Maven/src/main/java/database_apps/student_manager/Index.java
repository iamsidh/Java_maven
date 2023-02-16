package database_apps.student_manager;

import java.sql.SQLException;
import java.util.Scanner;

public class Index {

	public static void main(String[] args) throws SQLException {

		while (true) {
			System.out.println("Select from options below");

			System.out.println("Press 1 for Insert Student");
			System.out.println("Press 2 for Delete Student");
			System.out.println("Press 3 for Show All Students");
			System.out.println("Press 4 to Update Students records");

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

				// sc.close();
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
				// sc.close();

			} else if (input == 3) {

				System.out.println("Values from table are");
				System.out.println("------------------------");

				Students_Operations.showAllStudents();
				// sc.close();

			} else if (input == 4) {

				System.out.println("Enter id to updated");

				int userID = sc.nextInt();

				System.out.println("Select columns which you want to update");

				System.out.println("Enter First Name");

				String firstname = sc.next();

				System.out.println("Enter Last Name");

				String lastname = sc.next();

				boolean result = Students_Operations.updateStudents(userID, firstname, lastname);

				if (result) {
					System.out.println("Students record updated successfully for userID " + userID);
				} else {
					System.out.println("record updation failed");
				}
				// sc.close();

			} else {
				System.out.println("Choice not matched");
				//sc.close();
				break;
			}
			//sc.close();
		}

	}

}
