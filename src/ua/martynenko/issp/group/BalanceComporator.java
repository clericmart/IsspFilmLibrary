package ua.martynenko.issp.group;

import java.util.Comparator;

public class BalanceComporator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getBalance(), o2.getBalance());
	}

}
