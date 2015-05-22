package ua.martynenko.issp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletResponse;

import ua.martynenko.issp.config.Configuration;

@WebFilter("/LoginFilter")
public class AdminLoginFilter implements Filter {


	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		Configuration config = Configuration.getInstance();
		
		String templog = config.getParameter("admin");
		String temppass = config.getParameter("password");
//		HttpServletResponse resp = (HttpServletResponse) response;
		if (request.getParameter("login").equals(templog) && request.getParameter("password").equals(temppass)) request.setAttribute("grants", "Hello admin, you can read, write, and delete data");
//		else resp.sendError(401);
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
