package phase4assignment;

import javax.servlet.http.HttpServletRequest;

public class X {

	public String archisimportant(HttpServletRequest request) {
		String pn = "/WEB-INF/odd.html";
		
		String value = request.getParameter("v1");
		int i = value.length();
		
		if (i%2 == 0) 
			pn = "/WEB-INF/even.html";
		
		return pn;
		
	}
	
}
