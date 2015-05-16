package ua.martynenko.issp.film;

public class Genres {
	private int id;
	private String name;
	
	public static final int DEFAULT_ID = -1;
		
	public Genres(String n) {
		id = DEFAULT_ID;
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
