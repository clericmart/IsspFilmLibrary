package ua.martynenko.issp.group;

public class AccontTest {
	
	public void sort(String s, String dd) {
		AccountDB db = AccountDB.getInstance();
		if (db.getSize() == 0) db.generateDb();
		if (s.equals("id") && dd.equals("up")) db.sortDBbyId(); 
		else if (s.equals("id") && dd.equals("down")) db.sortDBbyIdDown();
		else if (s.equals("balance") && dd.equals("up")) db.sortDBbyBalance();
		else if (s.equals("balance") && dd.equals("down")) db.sortDBbyBalanceDown();
		else if (s.equals("fio") && dd.equals("up")) db.sortDBbyFio();
		else if (s.equals("fio") && dd.equals("down")) db.sortDBbyFioDown();
	}
}
