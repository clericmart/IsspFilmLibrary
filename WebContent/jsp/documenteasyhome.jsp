<jsp:root version="2.0" xmlns:jsp="http://java.sun.com/JSP/Page">
<jsp:directive.page import="ua.martynenko.issp.group.*"/>
<jsp:directive.page import="java.util.Random"/>
<jsp:directive.page contentType="text/html" pageEncoding="UTF-8"/>
<html>
<body>
	<form>
		Введите размер массива: <input type="text" name="arraysize" value="50" size="5"/>
		Введите максимальное число в массиве: <input type="text" name="maxnumber" value="100" size="5"/>
		Введите число: <input type="text" name="number" value="2" size="5"/> <br></br>
		<input type="checkbox" name="new" checked="checked"/> Сгенерировать новый массив?<br></br>
		<input type="checkbox" name="middle" checked="checked"/> Вывести среднее значение элементов массива.<br></br>
		<input type="checkbox" name="div"/> Вывести элементы массива, которые деляться на число нацело.<br></br> 
		<input type="checkbox" name="index"/> Вывести индексы совпадений числа в массиве. <br></br>
		<input type="submit" value="Вывести"/>
	</form>
	<jsp:scriptlet>
		MainJspHome smth = MainJspHome.getInstance();
		if (request.getParameter("new") != null) {
			if (request.getParameter("arraysize") != null) smth.generateArray(request.getParameter("arraysize"), request.getParameter("maxnumber"));
				} if (smth.getArray() != null) out.print("Сгенеренный массив:" + smth.showArray() + "\u003Cbr\u003E");
			if (request.getParameter("middle") != null \u0026\u0026 request.getParameter("middle").equals("on") \u0026\u0026 smth.getArray() != null) 
				out.print("Среднее значение массива: " + smth.middleArray() + "\u003Cbr\u003E");
			if (request.getParameter("div") != null \u0026\u0026 request.getParameter("div").equals("on") \u0026\u0026 smth.getArray() != null) 
				out.print("Значения в массиве, которые деляться на " + request.getParameter("number") + " нацело: " + smth.divArray(request.getParameter("number")) + "\u003Cbr\u003E");
			if (request.getParameter("index") != null \u0026\u0026 request.getParameter("index").equals("on") \u0026\u0026 smth.getArray() != null) 
				out.print("Индексы совпадений числа " + request.getParameter("number") + " в массиве: " + smth.indexArray(request.getParameter("number")) + "\u003Cbr\u003E");
	</jsp:scriptlet>
</body>
</html>
</jsp:root>