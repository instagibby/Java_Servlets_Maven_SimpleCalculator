package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MathHere;

/**
 * Servlet implementation class Division
 */
@WebServlet("/Division")
public class Division extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Division() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		double no1 = Double.parseDouble(request.getParameter("no1"));
		double no2 = Double.parseDouble(request.getParameter("no2"));

		MathHere matematicas = new MathHere();

		
		double mathResult = matematicas.Division(no1, no2);
		
		request.setAttribute("x", no1);
		request.setAttribute("y", no2);
		request.setAttribute("math", mathResult);
		getServletContext().getRequestDispatcher("/Results.jsp").forward(request, response);
	}

}
