package ua.martynenko.issp.group;

import java.util.Comparator;

public class FioComporatorReverse implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		return o2.getFio().compareTo(o1.getFio());
	}

}
