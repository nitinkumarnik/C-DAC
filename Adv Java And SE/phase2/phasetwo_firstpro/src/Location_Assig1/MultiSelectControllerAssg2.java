package Location_Assig1;

import java.util.List;

import javax.servlet.http.HttpServletRequest;



public class MultiSelectControllerAssg2 {

	public String showPageName(HttpServletRequest request) {
		String pn="HomeMultiSelectAssg2.jsp";
		request.setAttribute("k1", "we reached controller");
		String City= (request.getParameter("City").trim());
		ServiceLayerTwo s =new ServiceLayerTwo();
		List<Location> l = s.getAllDetails(City);
		if(l.size() ==0)
			request.setAttribute("k1", "No Location found!");
		else
		{
			request.setAttribute("k1", "Details found!");
			request.setAttribute("k2", l);
			
		}

		return pn;
	}

}
