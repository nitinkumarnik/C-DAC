package phase7assignment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FAH")
public class NoticeBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public NoticeBoard() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String pn="/WEB-INF/arch02.jsp";
		
		POCController p=new POCController();
		pn=p.divisibilityLogic(request);
		
		RequestDispatcher rd=request.getRequestDispatcher(pn);
		rd.forward(request, response);
	}

}
