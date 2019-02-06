package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MathHere;

/**
 * Servlet implementation class Multiplication
 */
@WebServlet("/Multiplication")
public class Multiplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Multiplication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int no1 = Integer.parseInt(request.getParameter("no1"));
		int no2 = Integer.parseInt(request.getParameter("no2"));

		MathHere matematicas = new MathHere();

		
		int mathResult = matematicas.Multiplication(no1, no2);
		
		request.setAttribute("x", no1);
		request.setAttribute("y", no2);
		request.setAttribute("math", mathResult);
		getServletContext().getRequestDispatcher("/Results.jsp").forward(request, response);
	}

}
