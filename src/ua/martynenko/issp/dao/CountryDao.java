package ua.martynenko.issp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ua.martynenko.issp.film.Country;

public class CountryDao {
	private static final String CONNECTION_URL = "jdbc:sqlite:C://java//db//filmlibrary.db";
	private static final String CONNECTION_USER = "";
	private static final String CONNECTION_PASSWORD = "";
	
	private static CountryDao instance = null;
	
	private CountryDao() {
		super();
	}
	
	public static CountryDao getInstance(){
		if (instance == null) 
			instance = new CountryDao();
		return instance;
	}
	
	public void addActor(Country country) {
		try(Connection con = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USER, CONNECTION_PASSWORD)) {
			if (country.getId() == Country.DEFAULT_ID) {
				
				String sql =  "INSERT INTO spr_Country (name) VALUES (?)";			
				PreparedStatement s = con.prepareStatement(sql);
			
				s.setString(1, country.getName());
				
				System.out.println(s);
				s.execute();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteCountry(Integer countryId) {
		try(Connection con = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USER, CONNECTION_PASSWORD)) {
			
				String sql =  "DELETE FROM spr_Country WHERE id = ?";			
				PreparedStatement s = con.prepareStatement(sql);
			
				s.setInt(1, countryId);
				
				System.out.println(s);
				s.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}