<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
<jsp:directive.page contentType= "text/html; charset=UTF-8" />
<html><body>
	<jsp:declaration>
		private int count = 0;
		String version = new String("J2EE 1.5");
		private String getName(){return "J2EE 1.6";}
	</jsp:declaration>
	<jsp:scriptlet>
		out.println("Значение count: ");
	</jsp:scriptlet>
	<jsp:expression>
		count++
	</jsp:expression>
	<br />
	<jsp:scriptlet>
		out.println("Значение count после инкремента:" + count);
	</jsp:scriptlet>
	<br/>
	<jsp:scriptlet>
		out.println("Старое значение version: ");
	</jsp:scriptlet>
	<jsp:expression> version </jsp:expression>
	<br/>
	<jsp:scriptlet> version=getName();
		out.println("Новое значение version: " + version);
	</jsp:scriptlet>
</body></html>
</jsp:root>