<%@page import="ua.martynenko.issp.filmbdhome.FilmDb"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css" type="text/css" />
<title>Delete film from library</title>
</head>
<body>
	<div class="header">
		Добро пожаловать!
		<div class="menu"> 
			<ul>
				<li><a href="main.jsp">Главная</a></li>
				<li><a href="addfilm.jsp">Добавить фильм в коллекцию</a></li>
				<li><a href="dellfilm.jsp">Удалить фильм из коллекции</a></li>
				<li><a href="genfilm.jsp">Редактировать фильм в коллекции</a></li>
			</ul>
		</div>
	</div><!-- .header-->
	<div id="filmform">
  	<h1>Удалить фильм по названию</h1>
  	<form action="dellfilm.jsp">
	    Название:     <input type="text" value="Film1" name="title"/><br>
	    <input type="submit" value="Удалить" />
  	</form>
	</div>
	<%
		FilmDb film = FilmDb.getInstance();
		if (request.getParameter("title") != null) {
		if (film.dellfilm(request.getParameter("title")) == true) out.print("<h1>Фильм удален из коллекции</h1>");
		else out.print("<h1>Фильма нет в коллекции</h1>");
		}
		
	%>
</body>
</html>