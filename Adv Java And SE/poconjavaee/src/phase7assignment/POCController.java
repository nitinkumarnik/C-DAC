package phase7assignment;

import javax.servlet.http.HttpServletRequest;

public class POCController {

	public String divisibilityLogic(HttpServletRequest request) {
		
		// TODO Auto-generated method stub
		String pn="/WEB-INF/arch02.jsp";
		String pg=request.getParameter("t1");
		int i=Integer.parseInt(pg);
		String message="the received value is:  "+i+" and it is not divisible by 7";
		if(i%7==0)
		{
			message="the received value is:  "+i+" and it is divisible by 7";
		}
		
		request.setAttribute("k1", message);
		
		return pn;
		
		
	}
	
	
	
}
