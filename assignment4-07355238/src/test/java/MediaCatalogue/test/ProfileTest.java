package MediaCatalogue.test;

import static org.junit.Assert.*;

import org.junit.Test;

import MediaCatalogue.model.Profile;

public class ProfileTest {

	@Test
	public void createAndTest() {
		Profile profile = new Profile();
		assertNotNull(profile);
	}
	
	@Test
	public void setterTest() {
		Profile profile = new Profile();

		profile.setName("Chico");
		profile.getName();
	}

}
