<%@page import="ua.martynenko.issp.group.PatternForReg"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Pattern</title>
</head>
<body>
	<%
		String [] mass = {request.getParameter("name"), request.getParameter("email"), request.getParameter("phone")};
		PatternForReg.main(mass);
		out.print(PatternForReg.result);
	%>
</body>
</html>