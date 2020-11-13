package areaperimeter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class XYZ
 */
@WebServlet("/blws")
public class XYZ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XYZ() {
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
		// TODO Auto-generated method stub
		String l = request.getParameter("len");
		String b = request.getParameter("bre");
		String op = request.getParameter("pr");
		
		int len = Integer.parseInt(l.trim());
		int bre = Integer.parseInt(b.trim());
		int res;
		
		if (op.equals("Area")) {
			res = len*bre;
			response.getWriter().print("Area is "+ res);
		} else {
			 res = 2*(len+bre);
			 response.getWriter().print("Perimeter is "+ res);
		}
		
		
	}

}
