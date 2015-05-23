<%@page import="ua.martynenko.issp.filmbdhome.FilmDb"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css" type="text/css" />
<title>Update film in library</title>
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
  	<h1>Изменить данные о фильме</h1>
  	<form action="genfilm.jsp">
	    Название фильма который надо изменить:<input type="text" value="Film1" name="title1"/><br>
	    <p>Новые данные</p>
	    Название:     <input type="text" name="title"/><br>
	    Длительность: <input type="text" name="duration"/><br>
	    Описание:     <input type="text" name="description"/><br>
	    Рейтинг:      <input type="text" name="rating"/><br>
	    Страна:       <input type="text" name="country"/><br>
	    Год:          <input type="text" name="year"/><br>
	    Жанр:         <input type="text" name="genres"/><br>
	    <input type="submit" value="Изменить" />
  	</form>
	</div>
	<%
		FilmDb film = FilmDb.getInstance();
		if (request.getParameter("title1") != null) {
		if (film.genfilm(   request.getParameter("title1"), 
							request.getParameter("title"), 
							request.getParameter("description"), 
							request.getParameter("rating"), 
							request.getParameter("year"), 
							request.getParameter("country"), 
							request.getParameter("duration"), 
							request.getParameter("genres")) == true)
				out.print("<h1>Фильм отредактирован</h1>");
		else out.print("<h1>Фильма нет в коллекции</h1>");
		}
		
	%>
</body>
</html>