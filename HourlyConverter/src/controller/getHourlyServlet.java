package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.HourlyConverter;

/**
 * Servlet implementation class getHourlyServlet
 */
@WebServlet("/getHourlyServlet")
public class getHourlyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getHourlyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userHourly = request.getParameter("userHourly");
		String userTax = request.getParameter("userTax");
		String userHours = request.getParameter("userHours");
		
		HourlyConverter userSal = new HourlyConverter(Double.parseDouble(userHourly), Double.parseDouble(userTax), Integer.parseInt(userHours));
		
		request.setAttribute("userSalaryAmt", userSal);
		
		getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);
	}

}
