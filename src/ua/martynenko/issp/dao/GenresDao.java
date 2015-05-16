package ua.martynenko.issp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ua.martynenko.issp.film.Genres;

public class GenresDao {
	private static final String CONNECTION_URL = "jdbc:sqlite:C://java//db//filmlibrary.db";
	private static final String CONNECTION_USER = "";
	private static final String CONNECTION_PASSWORD = "";
	
	private static GenresDao instance = null;
	
	private GenresDao() {
		super();
	}
	
	public static GenresDao getInstance(){
		if (instance == null) 
			instance = new GenresDao();
		return instance;
	}
	
	public void addGenres(String name) {
		Genres g = new Genres(name);
		try(Connection con = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USER, CONNECTION_PASSWORD)) {
			if (g.getId() == Genres.DEFAULT_ID) {
				
				String sql =  "INSERT INTO spr_Genres (name) VALUES (?)";			
				PreparedStatement s = con.prepareStatement(sql);
			
				s.setString(1, g.getName());
				
				System.out.println(s);
				s.execute();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteGenres(Integer genresId) {
		try(Connection con = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USER, CONNECTION_PASSWORD)) {
			
				String sql =  "DELETE FROM spr_Genres WHERE id = ?";			
				PreparedStatement s = con.prepareStatement(sql);
			
				s.setInt(1, genresId);
				
				System.out.println(s);
				s.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
