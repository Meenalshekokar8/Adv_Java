package com.servelet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.Entity.StudentJava;
import com.dao.StudentDao;

/**
 * Servlet implementation class LoginServelet
 */
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		System.out.println("you are in dopost");
	
		String username = request.getParameter("Username");
		System.out.println("Username is "+username);
		
		String password = request.getParameter("Password");
		System.out.println("Password is "+password);
		
		StudentDao dao=new StudentDao();
		
		StudentJava s= dao.checkUser(username, password);
		
		PrintWriter pw= response.getWriter();
		
		if(s!=null) {
			System.out.println("Valid User...");
			
			pw.print("Valid User...");
			
			pw.print("<h2 style='color:green;'> Valid User </h2> ");
			
		}else {
			System.out.println("Invalid User...");
			pw.print("Invalid User...");
			pw.print("<h2 style='color:red;' > In Valid User </h2> ");
		}
		
		pw.print("</body></html>");
		pw.close();
		
		
		
		
	}

}
