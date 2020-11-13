package jdbcassingment;

import java.util.List;
import java.sql.*;


//measure you time you take..
public class TestJDBC {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//insert logic.
		DAO d =new DAO();
		Acc c =new Acc(23,24,456);
		//boolean x ;
		boolean x = d.insert(c);
		if(x==true)
			System.out.println("insertion done");
		else
			System.out.println("no insertion");
		//update logic, assume 234 and 456 was updated details got from the user.
		c.setBalance(234);
		c.setPin(456);
		x = d.update(c);
		if(x==true)
			System.out.println("updated");
		else
			System.out.println("not updated");
		
		//single select.
		int acno =23;
		c = d.getAccDetails(23);
		if(c.getBalance() == -1)
			System.out.println("account no not found");
		else
			System.out.println("account details found"  );
		//you think how to print acount details..
		
		// multi select.
		int balance =23;
		List<Acc> l = d.getAccOnBalance(balance);
		if(l.size() ==0)
		{
			System.out.println("no acc found with balance greater than" + balance);	
			
		}
		else
		{
			///print each account object with accno and balance by using a for loop
			//think how to do it.
			for(int i=0;i<l.size();i++)
			{
				System.out.println(l.get(i).getAcno()+"---"+l.get(i).getPin()+"---"+l.get(i).getBalance());
				
			}
			
		}
					
		
		
		

	}

}
