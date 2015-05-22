package ua.martynenko.issp.group;

import java.util.Comparator;

public class BalanceComporatorReverse implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getBalance(), o1.getBalance());
	}

}
