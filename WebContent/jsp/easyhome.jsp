<%@page import="ua.martynenko.issp.group.MainJspHome"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Middle array</title>
</head>
<body>
	<form>
		Введите размер массива: <input type="text" name="arraysize" value=50 size="5">
		Введите максимальное число в массиве: <input type="text" name="maxnumber" value=100 size="5">
		Введите число: <input type="text" name="number" value=2 size="5"> <br> 
		<input type="checkbox" name="new" checked="checked"> Сгенерировать новый массив? <br>
		<input type="checkbox" name="middle" checked="checked"> Вывести среднее значение элементов массива. <br>
		<input type="checkbox" name="div"> Вывести элементы массива, которые деляться на число нацело. <br>
		<input type="checkbox" name="index"> Вывести индексы совпадений числа в массиве. <br>
		<input type="submit" value="Вывести">
	</form>
	<%  
		MainJspHome smth = MainJspHome.getInstance();
		if (request.getParameter("new") != null) {
		if (request.getParameter("arraysize") != null) smth.generateArray(request.getParameter("arraysize"), request.getParameter("maxnumber"));
			} if (smth.getArray() != null) out.print("Сгенеренный массив:" + smth.showArray() + "<br>");
		if (request.getParameter("middle") != null && request.getParameter("middle").equals("on") && smth.getArray() != null) 
			out.print("Среднее значение массива: " + smth.middleArray() + "<br>");
		if (request.getParameter("div") != null && request.getParameter("div").equals("on") && smth.getArray() != null) 
			out.print("Значения в массиве, которые деляться на " + request.getParameter("number") + " нацело: " + smth.divArray(request.getParameter("number")) + "<br>");
		if (request.getParameter("index") != null && request.getParameter("index").equals("on") && smth.getArray() != null) 
			out.print("Индексы совпадений числа " + request.getParameter("number") + " в массиве: " + smth.indexArray(request.getParameter("number")) + "<br>");
	%>
</body>
</html>