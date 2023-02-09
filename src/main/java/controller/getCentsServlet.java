package controller;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CoinConverter;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class getCentsServlet
 */
@WebServlet("/getCentsServlet")
public class getCentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCentsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userCents = request.getParameter("userCents");
		
        CoinConverter userCoins = new CoinConverter(Integer.parseInt(userCents));
		
		request.setAttribute("userCoinPouch", userCoins);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
				//writer.println(userCoins.toString());
				//writer.close();
		
	}

}
