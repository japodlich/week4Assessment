package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Math;

/**
 * Servlet implementation class addServlet
 */
@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		Math math = new Math(Integer.parseInt(num1), Integer.parseInt(num2));
		
		int calc = math.addNum(Integer.parseInt(num1), Integer.parseInt(num2));
		
		request.setAttribute("calc", calc);
		getServletContext().getRequestDispatcher("/addResult.jsp").forward(request, response);
		
	}

}
