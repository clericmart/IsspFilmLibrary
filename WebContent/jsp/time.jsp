<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	<jsp:directive.page import="java.util.Date"/>
	<jsp:directive.page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"/>
<jsp:directive.page />

<html>
<head>
<title>Time</title>
</head>
<body>
<jsp:scriptlet> 
	Date n = new Date();
	Date last = new Date(session.getLastAccessedTime());
	out.print((n.getTime() - last.getTime())); 
</jsp:scriptlet>

</body>
</html>

</jsp:root>