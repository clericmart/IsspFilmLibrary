<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Middle array</title>
</head>
<body>
	<%
		int size = Integer.parseInt(request.getParameter("size"));
		int [] array = new int[size];
		int sum = 0;
		int middle = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];
		out.print((double)sum/size);
	%>
</body>
</html>