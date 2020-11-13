package EmployeeAssigOne;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontControllerServelet
 */
@WebServlet("/callServet")
public class FrontControllerServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontControllerServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageName="HomeView.jsp";
		String whyRequestCame = request.getParameter("abc");
		if(whyRequestCame.equals("insert"))
		{
			InsertController in=new InsertController();
			//request.setAttribute("k1", "we did reach the controller");
			try {
				pageName = in.givePageName(request);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			else if(whyRequestCame.equals("getempdetails") || whyRequestCame.equals("updateempetails"))
			{
				SSUController su =new SSUController();
				try {
					pageName = su.givePageName(request);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		
			else if(whyRequestCame.equals("multiselect"))
			{
				MSController ms =new MSController();
				try {
					pageName = ms.givePageName(request);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		
		RequestDispatcher rd = request.getRequestDispatcher(pageName);
		rd.forward(request, response);
	}

}
