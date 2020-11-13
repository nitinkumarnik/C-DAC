package Location_Assig1;

import javax.servlet.http.HttpServletRequest;



public class MultiControllerTwo {

	public String getPageName(HttpServletRequest request) {
		String pn="HomePage_Assig2.jsp";
		request.setAttribute("k1", "we reached controller");
		String uporse = request.getParameter("controllerknowthis");
		int PinCode = Integer.parseInt(request.getParameter("PinCode").trim());
		String City=request.getParameter("City").trim();
		Location l =new Location(PinCode,City);
		ServiceLayerTwo s =new ServiceLayerTwo();
		if(uporse.equals("Insert"))
		{
			boolean statusOfInsert = s.insertCityDetails(l);
			if(statusOfInsert)
			{
				request.setAttribute("k1", "Inserted successfully!");
			}
			else
			{
				request.setAttribute("k1", "Could not add!");
			}	
		}
		else if(uporse.equals("Update")) {
			
			boolean updated = s.updatedCityDetails(l);
			if(updated) {
				request.setAttribute("k1","Updated successfully!");
			}
			else {
				request.setAttribute("k2", "Not updated!");
			}
		}
		else if(uporse.equals("Get Details!")) {
			Location l1=s.getdetails(PinCode);
			if(l1.getPincode() == 0)//we had planned
			{
				request.setAttribute("k1", PinCode + "Not found!");
				
				
			}
			else
			{
				request.setAttribute("k1", "Details found!");
				request.setAttribute("do1", l1);
				
			}
		}
		s.closeResources();
		return pn;
	}

	

}
