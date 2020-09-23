package ie.nuig.ct548.assignment3;

//Import of all the necessary packages.
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

//Driver class.
public class CricketMatchApp {

	public static void main(String[] args) {

		// Creates a CricketData object, a CurrentScoreDisplay object,
		// and an AvgScoreDisplay object.
		CricketData cd = new CricketData();
		CurrentScoreDisplay display = new CurrentScoreDisplay();
		AvgScoreDisplay avgDisplay = new AvgScoreDisplay();

		// The CurrentScoreDisplay object and the AvgScoreDisplay object
		// are then added to the CricketData object as observers.
		cd.addObserver(display);
		cd.addObserver(avgDisplay);

		// The following lines set up the main window and what the text fields will
		// read.
		JFrame mainFrame = new JFrame("Cricket Data");
		mainFrame.setLayout(new GridLayout(4, 0));

		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JLabel label1 = new JLabel("Runs: ", SwingConstants.RIGHT);
		mainFrame.add(label1);

		JFormattedTextField textField = new JFormattedTextField(NumberFormat.getIntegerInstance());
		mainFrame.add(textField);

		JLabel label2 = new JLabel("Overs: ", SwingConstants.RIGHT);
		mainFrame.add(label2);

		JFormattedTextField textField2 = new JFormattedTextField(NumberFormat.getIntegerInstance());
		mainFrame.add(textField2);

		JLabel label3 = new JLabel("Wickets: ", SwingConstants.RIGHT);
		mainFrame.add(label3);

		JFormattedTextField textField3 = new JFormattedTextField(NumberFormat.getIntegerInstance());
		mainFrame.add(textField3);

		JButton button = new JButton("Submit Score");
		mainFrame.add(button);

		// Below allows for the window to be
		// sized and located. Also allows
		// visibility.
		mainFrame.pack();
		mainFrame.setSize(300, 200);
		mainFrame.setLocation(400, 200);
		mainFrame.setVisible(true);

		// The button actionListener will run the code inside on click of the button.
		button.addActionListener(new ActionListener() {

			// The below method will ensure that for each textField, the setScore() method
			// is called,
			// which will update the observers and thus render the data on the GUIs.
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cd.setScore(Integer.parseInt(textField.getText()), Float.parseFloat(textField2.getText()),
						Integer.parseInt(textField3.getText()));
			}
		});
	}
}