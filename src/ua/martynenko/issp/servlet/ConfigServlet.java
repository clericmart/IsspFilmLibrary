package ua.martynenko.issp.servlet;

import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import ua.martynenko.issp.config.Configuration;

@WebServlet(asyncSupported = true)
public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init() throws ServletException {
		Enumeration<String> parametrNames = getInitParameterNames();
		String name;
		String value;
		Configuration config = Configuration.getInstance();
		while (parametrNames.hasMoreElements()) {
			name = (String) parametrNames.nextElement();
			value = getInitParameter(name);
			config.setParameter(name, value);
		}
	}

}
