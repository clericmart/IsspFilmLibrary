package ua.martynenko.issp.group;

import java.util.Comparator;

public class IdComporatorReverse implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return o2.getId() - o1.getId();
	}

}
