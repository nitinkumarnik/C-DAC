package EmployeeAssigOne;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class DAOLayer {

private Connection con;




public DAOLayer() throws ClassNotFoundException 
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbconn?useTimezone=true&serverTimezone=UTC","root","root");
		
			System.out.println("connection is Established");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
}







	public boolean insertIntoDB(emp e) {
		// TODO Auto-generated method stub
		boolean insertedStatus =false;
		try {
			String sql ="insert into emp3(empno,deptid,mobileno) values (?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, e.getEmpno());
			stmt.setInt(2, e.getDeptid());
			stmt.setInt(3, e.getMobileno());
			int ra = stmt.executeUpdate();
			stmt.close();
			insertedStatus=true;
					
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return insertedStatus;
		}

	public boolean tellGoodByeToDB()
	{
		boolean closedStatus=false;
		try {
			con.close();
			closedStatus=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return closedStatus;
		
		
		
	}





	public emp getDetailsFromDB(int empno) {
		// TODO Auto-generated method stub
		
		emp e=new emp(empno,-3, -3);
		try {
			String sql =" select Empno,deptid,mobileno from emp3 where empno=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, e.getEmpno());
			ResultSet ra = stmt.executeQuery();
			if(ra.next())
			{
				int Deptid = ra.getInt("deptid");
				e.setDeptid(Deptid);
				
				int Mobileno = ra.getInt("mobileno");
				e.setMobileno(Mobileno);
	
				
			}
			stmt.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		return e;
	}







	public boolean UpdateDetailsInDB(emp u) {
		// TODO Auto-generated method stub
		boolean updated = false;
		// TODO Auto-generated method stub
		
		String sql ="update emp3 set deptid=?,mobileno=? where empno=?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, u.getDeptid());
			stmt.setInt(2, u.getMobileno());
			stmt.setInt(3, u.getEmpno());
			int ra = stmt.executeUpdate();
			if(ra > 0)
				updated = true;
			stmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		
		
				
		return updated;
	}







	public List<emp> getempdetails(int empno) {
		// TODO Auto-generated method stub
		List<emp> l =new ArrayList<emp>();
		// TODO Auto-generated method stub
		try {
			String sql ="select Empno,deptid,mobileno from emp3 where Empno>?";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, empno);
			ResultSet ra = stmt.executeQuery();
			while(ra.next())
			{
				int empno1 = ra.getInt("Empno");
				int deptid = ra.getInt("deptid");
				int mobileno = ra.getInt("mobileno");
				
				emp e =new emp(empno1,deptid,mobileno);
				l.add(e);
				
				
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}
	}

	













		
	
