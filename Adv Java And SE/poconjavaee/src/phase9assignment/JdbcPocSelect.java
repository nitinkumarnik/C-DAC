package phase9assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcPocSelect {

	public static void main(String[] args) {
		
	try {
		String city="delhi";
		
		String cn="org.mariadb.jdbc.Driver";
		String url="jdbc:mariadb://localhost:3306/test";
		String username="root";
		String password="";
		
			Class.forName(cn);
			
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("connection established");
			
			String xyx="select empno,empname,email,city from emp1 where city=?";
			PreparedStatement stmt=con.prepareStatement(xyx);
			
			
			
			stmt.setString(1, city);
			
			
			
			ResultSet rs=stmt.executeQuery();
			List<Emp> e=new ArrayList<Emp>();
			while(rs.next())
			{
				int empno=rs.getInt("empno");
				String empname=rs.getString("empname");
				String email=rs.getString("email");
				String city1=rs.getString("city");
				Emp x =new Emp(empno,empname,email,city1);
				
				e.add(x);
				
			}
			stmt.close();
			con.close();
			
			if(e.size()==0)
				System.out.println("no item found");
			else
			{
				for(Emp i: e)
				{
					System.out.println(i.getEmpno()+" "+i.getEmpname()+" "+i.getEmail()+" "+i.getCity());
				}
			}
			
	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}