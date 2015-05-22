<%@page import="ua.martynenko.issp.group.AccontTest"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="ua.martynenko.issp.group.AccountDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account</title>
</head>
<body>
	<table>
		<tr>
			<td>id</td>
			<td>balance</td>
			<td>fio</td>
		</tr>
	
	<% AccountDB db = AccountDB.getInstance();
	String s = request.getParameter("sortby");
	String dd = request.getParameter("reverse");
	AccontTest a = new AccontTest();
	a.sort(s, dd);
	for (int i = 0; i < db.getSize(); i++)
	out.print("<tr><td>"+ db.getAccount(i).getId() + "</td><td>"+ db.getAccount(i).getBalance()+"</td><td>"+db.getAccount(i).getFio()+"</td></tr>");%>
	</table> 
</body>
</html>