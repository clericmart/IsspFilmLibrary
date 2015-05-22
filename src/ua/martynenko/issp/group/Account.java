package ua.martynenko.issp.group;

public class Account {
	private int id;
	private double balance;
	private String fio;
	private static int defaultID = 0;
	
	public Account(double b, String f) {
		setBalance(b);
		setFio(f);
		id = defaultID++;
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public String getFio() {
		return fio;
	}
	public void setBalance(double b) {
		balance = b;
	}
	public void setFio(String f) {
		fio = f;
	}
	
	
	
}
