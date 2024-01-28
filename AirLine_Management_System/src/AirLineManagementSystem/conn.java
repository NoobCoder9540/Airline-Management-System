package AirLineManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
	Connection con;
	Statement st;
	
	public conn()
	{
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql:///ams","root","9540");
			st = con.createStatement();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
