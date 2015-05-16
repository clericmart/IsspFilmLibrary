package ua.martynenko.issp.film;

import java.sql.Date;

public class Film {
	private int id;
	private int actorId;
	private int genresId;
	private int countryId;
	private double imdb;
	private int duration;
	private String title;
	private String description;
	private String image;
	private Date year;
	private String link;
	
	public static final int DEFAULT_ID = -1;
	/**
	 * @param ai Actor id
	 * @param gi Genres id
	 * @param ci Country id
	 * @param i imdb rating
	 * @param d duration of film
	 * @param t title of film
	 * @param des description of film
	 * @param im image
	 * @param y year of realize
	 * @param l  link to film
	 */
	public Film(int ai, int gi, int ci, double i, int d, String t, String des, String im, Date y, String l) {
		id = DEFAULT_ID;
		setActorId(ai);
		setGenresId(gi);
		setCountryId(ci);
		setImdb(i);
		setDuration(d);
		setTitle(t);
		setDescription(des);
		setImage(im);
		setYear(y);
		setLink(l);
	}
	public int getId() {
		return id;
	}
	public int getActorId() {
		return actorId;
	}
	public int getGenresId() {
		return genresId;
	}
	public int getCountryId() {
		return countryId;
	}
	public double getImdb() {
		return imdb;
	}
	public int getDuration() {
		return duration;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public String getImage() {
		return image;
	}
	public Date getYear() {
		return year;
	}
	public String getLink() {
		return link;
	}
	
	public void setActorId(int ai) {
		this.actorId = ai;
	}
	public void setGenresId(int gi) {
		this.genresId = gi;
	}
	public void setCountryId(int ci) {
		this.countryId = ci;
	}
	public void setImdb(double i) {
		imdb = i;
	}
	public void setDuration(int d) {
		duration = d;
	}
	public void setTitle(String t) {
		title = t;
	}
	public void setDescription(String des) {
		description = des;
	}
	public void setImage(String im) {
		image = im;
	}
	public void setYear(Date y) {
		year = y;
	}
	public void setLink(String l) {
		link = l;
	}
	
	
}
