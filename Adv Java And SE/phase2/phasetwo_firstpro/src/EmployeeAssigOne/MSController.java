package EmployeeAssigOne;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public class MSController {

	public String givePageName(HttpServletRequest request) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String pn="HomeView.jsp";
		request.setAttribute("k1","reached controller");
		
		
		int empno = Integer.parseInt(request.getParameter("empno").trim());
		ServiceLayer s =new ServiceLayer();
		List<emp> l = s.getemp(empno);
		if(l.size() ==0)
			request.setAttribute("k1", "no items found ");
		else
		{
			request.setAttribute("k1", "items found");
			request.setAttribute("k3", l);
			
		}
		
		return pn;
	}

}
