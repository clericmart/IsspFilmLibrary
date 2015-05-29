<jsp:root version="2.0" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:c="http://java.sun.com/jsp/jstl/core">
<jsp:directive.page import="org.apache.jasper.tagplugins.jstl.core.ForEach"/>
<jsp:directive.page import="ua.martynenko.issp.group.Arr"/>
<jsp:directive.page import="java.util.Date"/>
<jsp:directive.page import="java.util.regex.Matcher"/>
<jsp:directive.page import="java.util.regex.Pattern"/>
<jsp:directive.page contentType="text/html"
    pageEncoding="UTF-8"/>
<html>

<body>
	<form action="title.jsp">
		<input type="text" name="title"/>
		<input type="submit" value="Отправить"/> 
	</form>
	<jsp:scriptlet>
		Arr a = new Arr();
		if (request.getParameter("title") != null) {
		String [] mass = a.getString(request.getParameter("title"));
		String regex = "[.,?!]";
		Pattern p = Pattern.compile(regex);
		for (int i = 0; i \u003C mass.length; i++) {
		Matcher m = p.matcher(mass[i]);
			if(m.find()) {
		    	out.print(mass[i].replaceAll(regex, "") + "\u003Cbr\u003E");   
		    } else
			out.println(mass[i] + "\u003Cbr\u003E");
		}
		
		}
		
		
	</jsp:scriptlet>
</body>
</html>
</jsp:root>