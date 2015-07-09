package ua.martynenko.issp.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.stream.Stream;


public class UserMain {
	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<User>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(new User(r.nextInt(50), "kolia" + i));
		}
		Collections.sort(list, (obj1,obj2) -> obj1.getId() - obj2.getId());
		for (User user : list) {
			System.out.println(user);
		}
		
		System.out.println();
		Collections.sort(list, (obj1, obj2) -> obj1.getName().compareTo(obj2.getName()));
		for (User user : list) {
			System.out.println(user);
		}
		
		String[] array = {"dfjsl", "fjsl", "ajfl"};
		Arrays.sort(array, String::compareTo);
		for (String string : array) {
			System.out.println(string);
		}
		
		Stream<User> s = list.stream().limit(4);
		Iterator<User> i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
