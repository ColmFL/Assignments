package ie.nuig.ct548.assignment3;

//Imports needed for CricketData below.
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

//CricketData inherits Observable's methods.
public class CricketData extends Observable {

	// Variables used in class.
	private int runs;
	private float overs;
	private int wickets;
	private ArrayList<Observer> observers;

	// Constructor with ArrayList of Observer objects.
	public CricketData() {
		this.observers = new ArrayList<Observer>();
	}

	// Getters.
	public int getRuns() {
		return runs;
	}

	public float getOvers() {
		return overs;
	}

	public int getWickets() {
		return wickets;
	}

	// Sets scores. The setChanged and notifyObservers ensures
	// that the observers will be updated.
	public void setScore(int runs, float overs, int wickets) {
		this.runs = runs;
		this.overs = overs;
		this.wickets = wickets;
		setChanged();
		notifyObservers(null);
	}

	// The addObserver method is very important.
	public void addObserver(Observer o) {
		observers.add(o);
	}

	public int countObservers() {
		return 0;
	}

	// Removes an observer.
	public void deleteObserver(Observer o) {
		observers.remove(o);
	}

	public void deleteObservers() {
	}

	// Used to notify the other classes when the update method is called.
	// Can be seen above when called in setScore().
	public void notifyObservers(Object arg) {
		for (Observer o : observers) {
			o.update(this, observers);
		}
	}

	// Inherited methods which are not used.
	public void notifyObservers() {
	}

	protected void setChanged() {
	}

	protected void clearChanged() {
	}

	public boolean hasChanged() {
		return true;
	}
}