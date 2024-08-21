package javapackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Task23EmployeeTable {

	public static void main(String[] args) throws SQLException {
		//1.create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/guvi", "root", "HANA2@legend");
		
		//2.create statement
		Statement stmt = con.createStatement();
		String s = "UPDATE employeesalary SET empname = 'Tharun' WHERE empcode=105";
		//3.execute statement
		
		stmt.execute(s);
		//4.close connection
		con.close();
		System.out.println("Query executed successfully");
		
		//

	}

}
