<%@page import="ua.martynenko.issp.filmbdhome.FilmDb"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Film</title>
<link rel="stylesheet" href="style.css" type="text/css" />
</head>
<body>

<div class="wrapper">

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

	<div class="middle">

		<div class="container">
			<div class="content">
				<strong>Данные:</strong>
				<table id="film">
					<tr>
						<th>Название</th>
						<th>Жанр</th>
						<th>Длительность</th>
						<th>Страна</th>
						<th>Год</th>
						<th>Рейтинг</th>
						<th>Описание</th>
					</tr>
					<% FilmDb film = FilmDb.getInstance();
					if (film.getSize() == 0) film.generateFilm();
					film.sortDb(request.getParameter("field") + request.getParameter("order"));
					for (int i = 0; i < film.getSize(); i++)
						out.print(  "<tr><td>" + film.getList().get(i).getTitle() + 
									"</td><td>" + film.getList().get(i).getGenres() + 
									"</td><td>" + film.getList().get(i).getDuration() + 
									"</td><td>" + film.getList().get(i).getCountry() + 
									"</td><td>" + film.getList().get(i).getYear() + 
									"</td><td>" + String.format("%.1f", film.getList().get(i).getRating()) + 
									"</td><td>" + film.getList().get(i).getDescription() +
									"</td></tr>");
					%>
				</table>
			</div><!-- .content-->
		</div><!-- .container-->

		<div class="left-sidebar">
			<strong>Сортировка:</strong> 
			<form action="main.jsp">
				<select name="field">
					<option value="title" label="Название">	
					<option value="duration" label="Длительность">	
					<option value="country" label="Страна">	
					<option value="year" label="Год">	
					<option value="rating" label="Рейтинг">	
				</select>
					<input type="radio" name="order" value="up" checked="checked"> по возростанию
					<input type="radio" name="order" value="down"> по убыванию <p></p>
				<input type="submit" value="Сортировать">
			</form>
			<a href="easyhome.jsp">Домашка с массивами</a>
			<a href="documenteasyhome.jsp">Домашка с массивами в документ</a>
		</div><!-- .left-sidebar -->

	</div><!-- .middle-->

	</div><!-- .wrapper -->

	<div class="footer">
		All rights reserved 2015
	</div><!-- .footer -->

</body>
</html>