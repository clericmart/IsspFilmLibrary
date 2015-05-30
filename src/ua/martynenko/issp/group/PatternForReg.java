package ua.martynenko.issp.group;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternForReg {
	public static String nameRegex = "[A-Z][a-z]+";
	public static String emailRegex = "[a-zA-Z0-9]+[.-_]?[a-zA-Z0-9]+@([a-zA-Z0-9]+-?)?[a-zA-Z0-9]+(.[a-z]{2,4}){1}(.[a-z]{2,4})?";
	public static String phoneRegex = "[//+]?[0-9]{7,14}";
	public static String result = "c";
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile(nameRegex); // проверка имени (4!)
		Matcher m = p.matcher(args[0]);
		if (m.find()) {
			if (m.end() == args[0].length() && m.start() == 0) {
				p = Pattern.compile(emailRegex); // проверка почты если имя ок
				m = p.matcher(args[1]);
				if (m.find()) {
					if (m.end() == args[1].length() && m.start() == 0) {
						p = Pattern.compile(phoneRegex); // проверка телефона если почта ок
						m = p.matcher(args[2]);
						if (m.find()) {
							if (m.end() == args[2].length() && m.start() == 0) result = "OK";
							else if (m.end() < args[2].length() && m.start() == 0) result = "Ошибка в телефоне позиция " + m.end();
							else if (m.end() == args[2].length() && m.start() > 0) result = "Ошибка в телефоне позиция " + m.start();
						} else result = "Проверьте правильность написания телефона";
					}
					else if (m.end() < args[1].length() && m.start() == 0) result = "Ошибка в почте позиция " + m.end();
					else if (m.end() == args[1].length() && m.start() > 0) result = "Ошибка в почте позиция " + m.start();
				} else result = "Проверьте правильность написания почты";
			}
			else if (m.end() < args[0].length() && m.start() == 0) result = "Ошибка в имени позиция " + m.end();
			else if (m.end() == args[0].length() && m.start() > 0) result = "Ошибка в имени позиция " + m.start();
        } else result = "Проверьте правильность написания имени";
		
		System.out.println(result);

	}	
}
