package ua.martynenko.issp.filmbdhome;


public class FilmForDb implements Comparable<FilmForDb>{
	private String title;
	private String description;
	private double rating;
	private int year;
	private String genres;
	private String country;
	private int duration;
	
	public FilmForDb(String t, String d, double r, int y, String g, String c, int dt) {
		setTitle(t);
		setDescription(d);
		setRating(r);
		setYear(y);
		setGenres(g);
		setCountry(c);
		setDuration(dt);
	}
	
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public double getRating() {
		return rating;
	}
	public int getYear() {
		return year;
	}
	public String getGenres() {
		return genres;
	}
	public String getCountry() {
		return country;
	}
	public int getDuration() {
		return duration;
	}
	public void setTitle(String t) {
		title = t;
	}
	public void setDescription(String d) {
		description = d;
	}
	public void setRating(double r) {
		rating = r;
	}
	public void setYear(int y) {
		year = y;
	}
	public void setGenres(String g) {
		genres = g;
	}
	public void setCountry(String c) {
		country = c;
	}
	public void setDuration(int dt) {
		duration = dt;
	}
	
	@Override
	public String toString() {
		return "[Film:" + getTitle() + " Description:" + getDescription() + " Rating:" + getRating() + " Year:" + getYear() + " Duration:" + getDuration() + " Genres:" + getGenres() + " Country:" + getCountry() + "]";
	}

	@Override
	public int compareTo(FilmForDb o) {
		return getTitle().compareTo(o.getTitle());
	}
}
