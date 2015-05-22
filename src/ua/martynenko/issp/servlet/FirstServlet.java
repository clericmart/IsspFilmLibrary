package ua.martynenko.issp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/FirstServlet" }, name = "first") 
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("First servet service!");
		resp.getWriter().print(req.getCharacterEncoding());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("First servlet init");
	}
	
	@Override
	public void destroy() {
		System.out.println("FirstServlet destroy");
	}
}
