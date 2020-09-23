package MediaCatalogue.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import MediaCatalogue.model.Catalogue;
import MediaCatalogue.model.Genre;

public class CatalogueTest {

	@Test
	public void createAndTest() {
		Catalogue catalogue = new Catalogue();
		assertNotNull(catalogue);
	}
	
	@Test
	public void setterTest() {
		Catalogue catalogue = new Catalogue();
		ArrayList<Genre>genres = null;
		
		catalogue.setGenres(genres);
		catalogue.getGenres();
	}

}
