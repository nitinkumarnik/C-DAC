package Location_Assig1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/FrontControllerTwo")
public class FrontControllerTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public FrontControllerTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageName="/WEB-INF/ins.html";
		System.out.println("We reached the Controller");
		String whyRequestCame = request.getParameter("pov1");
		
		if(whyRequestCame.equals("ms1"))
		{
			MultiControllerTwo m =new MultiControllerTwo();
			pageName = m.getPageName(request);
		
			
		}
		else if(whyRequestCame.equals("ms2")) {
			
			MultiSelectControllerAssg2 ms =new MultiSelectControllerAssg2();
			pageName = ms.showPageName(request);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(pageName);
		rd.forward(request, response);
	
	}

}
