package ua.martynenko.issp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ua.martynenko.issp.film.Actor;


public class ActorDao {
	private static final String CONNECTION_URL = "jdbc:sqlite:C://java//db//filmlibrary.db";
	private static final String CONNECTION_USER = "";
	private static final String CONNECTION_PASSWORD = "";
	
	private static ActorDao instance = null;
	
	private ActorDao() {
		super();
	}
	
	public static ActorDao getInstance(){
		if (instance == null) 
			instance = new ActorDao();
		return instance;
	}
	
	public void addActor(String name, String secondname) {
		Actor a = new Actor(name, secondname); 
		try(Connection con = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USER, CONNECTION_PASSWORD)) {
			if (a.getId() == Actor.DEFAULT_ID) {
				
				String sql =  "INSERT INTO spr_Actor (name,secondname) VALUES (?, ?)";			
				PreparedStatement s = con.prepareStatement(sql);
			
				s.setString(1, a.getName());
				s.setString(2, a.getSecondName());
				
				System.out.println(s);
				s.execute();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteActor(Integer actorId) {
		try(Connection con = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USER, CONNECTION_PASSWORD)) {
			
				String sql =  "DELETE FROM spr_Actor WHERE id = ?";			
				PreparedStatement s = con.prepareStatement(sql);
			
				s.setInt(1, actorId);
				
				System.out.println(s);
				s.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
