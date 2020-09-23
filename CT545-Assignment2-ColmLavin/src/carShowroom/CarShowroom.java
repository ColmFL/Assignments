package carShowroom;

import java.util.ArrayList; //Allows use of ArrayList.

public class CarShowroom {

	private int capacity;
	private ArrayList<Car> carList = new ArrayList<Car>(); //Initializes ArrayList of type Car.

	public CarShowroom() {
	}

	public CarShowroom(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	//uses the ArrayList.size method to check what is in the ArrayList.
	public boolean isEmpty() { 
		if (carList.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	//same as the isEmpty method. Checks the ArrayList to see if it is full.
	public boolean isFull() { 
		if (carList.size() == capacity) {
			return true;
		} else {
			return false;
		}
	}

	//This method will facilitate a seller selling a car (Adding a car to ArrayList).
	public void addCar(Car c) {
		carList.add(c);
	}
	//This will facilitate a buyer buying a car (Removing a car from ArrayList). 
	public Car takeCar() {
		Car c = carList.get(0);
		carList.remove(0);
		return c;
	}

	public ArrayList<Car> getCarList() {
		return carList;
	}

	public void setCarList(ArrayList<Car> carList) {
		this.carList = carList;
	}

	//Used to display the number of cars in the showroom at the time it's called.
	public int getCarListSize() {
		return carList.size();
	}
}
