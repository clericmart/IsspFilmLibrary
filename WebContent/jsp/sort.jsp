<%@page import="java.util.Arrays"%>
<%@page import="java.util.Random" %>
<html>
	<head>
	</head>
	<body>
		<% if (request.getParameter("array_size") != null) {
				int n = Integer.parseInt(request.getParameter("array_size")); 
			int[] array = new int[n];
			Random gen = new Random();
			for (int i = 0; i < array.length; i++)
				array[i] = gen.nextInt(100) - 50;
		 %>
		<a>Start array: </a>
		<% for (int i = 0; i < array.length; i++)
			out.print(array[i] + " "); 
			Arrays.sort(array);
		%>
		<br>
		<a>Sorted array: </a>
		<% for (int i = 0; i < array.length; i++)
			out.print(array[i] + " "); 
		}
		%>
	</body>
</html>