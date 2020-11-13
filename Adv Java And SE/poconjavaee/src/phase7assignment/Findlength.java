package phase7assignment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/len")
public class Findlength extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Findlength() {
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
		String pn="/WEB-INF/a04.jsp";
		
		LengthFind f=new LengthFind();
		pn=f.findthelength(request);
		
		RequestDispatcher rd=request.getRequestDispatcher(pn);
		rd.forward(request, response);
	}

}
