package ua.martynenko.issp.dao;

import ua.martynenko.issp.film.Actor;

public class TestDao {
	public static void main(String[] args) {
		ActorDao a = ActorDao.getInstance();
		a.addActor(new Actor("Kristian", "Bale"));
//		a.deleteActor(1);
	}
	
	
}
