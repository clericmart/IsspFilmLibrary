package ua.martynenko.issp.group;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class AccountDB {
	public static AccountDB instance;
	
	public static AccountDB getInstance() {
		if (instance == null) instance = new AccountDB();
		return instance;
	}
	
	private AccountDB() {
		
	}
	
	private ArrayList<Account> db = new ArrayList<Account>();
	
	public void generateDb(){
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			db.add(new Account(100000*rand.nextDouble(), "fio" + i));
		}
	}
	
	public Account getAccount(int id) {
		return db.get(id);
	}
	
	public int getSize() {
		return db.size();
	}
	
	public void addAccount(double balance, String fio) {
		db.add(new Account(balance, fio));
	}
	
	public void showBase() {
		for (Account account : db) 
			System.out.println(account);	
	}
	
	public void sortDBbyBalance() {
		Collections.sort(db, new BalanceComporator());
	}
	public void sortDBbyBalanceDown() {
		Collections.sort(db, new BalanceComporatorReverse());
	}
	
	public void sortDBbyId() {
		Collections.sort(db, new IdComporator());
	}
	public void sortDBbyIdDown() {
		Collections.sort(db, new IdComporatorReverse());
	}
	
	public void sortDBbyFio() {
		Collections.sort(db, new FioComporator());
	}
	public void sortDBbyFioDown() {
		Collections.sort(db, new FioComporatorReverse());
	}
}
