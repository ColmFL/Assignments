package ie.nuig.ct548.assignment3;

//Import of swing elements.
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Implements the Observer interface so that Observer objects can be informed of changes.
//Inherits JFrame class which enables use of JFrame methods.
@SuppressWarnings("serial")
public class CurrentScoreDisplay extends JFrame implements Observer {

	private int runs;
	private float overs;
	private int wickets;

	// Label created for each input that is needed.
	private JLabel Runs;
	private JLabel Overs;
	private JLabel Wickets;

	// Constructor defines the labels and sets up the GUI
	// which will be used.
	public CurrentScoreDisplay() {
		super("Current Scores");
		this.setLayout(new GridLayout(3, 2));

		this.add(new JLabel("Runs: "));
		Runs = new JLabel();
		this.add(Runs);

		this.add(new JLabel("Overs: "));
		Overs = new JLabel();
		this.add(Overs);

		this.add(new JLabel("Wickets: "));
		Wickets = new JLabel();
		this.add(Wickets);

		// Below allows for the window to be
		// sized and located. Also allows
		// visibility.
		this.pack();
		this.setSize(300, 200);
		this.setLocation(100, 200);
		this.setVisible(true);
	}

	// Update method gets the data from CricketData object.
	// It gets called by notifyObservers() which in turn gets
	// called by setScore().
	public void update(Observable o, Object arg) {

		runs = ((int) (((CricketData) o).getRuns()));
		this.Runs.setText(Integer.toString(this.runs));
		overs = ((int) (((CricketData) o).getOvers()));
		this.Overs.setText(Float.toString(this.overs));
		wickets = ((int) (((CricketData) o).getWickets()));
		this.Wickets.setText(Integer.toString(this.wickets));
	}

	// Getters and Setters below.
	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public float getOvers() {
		return overs;
	}

	public void setOvers(float overs) {
		this.overs = overs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
}