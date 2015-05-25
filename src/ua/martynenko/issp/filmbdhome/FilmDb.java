package ua.martynenko.issp.filmbdhome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class FilmDb {
	private static FilmDb instance;
	private FilmDb(){
	}
	public static FilmDb getInstance(){
		if (instance == null) instance = new FilmDb();
		return instance;
	}
	private static ArrayList<FilmForDb> list = new ArrayList<FilmForDb>();
	
	private Random random = new Random();
	
	public void generateFilm(){
		for (int i = 0; i < 10; i++) 
			list.add(new FilmForDb("Film" + i, "Film about smth" + i, random.nextDouble() * 10, random.nextInt(100) + 1915, "genre" + i, "country" + i, random.nextInt(90) + 90));
	}
	
	public ArrayList<FilmForDb> getList() {
		return list;
	}
	
	public int getSize(){
		return list.size();
	}
	
	public boolean addFilm(String title, String description, double rating, int year, String country, int duration, String genres) {
		int count = 0;
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getTitle().equals(title)) count++;
		if (count == 0){
			list.add(new FilmForDb(title, description, rating, year, genres, country, duration)); 
			return true;
		}
		else return false;
	}
	
	public boolean dellfilm(String a) {
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(a)) index = i; 
		}
		if (index == -1) return false;
		else {
			list.remove(index);
			return true;}
	}
	
	public boolean genfilm(String a, String title, String description, String rating, String year, String country, String duration, String genres) {
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(a)) index = i; 
		}
		if (index == -1) return false;
		else {
			if (!title.isEmpty()) list.get(index).setTitle(title);
			if (!description.isEmpty()) list.get(index).setDescription(description);
			if (!rating.isEmpty()) list.get(index).setRating(Double.parseDouble(rating));
			if (!year.isEmpty()) list.get(index).setYear(Integer.parseInt(year));
			if (!country.isEmpty()) list.get(index).setCountry(country);
			if (!duration.isEmpty()) list.get(index).setDuration(Integer.parseInt(duration));
			if (!genres.isEmpty()) list.get(index).setGenres(genres);
			return true;}
	}

	public void sortDb(String a){
		switch (a.toLowerCase()) {
		case "titleup":
			Collections.sort(list, new Comparator<FilmForDb>() {
				@Override
				public int compare(FilmForDb o1, FilmForDb o2) {
					return o1.getTitle().compareTo(o2.getTitle());
				}
			});
			break;
		case "titledown":
			Collections.sort(list, new Comparator<FilmForDb>() {
				@Override
				public int compare(FilmForDb o1, FilmForDb o2) {
					return o2.getTitle().compareTo(o1.getTitle());
				}
			});
			break;
		case "durationup":
			Collections.sort(list, new Comparator<FilmForDb>() {
				@Override
				public int compare(FilmForDb o1, FilmForDb o2) {
					return o1.getDuration() - o2.getDuration();
				}
			});
			break;
		case "durationdown":
			Collections.sort(list, new Comparator<FilmForDb>() {
				@Override
				public int compare(FilmForDb o1, FilmForDb o2) {
					return o2.getDuration() - o1.getDuration();
				}
			});
			break;
		case "countryup":
			Collections.sort(list, new Comparator<FilmForDb>() {
				@Override
				public int compare(FilmForDb o1, FilmForDb o2) {
					return o1.getCountry().compareTo(o2.getCountry());
				}
			});
			break;
		case "countrydown":
			Collections.sort(list, new Comparator<FilmForDb>() {
				@Override
				public int compare(FilmForDb o1, FilmForDb o2) {
					return o2.getCountry().compareTo(o1.getCountry());
				}
			});
			break;
		case "yearup":
			Collections.sort(list, new Comparator<FilmForDb>() {
				@Override
				public int compare(FilmForDb o1, FilmForDb o2) {
					return o1.getYear() - o2.getYear();
				}
			});
			break;
		case "yeardown":
			Collections.sort(list, new Comparator<FilmForDb>() {
				@Override
				public int compare(FilmForDb o1, FilmForDb o2) {
					return o2.getYear() - o1.getYear();
				}
			});
			break;
		case "ratingup":
			Collections.sort(list, new Comparator<FilmForDb>() {
				@Override
				public int compare(FilmForDb o1, FilmForDb o2) {
					return Double.compare(o1.getRating(), o2.getRating());
				}
			});
			break;
		case "ratingdown":
			Collections.sort(list, new Comparator<FilmForDb>() {
				@Override
				public int compare(FilmForDb o1, FilmForDb o2) {
					return Double.compare(o2.getRating(), o1.getRating());
				}
			});
			break;
		}
	}	
}
