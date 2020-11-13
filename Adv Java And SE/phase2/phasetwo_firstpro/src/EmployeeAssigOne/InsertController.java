package EmployeeAssigOne;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public class InsertController {

	public String givePageName(HttpServletRequest request) throws ClassNotFoundException 
	{
		String pn ="HomeView.jsp";
		System.out.println("did we reach controller");
		
		int empno = Integer.parseInt(request.getParameter("empno").trim());
		int deptid = Integer.parseInt(request.getParameter("deptid").trim());
		int mobileno = Integer.parseInt(request.getParameter("mobileno").trim());
		
		request.setAttribute("k1", "we did reach the controller");
		
		emp e =new emp(empno,deptid,mobileno);
		ServiceLayer s =new ServiceLayer();
		boolean statusOfInsert = s.insertItemDetails(e);
		if(statusOfInsert)
		{
			request.setAttribute("k1", "added successfully");
		}
		else
		{
			request.setAttribute("k1", "could not add");
		}		
		
		
		return pn;
	}
}

	
