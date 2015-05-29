<jsp:root 	xmlns:jsp="http://java.sun.com/JSP/Page"
			xmlns:c="http://java.sun.com/jsp/jstl/core"
			version="2.0">
<jsp:directive.page contentType="text/html; charset=Utf-8" />
<html><head>
<title>Демонстрация тегов core</title>
</head>
<h3>Демонстрация работы тегов <br/>c:forEach, c:choose, c:when, c:otherwise</h3>
<jsp:text>
Ниже приведены случайно сгенерированные элементы массива и сделана их оценка по отношению к числу 50:
</jsp:text>
<br/>
<jsp:useBean id="arr" class="ua.martynenko.issp.group.Arr" />
<c:set var="items" value="${arr.fillMap}" scope="session" />
<c:forEach var="id" items="${items}">
	<c:out value="${id}" />
	<c:choose>
		<c:when test="${id > 50}" >
			<c:out value=" - число больше 50"/>
		</c:when>
		<c:otherwise>
			<c:out value=" - число меньше 50"/>
		</c:otherwise>
	</c:choose>
	<br/>
</c:forEach>
</html>
</jsp:root>