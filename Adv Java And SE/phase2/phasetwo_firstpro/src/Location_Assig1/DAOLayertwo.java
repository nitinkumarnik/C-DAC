package Location_Assig1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DAOLayertwo {
private Connection con;
	
	public DAOLayertwo() {
		try {
			String cn="org.mariadb.jdbc.Driver";
			String url ="jdbc:mariadb://localhost:3306/employee";
			String username="root";
			String password="";
			Class.forName(cn);
			
			con = DriverManager.getConnection(url,username,password);
			
			System.out.println("Got the connection!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public boolean insertIntoDB(Location l) {
		boolean insertedStatus =false;
		try {
			String sql ="insert into cityinformation(PinCode,City) values(?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, l.getPincode());
			stmt.setString(2, l.getCity());
			
			int ra = stmt.executeUpdate();
			stmt.close();
			insertedStatus=true;
					
			
		} catch (SQLException ee) {
			// TODO Auto-generated catch block
			ee.printStackTrace();
		}
		
		return insertedStatus;
	}

	public boolean closingResources() {
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

	public boolean updateIntoDB(Location l) {
		boolean updateStatus = false;
		String sql ="update cityinformation set city=? where Pincode=?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(2, l.getPincode());
			stmt.setString(1, l.getCity());
			
			int ra = stmt.executeUpdate();
			if(ra > 0)
				updateStatus = true;
			stmt.close();
			
		} catch (SQLException ee) {
			// TODO Auto-generated catch block
			
			ee.printStackTrace();
		}
		return updateStatus;
	}

	public Location getDetailsFromDB(int pinCode) {
		
		Location l= new Location(pinCode,"XXXX");
		try {
			String sql ="select PinCode,City from cityinformation where PinCode=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, l.getPincode());
			ResultSet ra = stmt.executeQuery();
			if(ra.next())
			{
				String City = ra.getString("City");
				l.setCity(City);
			}
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}

	public List<Location> getLocation(String city) {
		List<Location> l =new ArrayList<Location>();
		try {
			String sql ="select PinCode,City from cityinformation where City=?";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, city);
			ResultSet ra = stmt.executeQuery();
			while(ra.next())
			{
				int PinCode = ra.getInt("PinCode");
				String City = ra.getString("City");
				Location l1 =new Location(PinCode,City);
				l.add(l1);
			
				
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

}
