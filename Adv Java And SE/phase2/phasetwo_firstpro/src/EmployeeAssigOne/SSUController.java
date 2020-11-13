package EmployeeAssigOne;

import javax.servlet.http.HttpServletRequest;

public class SSUController {

	public String givePageName(HttpServletRequest request) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String pn = "HomeView.jsp";
		String uporse = request.getParameter("abc");
		request.setAttribute("k1", "we did reach the controller");
		
		ServiceLayer s=new ServiceLayer();
		
		
		if(uporse.equals("getempdetails"))
		{
			int empno = Integer.parseInt(request.getParameter("empno").trim());
			emp x=s.getempDetails(empno);
			if(x.getDeptid()==-3)
			{
				request.setAttribute("k1", empno + "not found");
			}
			
			else
			{
				request.setAttribute("k1", "details found");
				request.setAttribute("k2", x);
			}
		}
		else
		{
			int empno = Integer.parseInt(request.getParameter("empno").trim());
			int deptid = Integer.parseInt(request.getParameter("deptid").trim());
			int mobileno = Integer.parseInt(request.getParameter("mobileno").trim());
			emp u = new emp(empno,deptid,mobileno);//
			boolean updated = s.updatedItemDetails(u);
			if(updated)
			{
				request.setAttribute("k1","updated successfully");
			}
			else
				request.setAttribute("k3", "not updated ");
			
			System.out.println("we came for update");
		}
			System.out.println("update");
		
		
		
		
	s.tellGoodByeToREsources();
		
	return pn;
		
	}

}
