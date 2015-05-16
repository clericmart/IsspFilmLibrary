package ua.martynenko.issp.film;

public class Country {
	private int id;
	private String name;
	
	public Country(String n) {
		setName(n);
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}
	
	
}
