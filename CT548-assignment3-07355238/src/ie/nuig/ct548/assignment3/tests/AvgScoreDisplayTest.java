package ie.nuig.ct548.assignment3.tests;

//Imports the necessary test packages and the 
//the app package.
import static org.junit.Assert.*;
import org.junit.Test;
import ie.nuig.ct548.assignment3.AvgScoreDisplay;
import ie.nuig.ct548.assignment3.CricketData;

public class AvgScoreDisplayTest {

	// The below block will create and test the constructor.
	@Test
	public void createAndTest() {
		AvgScoreDisplay asd = new AvgScoreDisplay();
		assertNotNull(asd);
	}

	// The below block will test the setScore method.
	@Test
	public void setterTest() {
		CricketData cD = new CricketData();
		AvgScoreDisplay asd = new AvgScoreDisplay();

		cD.setScore(10, 15f, 6);

		asd.update(cD, asd);
		assertEquals(asd.getRunsPerOver(), 0, 10);
		assertEquals(asd.getRunsPerWicket(), 0, 15f);
		assertEquals(asd.getWicketsPerOver(), 0, 6);
	}
}