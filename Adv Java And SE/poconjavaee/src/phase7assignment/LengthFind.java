package phase7assignment;

import javax.servlet.http.HttpServletRequest;

public class LengthFind {

	public String findthelength(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String pn="/WEB-INF/a04.jsp";
		String pg=request.getParameter("t2");
		String ug=pg.toUpperCase();
		int c=ug.length();
		
		String message="the received input string is: "+ug+" and it's length is:  "+c;
		
		request.setAttribute("a1", message);
		return pn;
	}

}