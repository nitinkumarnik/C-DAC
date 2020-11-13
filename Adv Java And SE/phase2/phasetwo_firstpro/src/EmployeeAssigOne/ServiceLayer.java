package EmployeeAssigOne;

import java.util.List;

public class ServiceLayer 
{
private DAOLayer d;
  
public ServiceLayer () throws ClassNotFoundException
{
	d=new DAOLayer();
}

public boolean insertItemDetails(emp e) {
	// TODO Auto-generated method stub
	
	return d.insertIntoDB(e);  
}
public void tellGoodByeToREsources() {
	// TODO Auto-generated method stub
	
	d.tellGoodByeToDB();
	
}

public emp getempDetails(int empno) {
	// TODO Auto-generated method stub
	
	return d.getDetailsFromDB(empno);
}

public boolean updatedItemDetails(emp u) {
	// TODO Auto-generated method stub
	return d.UpdateDetailsInDB(u);
}

public List<emp> getemp(int empno) {
	
	// TODO Auto-generated method stub
	return d.getempdetails(empno);
}


}
	
		
		
	
	