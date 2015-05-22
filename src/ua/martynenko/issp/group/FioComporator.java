package ua.martynenko.issp.group;

import java.util.Comparator;

public class FioComporator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getFio().compareTo(o2.getFio());
	}

}
