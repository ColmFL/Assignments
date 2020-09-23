package carShowroom;

import java.util.Random; //allows use of Random.

public class Car {

	private String registration;
	private int saleValue;
	private Random random = new Random();
	private String col1;
	private String[] colour = { "Pink", "green", "blue", "black", "brown", "white", "red", "yellow", "purple", "orange",
			"neon green", "peach", "gray", "beige", "magenta" };

	public Car() { //Car constructor which generates random values for car attributes.

		int col = random.nextInt(15);
		col1 = colour[col];
		this.saleValue = random.nextInt(30000);

		int first = random.nextInt(20);
		int last = random.nextInt(9000) + 1000;
		String middle = first + "-G-" + last;
		this.registration = middle;
	}
	
	//Below are the getters and setters for Car class.
	public String[] getColour() {
		return colour;
	}

	public void setColour(String[] colour) {
		this.colour = colour;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public int getSaleValue() {

		return saleValue;
	}

	public void setSaleValue(int saleValue) {
		this.saleValue = saleValue;
	}

	//toString method to print the car details in Buyer/Seller run methods.
	public String toString() {
		return "the " + col1 + " car with a registration of " + registration + " which is valued at €" + saleValue;
	}
}