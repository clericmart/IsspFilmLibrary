package ua.martynenko.issp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ua.martynenko.issp.config.Configuration;
import ua.martynenko.issp.film.Film;


public class FilmDao {
	private static final String CONNECTION_URL = Configuration.getInstance().getParameter("URL");
	private static final String CONNECTION_USER = Configuration.getInstance().getParameter("USER");
	private static final String CONNECTION_PASSWORD = Configuration.getInstance().getParameter("PASSWORD");
	
	private static FilmDao instance = null;
	
	private FilmDao() {
		super();
	}
	
	public static FilmDao getInstance(){
		if (instance == null) 
			instance = new FilmDao();
		return instance;
	}
	
	public void addFilm(int actorId, int genresId, int contryId, double imdb, int duration, String title, String description, String image, int year, int month, int day, String link) {
		@SuppressWarnings("deprecation")
		Film f = new Film(actorId, genresId, contryId, imdb, duration, title, description, image, new Date(year, month, day), link);
		try(Connection con = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USER, CONNECTION_PASSWORD)) {
			if (f.getId() == Film.DEFAULT_ID) {
				
				String sql =  "INSERT INTO Film (title, actor_id, genres_id, country_id, duration, imdb, year, description, image, link) "
							+ "VALUES (?,?,?,?,?,?,?,?,?,?)";			
				PreparedStatement s = con.prepareStatement(sql);
			
				s.setString(1, f.getTitle());
				s.setInt(2, f.getActorId());
				s.setInt(3, f.getGenresId());
				s.setInt(4, f.getCountryId());
				s.setInt(5, f.getDuration());
				s.setDouble(6, f.getImdb());
				s.setDate(7, f.getYear());
				s.setString(8, f.getDescription());
				s.setString(9, f.getImage());
				s.setString(10, f.getLink());
					
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
