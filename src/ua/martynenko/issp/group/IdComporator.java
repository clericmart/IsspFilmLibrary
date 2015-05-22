package ua.martynenko.issp.group;

import java.util.Comparator;

public class IdComporator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return o1.getId() - o2.getId();
	}

}
