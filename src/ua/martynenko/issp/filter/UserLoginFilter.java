package ua.martynenko.issp.filter;

import java.io.File;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import ua.martynenko.issp.config.Configuration;

/**
 * Servlet Filter implementation class UserLoginFilter
 */
@WebFilter(asyncSupported = true, urlPatterns = { "/UserLoginFilter" })
public class UserLoginFilter implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {	
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		Configuration config = Configuration.getInstance();
		HttpServletResponse resp = (HttpServletResponse) response;
		
		String login = request.getParameter("login");
		String pass = request.getParameter("password");
		String templogin = "";
		String temppass = "";
		String loginxml = "";
		String passxml = "";
		String defaultPath = "/user.xml";
		
		File inputFile;
		
		String s = config.getParameter("users");
		
		if (s == null) inputFile = new File(defaultPath);
		else inputFile = new File(s);
		if (request.getAttribute("grants") == null) {
	        try {
	        	Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputFile);
				NodeList n = doc.getElementsByTagName("user");
				for (int i = 0; i < n.getLength(); i++) {
					loginxml = n.item(i).getChildNodes().item(1).getTextContent();
					passxml = n.item(i).getChildNodes().item(3).getTextContent();
					if (login.equals(loginxml) && pass.equals(passxml)) {templogin = login; temppass = pass;}
					else if (login.equals(loginxml) && !pass.equals(passxml)) templogin = login; 		
				}	
			} catch (SAXException | ParserConfigurationException | NullPointerException e) {
				e.printStackTrace();
			} finally {
				
			}
	        
			if (!templogin.equals("") && !temppass.equals("")) request.setAttribute("grants", "Welcome " + login + ", you can read data");
			else resp.sendError(401, "Only for registered users");
			chain.doFilter(request, response); 
		} else chain.doFilter(request, response);
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
