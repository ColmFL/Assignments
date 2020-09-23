package MediaCatalogue.test;

import static org.junit.Assert.*;

import org.junit.Test;

import MediaCatalogue.model.Genre;

public class GenreTest {

	@Test
	public void createAndTest() {
		Genre genre = new Genre();
		assertNotNull(genre);
	}
	
	@Test
	public void setterTest() {
		Genre genre = new Genre();

		genre.setGid(5);
		genre.getGid();
	}

}
