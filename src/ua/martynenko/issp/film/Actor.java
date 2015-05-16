package ua.martynenko.issp.film;

public class Actor {
	private int id;
	private String name;
	private String secondName;
	
	public Actor(String n, String s) {
		setName(n);
		setSecondName(s);
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSecondName() {
		return secondName;
	}
	
	public void setName(String n) {
		name = n;
	}
	public void setSecondName(String s) {
		secondName = s;
	}
	
	
}
