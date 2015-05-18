package ua.martynenko.issp.dao;

public class TestDao {
	public static void main(String[] args) {
		ActorDao actor = ActorDao.getInstance();
//		actor.addActor("Kristian", "Bale");
//		CountryDao country = CountryDao.getInstance();
//		country.addCountry("USA");
//		GenresDao genres = GenresDao.getInstance();
//		genres.addGenres("drama");
		actor.deleteActor(2);
		
	}
}
