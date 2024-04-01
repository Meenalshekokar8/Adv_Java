package Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.Dao.StudentDao;
import com.Entity.Student;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		doGet(request, response);
		
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		
		StudentDao dao=new StudentDao();
		
		Student stud= dao.checkUser(username, password);
		
		PrintWriter pw= response.getWriter();
		response.setContentType("text/html");
		
			HttpSession session= request.getSession();
			session.setAttribute("name", stud.getFname());
		
		if(stud!=null) {
			response.sendRedirect("WelcomeServlet");
//		RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
//		rd.forward(request, response);
					
		}else {
			
			RequestDispatcher rd= request.getRequestDispatcher("login.html");
			pw.print("<h2 style='color:red'> Invalid User </h2>");
			rd.include(request, response);			
			
		}
		
	}

}
