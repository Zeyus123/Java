package Exception;

import java.sql.*;

public class ClassNotFound {

	public static void main(String[] args)
	{

		System.out.println(
			"---------------------------------------------");

		Connection con = null;
		ResultSet res = null;

		try {

			
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test?serverTimezone=UTC",
				"root", "");
		}

		catch (Exception e) {

			
			e.printStackTrace();
		}
		finally {

			res = null;
			con = null;
		}
	}
}


