package ie.nuig.ct548.assignment3.tests;

//Imports the necessary test packages and the 
//the app package.
import static org.junit.Assert.*;
import org.junit.Test;
import ie.nuig.ct548.assignment3.CricketData;
import ie.nuig.ct548.assignment3.CurrentScoreDisplay;

public class CurrentScoreDisplayTest {

	// The below block will create and test the constructor.
	@Test
	public void createAndTest() {
		CurrentScoreDisplay csd = new CurrentScoreDisplay();
		assertNotNull(csd);
	}

	// The below block will test the setScore method.
	@Test
	public void setterTest() {
		CricketData cD = new CricketData();
		CurrentScoreDisplay csd = new CurrentScoreDisplay();

		cD.setScore(4, 3f, 5);

		csd.update(cD, csd);
		assertEquals(csd.getRuns(), 0, 4);
		assertEquals(csd.getOvers(), 0, 3f);
		assertEquals(csd.getWickets(), 0, 5);
	}
}