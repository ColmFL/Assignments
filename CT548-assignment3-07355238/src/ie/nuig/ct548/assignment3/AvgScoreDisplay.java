package ie.nuig.ct548.assignment3;

//Imports the necessary swing and util 
//packages.
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Implements the Observer interface so that Observer objects can be informed of changes.
//Inherits JFrame class which enables use of JFrame methods.
@SuppressWarnings("serial")
public class AvgScoreDisplay extends JFrame implements Observer {

	private float runsPerOver;
	private float runsPerWicket;
	private float wicketsPerOver;

	private JLabel RunsPerOver;
	private JLabel RunsPerWicket;
	private JLabel WicketsPerOver;

	// Constructor defines the labels and sets up the GUI
	// which will be used.
	public AvgScoreDisplay() {
		super("Average Scores");
		this.setLayout(new GridLayout(3, 2));

		this.add(new JLabel("Runs per over: "));
		RunsPerOver = new JLabel();
		this.add(RunsPerOver);

		this.add(new JLabel("Runs per wicket: "));
		RunsPerWicket = new JLabel();
		this.add(RunsPerWicket);

		this.add(new JLabel("Wickets per over: "));
		WicketsPerOver = new JLabel();
		this.add(WicketsPerOver);

		// Below allows for the window to be
		// sized and located. Also allows
		// visibility.
		this.pack();
		this.setSize(300, 200);
		this.setLocation(800, 200);
		this.setVisible(true);
	}

	// Update method gets the data from CricketData object.
	// It gets called by notifyObservers() which in turn gets
	// called by setScore().
	public void update(Observable o, Object args) {
		runsPerOver = ((float) (((CricketData) o).getRuns()) / (float) (((CricketData) o).getOvers()));
		this.RunsPerOver.setText(Float.toString((this.runsPerOver)));
		runsPerWicket = ((float) (((CricketData) o).getRuns()) / (float) (((CricketData) o).getWickets()));
		this.RunsPerWicket.setText(Float.toString(this.runsPerWicket));
		wicketsPerOver = ((float) (((CricketData) o).getWickets()) / (float) (((CricketData) o).getOvers()));
		this.WicketsPerOver.setText(Float.toString(this.wicketsPerOver));
	}

	// Getters and Setters below.
	public float getRunsPerOver() {
		return runsPerOver;
	}

	public void setRunsPerOver(float runsPerOver) {
		this.runsPerOver = runsPerOver;
	}

	public float getRunsPerWicket() {
		return runsPerWicket;
	}

	public void setRunsPerWicket(float runsPerWicket) {
		this.runsPerWicket = runsPerWicket;
	}

	public float getWicketsPerOver() {
		return wicketsPerOver;
	}

	public void setWicketsPerOver(float wicketsPerOver) {
		this.wicketsPerOver = wicketsPerOver;
	}
}