package isetj.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Coffeeservlet
 */
@WebServlet("/Coffeeservlet")
public class Coffeeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Coffeeservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
String typemarque=request.getParameter("typemarque");
String textareaa=request.getParameter("textareaa");

		PrintWriter out = response.getWriter();

		out.println("<html><head>");
		out.println("<title>Coffe shop</title></head>");	
		out.println("<body><img src='C:\\Users\\maryem\\eclipse\\TP2\\WebContent\\coffee.jpg'>");
		out.println("<H4>vous souhaitez faire une remarque ou une suggesion concernant:</H4>");
		out.println("<b>"+typemarque+"</b>");
		out.println("<p>"+textareaa);
		out.println("</body></html>");
		
	  }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
