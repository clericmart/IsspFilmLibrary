<jsp:root version="2.0" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:c="http://java.sun.com/jsp/jstl/core">
<jsp:directive.page import="java.util.Date"/>
<jsp:directive.page contentType="text/html"
    pageEncoding="UTF-8"/>
<html>

<body>
	<form action="title.jsp">
		<input type="text" name="title"/>
		<input type="submit" value="Отправить"/> 
	</form>
	<jsp:scriptlet> 
	if (request.getParameter("title") != null){
	String s = request.getParameter("title");
	for (int i = 0; i \u003C s.length(); i++){
		out.print("\u003Cp\u003E");
		for (int j = 0; j \u003C i; j++) out.print("\u0026nbsp;");
		out.print(s.charAt(i) + "\u003C/p\u003E");}
	}
	</jsp:scriptlet>
</body>
</html>
</jsp:root>