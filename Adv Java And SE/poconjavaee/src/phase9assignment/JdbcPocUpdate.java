package phase9assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcPocUpdate {

	public static void main(String[] args) {
		
	try {
		Emp e=new Emp();
		e.setEmpname("ABC");
		e.setEmail("abc@def.com");
		e.setCity("mumbai");
		e.setEmpno(23);
		
		String cn="org.mariadb.jdbc.Driver";
		String url="jdbc:mariadb://localhost:3306/test";
		String username="root";
		String password="";
		
			Class.forName(cn);
			
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("connection established");
			
			String xyx="update emp1 set empname=?,email=?,city=? where empno=?";
			PreparedStatement stmt=con.prepareStatement(xyx);
			
			//stmt.setInt(1,e.getEmpno());
			stmt.setString(1, e.getEmpname());
			stmt.setString(2, e.getEmail());
			stmt.setString(3, e.getCity());
			stmt.setInt(4,e.getEmpno());
			
			
			int rs=stmt.executeUpdate();
			if(rs>0)
				System.out.println("data updated");
			else 
				System.out.println("problem");
			stmt.close();
			con.close();
			
	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
