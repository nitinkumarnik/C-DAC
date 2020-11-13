package wordoperationastwo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SomeClass
 */
@WebServlet("/spr")
public class SomeClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SomeClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str = request.getParameter("wd");
		String op = request.getParameter("cli");
		
		int vowCount = 0;
		int conCount = 0;
		
		if (op.equals("to UpperCase")) {
			str = str.toUpperCase();
			response.getWriter().print(str);
		}
		
		if (op.equals("to LowerCase")) {
			str = str.toLowerCase();
			response.getWriter().print(str);
		}
		
		for (char ch : str.toLowerCase().toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vowCount++;
			else if (ch != ' ')
				conCount++;
		}
		
		if (op.equals("Count Vowels")) {
			response.getWriter().print("Number of Vowels: "+ vowCount);
		}
		
		if (op.equals("Count Consonants")) {
			response.getWriter().print("Number of Consonats: "+ conCount);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
