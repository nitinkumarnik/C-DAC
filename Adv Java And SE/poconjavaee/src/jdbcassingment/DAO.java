package jdbcassingment;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.List;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
	
	
	
	//create the table based on Acc class.
	//Create table in your account in your mysql with column names same as Acc .
	 private Connection con;
	 
	public DAO() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		//write connection logic here..
		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test ?useTimezone=true&serverTimezone=UTC","root","");
		
		
			
		  
	}

	public boolean insert(Acc c) throws SQLException { 
		  // return true if insert
	  //suceeds and return false if insert fails.
	  
	  //take the values from Acc object and insert into Acc table columnnames 
		  //is  same as non static variables in the Acc class 
		  String i="insert into acc values(?,?,?);";
		  PreparedStatement pst=con.prepareStatement(i);
		  pst.setInt(1, c.getAcno());
		  pst.setInt(2, c.getPin());
		  pst.setInt(3, c.getBalance());
	  
		  int row=pst.executeUpdate();
		  if(row==1)
		  {
			  return true;
		  }
		  return false;
	  
	  }
	 



	
	 public boolean update(Acc c) throws SQLException 
	  { 
		  // TODO Auto-generated method stub 
		  //update balance and pin based on accountno , think what is the logic. 
		  // which accno , which is updated pin and which is updated balance is all present 
		  //in Acc c object. return false if update fails else return true
	
	
		  
		  int accno=c.getAcno();
			int pin=c.getPin();
			int balance=c.getBalance();
			String s="UPDATE acc SET pin=?, balance=? WHERE acno=?;";
			PreparedStatement pmt=con.prepareStatement(s);
			pmt.setInt(1, pin);
			pmt.setInt(2, balance);
		    pmt.setInt(3, accno);
		    boolean result=pmt.execute();
			return result;
	}
	 

//single select query based on primary key
	public Acc getAccDetails(int accno) throws SQLException {
		// TODO Auto-generated method stub
		// do get acc object based on accno given as input arugment and return 
		// Acc object , in case account object is not found,return an acc object
		//whose balance is -1
		
		int a=0,p=0,b=-1;
		Acc c= new Acc(a,p,b);
		Statement stm=con.createStatement();
		
		String s="select * from acc";
		ResultSet rs=stm.executeQuery(s);
		
		while(rs.next())
		{
			if(accno==rs.getInt(1))
			{
				a=rs.getInt(1);
				p=rs.getInt(2);
				b=rs.getInt(3);
				c=new Acc(a,p,b);
				return c;
			}
		}
		
		//return null;
		return c;
	}



	public List<Acc> getAccOnBalance(int balance) throws SQLException {
		// TODO Auto-generated method stub
		
		//return List as empty list in case you find no account with balance
		//greater than input balance
		List<Acc> lst=new ArrayList<>();
		Statement stm=con.createStatement();
		String q="select * from acc";
		ResultSet rs=stm.executeQuery(q);
		
		while(rs.next()) 
		{
			if(balance<rs.getInt(3))
			{
				lst.add(new Acc(rs.getInt(1),rs.getInt(2),rs.getInt(3)));
			}
		}
		//return null;
		return lst;
	}

}