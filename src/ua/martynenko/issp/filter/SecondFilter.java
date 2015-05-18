package ua.martynenko.issp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class SecondFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("Second filter destroy!");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("Second filter run!");
		request.setAttribute("sf", "SecondFilter Attribute");
		chain.doFilter(request, response);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Second filter init");	
	}

}
