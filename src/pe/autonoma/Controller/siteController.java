package pe.autonoma.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class siteController
 */
@WebServlet("/siteController")
public class siteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   /* public siteController() {
        super();
        // TODO Auto-generated constructor stub
    }*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String page = request.getParameter("page");
		page = page.toLowerCase();
		
		switch (page) {
		case "Inicio":
			iniciopage(request,response);
			break;
			
			
			case "Nosotros":
				nosotrospage(request,response);
				break;
				
				
			case "Talleres":
				tallerespage(request,response);
				break;
				
				 
			case "Contactos":
				contactopage(request,response);
				break;
			
			case "":
				homepage(request,response);
				break;
		}
	}

	private void homepage(HttpServletRequest request, HttpServletResponse response) 
		// TODO Auto-generated method stub
		throws ServletException, IOException {
			request.setAttribute("title", "Homepage");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	private void contactopage(final HttpServletRequest request, final HttpServletResponse response) 
		// TODO Auto-generated method stub
		throws ServletException, IOException {
			request.setAttribute("title", "Homepage");
			request.getRequestDispatcher("Contactos.jsp").forward(request, response);
		
	}

	private void tallerespage(HttpServletRequest request, HttpServletResponse response) 
		// TODO Auto-generated method stub
		throws ServletException, IOException{
			request.setAttribute("title", "Homepage");
			request.getRequestDispatcher("Talleres.jsp").forward(request, response);
		
	}

	private void nosotrospage(HttpServletRequest request, HttpServletResponse response) 
		// TODO Auto-generated method stub
		throws ServletException, IOException{
			request.setAttribute("title", "Homepage");
			request.getRequestDispatcher("Nosotros.jsp").forward(request, response);
		
	}

	private void iniciopage( HttpServletRequest request, HttpServletResponse response) 
		// TODO Auto-generated method stub
		throws ServletException, IOException{
			request.setAttribute("title", "Homepage");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/**protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}*/

}
