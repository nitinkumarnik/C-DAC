package phase9assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcPoc {

	public static void main(String[] args) {
		
	try {
		Emp e=new Emp(23,"akshay","qwe@rty.com","delhi");
		//Emp e1=new Emp(24,"samantha","mno@yut.com","kolkata");
		//Emp e2=new Emp(25,"kaleen","gfr@aso.com","delhi");
		String cn="org.mariadb.jdbc.Driver";
		String url="jdbc:mariadb://localhost:3306/test";
		String username="root";
		String password="";
		
			Class.forName(cn);
			
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("connection established");
			
			String xyx="insert into emp1(empno,empname,email,city) values(?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(xyx);
			
			stmt.setInt(1,e.getEmpno());
			stmt.setString(2, e.getEmpname());
			stmt.setString(3, e.getEmail());
			stmt.setString(4, e.getCity());
			
			//stmt.setInt(1, e1.getEmpno());
			//stmt.setString(2, e1.getEmpname());
			//stmt.setString(3, e1.getEmail());
			//stmt.setString(4, e1.getCity());
			
			//stmt.setInt(1, e2.getEmpno());
			//stmt.setString(2, e2.getEmpname());
			//stmt.setString(3, e2.getEmail());
			//stmt.setString(4, e2.getCity());
			
			int rs=stmt.executeUpdate();
			if(rs>0)
				System.out.println("data inserted");
			
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
