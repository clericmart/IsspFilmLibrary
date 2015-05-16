package ua.martynenko.issp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ua.martynenko.issp.film.Film;


public class FilmDao {
	private static final String CONNECTION_URL = "jdbc:sqlite:C://java//db//filmlibrary.db";
	private static final String CONNECTION_USER = "";
	private static final String CONNECTION_PASSWORD = "";
	
	private static FilmDao instance = null;
	
	private FilmDao() {
		super();
	}
	
	public static FilmDao getInstance(){
		if (instance == null) 
			instance = new FilmDao();
		return instance;
	}
	
	public void addActor(Film film) {
		try(Connection con = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USER, CONNECTION_PASSWORD)) {
			if (film.getId() == Film.DEFAULT_ID) {
				
				String sql =  "INSERT INTO Film (title, actor_id, genres_id, country_id, duration, imdb, year, description, image, link) "
							+ "VALUES (?,?,?,?,?,?,?,?,?,?)";			
				PreparedStatement s = con.prepareStatement(sql);
			
				s.setString(1, film.getTitle());
				s.setInt(2, film.getActorId());
				s.setInt(3, film.getGenresId());
				s.setInt(4, film.getCountryId());
				s.setInt(5, film.getDuration());
				s.setDouble(6, film.getImdb());
				s.setDate(7, film.getYear());
				s.setString(8, film.getDescription());
				s.setString(9, film.getImage());
				s.setString(10, film.getLink());
					
				System.out.println(s);
				s.execute();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteFilm(Integer filmId) {
		try(Connection con = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USER, CONNECTION_PASSWORD)) {
			
				String sql =  "DELETE FROM Film WHERE id = ?";			
				PreparedStatement s = con.prepareStatement(sql);
			
				s.setInt(1, filmId);
				
				System.out.println(s);
				s.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
