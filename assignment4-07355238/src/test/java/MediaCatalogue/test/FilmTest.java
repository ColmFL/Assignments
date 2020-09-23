package MediaCatalogue.test;

import static org.junit.Assert.*;

import org.junit.Test;

import MediaCatalogue.model.Film;


public class FilmTest {

	@Test
	public void createAndTest() {
		Film film = new Film();
		assertNotNull(film);
	}

	@Test
	public void setterTest() {
		Film film = new Film();

		film.setDescription("A lonely time for...");
		film.getDescription();
	}
}
