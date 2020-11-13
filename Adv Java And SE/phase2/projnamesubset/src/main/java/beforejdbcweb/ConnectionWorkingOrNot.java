package beforejdbcweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionWorkingOrNot {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String cn="org.mariadb.jdbc.Driver";
			String url ="jdbc:mariadb://localhost:3306/test";
			String username="root";
			String password="";
			Class.forName(cn);//not needed in present day jdbc, but still it is ok..
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			System.out.println("connection is working or not");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
