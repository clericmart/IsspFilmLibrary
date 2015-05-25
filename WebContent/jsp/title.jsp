<jsp:root version="2.0" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:c="http://java.sun.com/jsp/jstl/core">
<jsp:directive.page import="java.util.Date"/>
<jsp:directive.page contentType="text/html"
    pageEncoding="UTF-8"/>
<html>

<body>
	<c:forEach begin="0" end="10" step="1">fjdkl</c:forEach>
	<jsp:scriptlet> 
	if (request.getParameter("title") != null){
	String s = request.getParameter("title");
	response.getWriter().print(s);}
	
	</jsp:scriptlet>
</body>
</html>
</jsp:root>