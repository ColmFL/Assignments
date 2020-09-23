package MediaCatalogue.test;

import static org.junit.Assert.*;

import org.junit.Test;

import MediaCatalogue.model.People;

public class PeopleTest {

	@Test
	public void createAndTest() {
		People person = new People();
		assertNotNull(person);
	}
	
	@Test
	public void setterTest() {
		People person = new People();

		person.setPid(2);
		person.getPid();
	}

}
