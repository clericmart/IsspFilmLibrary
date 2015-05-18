package ua.martynenko.issp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ua.martynenko.issp.config.Configuration;
import ua.martynenko.issp.film.Country;

public class CountryDao {
	private static final String CONNECTION_URL = Configuration.getInstance().getParameter("URL");
	private static final String CONNECTION_USER = Configuration.getInstance().getParameter("USER");
	private static final String CONNECTION_PASSWORD = Configuration.getInstance().getParameter("PASSWORD");
	
	private static CountryDao instance = null;
	
	private CountryDao() {
		super();
	}
	
	public static CountryDao getInstance(){
		if (instance == null) 
			instance = new CountryDao();
		return instance;
	}
	
	public void addCountry(String name) {
		Country c = new Country(name);
		try(Connection con = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USER, CONNECTION_PASSWORD)) {
			if (c.getId() == Country.DEFAULT_ID) {
				
				String sql =  "INSERT INTO spr_Country (name) VALUES (?)";			
				PreparedStatement s = con.prepareStatement(sql);
			
				s.setString(1, c.getName());
				
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