<%@page import="ua.martynenko.issp.filmbdhome.FilmDb"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css" type="text/css" />
<title>Add film to library</title>
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
  	<h1>Добавить новый фильм</h1>
  	<form action="addfilm.jsp">
	    Название:     <input type="text" value="Film1" name="title"/><br>
	    Длительность: <input type="text" value="100" name="duration"/><br>
	    Описание:     <input type="text" value="film about" name="description"/><br>
	    Рейтинг:      <input type="text" value="7.8" name="rating"/><br>
	    Страна:       <input type="text" value="USA" name="country"/><br>
	    Год:          <input type="text" value="2000" name="year"/><br>
	    Жанр:         <input type="text" value="Comedy" name="genres"/><br>
	    <input type="submit" value="Добавить" />
  	</form>
	</div>
	<%
		FilmDb film = FilmDb.getInstance();
		if (request.getParameter("title") != null) {
		if (film.addFilm(	request.getParameter("title"), 
						request.getParameter("description"), 
						Double.parseDouble(request.getParameter("rating")), 
						Integer.parseInt(request.getParameter("year")), 
						request.getParameter("country"), 
						Integer.parseInt(request.getParameter("duration")), 
						request.getParameter("genres")) == true) out.print("<h1>Фильм добавлен в коллекцию</h1>");
		else out.print("<h1>Фильм уже есть в коллекции</h1>");
		}
		
	%>
</body>
</html>