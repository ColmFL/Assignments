package MediaCatalogue.test;

import static org.junit.Assert.*;

import org.junit.Test;

import MediaCatalogue.model.TVShow;

public class TVShowsTest {

	@Test
	public void createAndTest() {
		TVShow tv = new TVShow();
		assertNotNull(tv);
	}
	
	@Test
	public void setterTest() {
		TVShow tv = new TVShow();

		tv.setDescription("Six friends live in New York City.");
		tv.getDescription();
	}

}
