package ua.martynenko.issp.film;

public class Actor {
	private int id;
	private String name;
	private String secondName;
	
	public static final int DEFAULT_ID = -1;
	
	public Actor(String n, String s) {
		id = DEFAULT_ID;
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
