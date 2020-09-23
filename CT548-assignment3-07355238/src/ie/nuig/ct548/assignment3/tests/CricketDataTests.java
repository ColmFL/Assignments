package ie.nuig.ct548.assignment3.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import ie.nuig.ct548.assignment3.CricketData;

public class CricketDataTests {

	@Test
	public void createAndTest() {
		CricketData cd = new CricketData();
		assertNotNull(cd);
	}
	
	@Test
	public void setterTest() {
		CricketData cd = new CricketData();
				
				cd.setScore(156, 20, 5);
				assertEquals(cd.getRuns(), 156, 0);
				assertEquals(cd.getOvers(), 20, 0);
				assertEquals(cd.getWickets(), 5, 0);		
	}
}