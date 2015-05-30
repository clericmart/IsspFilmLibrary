package ua.martynenko.issp.group;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternForReg {
	public static String nameRegex = "[A-Z][a-z]+";
	public static String emailRegex = "[a-zA-Z0-9]+[.-_]?[a-zA-Z0-9]+@([a-zA-Z0-9]+-?)?[a-zA-Z0-9]+(.[a-z]{2,4}){1}(.[a-z]{2,4})?";
	public static String phoneRegex = "[//+]?[0-9]{7,14}";
	public static String result = "c";
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile(nameRegex); // name (4!)
		Matcher m = p.matcher(args[0]);
		if (m.find()) {
			if (m.end() == args[0].length() && m.start() == 0) {
				p = Pattern.compile(emailRegex); // email
				m = p.matcher(args[1]);
				if (m.find()) {
					if (m.end() == args[1].length() && m.start() == 0) {
						p = Pattern.compile(phoneRegex); // phone
						m = p.matcher(args[2]);
						if (m.find()) {
							if (m.end() == args[2].length() && m.start() == 0) result = "OK";
							else if (m.end() < args[2].length() && m.start() == 0) result = "Mistake in phone, position " + (m.end() + 1);
							else if (m.end() == args[2].length() && m.start() > 0) result = "Mistake in phone, position " + m.start();
						} else result = "Check the phone spelling";
					}
					else if (m.end() < args[1].length() && m.start() == 0) result = "Mistake in email, position " + (m.end() + 1);
					else if (m.end() == args[1].length() && m.start() > 0) result = "Mistake in email, position " + m.start();
				} else result = "Check the email spelling";
			}
			else if (m.end() < args[0].length() && m.start() == 0) result = "Mistake in name, position " + (m.end() + 1);
			else if (m.end() == args[0].length() && m.start() > 0) result = "Mistake in name, position " + m.start();
        } else result = "Check the name spelling";
		
		System.out.println(result);

	}	
}
