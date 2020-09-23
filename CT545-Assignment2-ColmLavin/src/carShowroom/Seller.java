package carShowroom;

import java.util.concurrent.atomic.AtomicInteger; //Allows for use of AtomicIntegers.

public class Seller implements Runnable { //Runnable needed to use Thread.

	private int sellerID;
	private CarShowroom showroom1;
	private static AtomicInteger totalSellers = new AtomicInteger(0);
	private static AtomicInteger totalSales = new AtomicInteger(0);

	public Seller() {
	}

	public Seller(CarShowroom showroom1) { //Instance of CarShowroom passed into constructor.
		this.showroom1 = showroom1;
	}
	//Below run method will carry out most of the work.
	public void run() {

		sellerID = totalSellers.addAndGet(1);
		totalSales.addAndGet(1);

		Car c = new Car();
		System.out.println("A new seller " + this.sellerID + " has arrived at the showroom.");
		
		//Synchronized will block all of the threads trying to use showroom1 at the same time.
		synchronized (showroom1) { 
			
			//Below block executes the isFull method to check if the showroom is full. 
			while (showroom1.isFull()) {

				try {
					showroom1.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println(this.sellerID + " is trying to sell a car, but showroom is currently full.");
			}

			//Below will execute outside of the above isFull method.
			showroom1.addCar(c); //Sells car instance.
			showroom1.notifyAll(); //Notifies all the other threads.
			//The toString below will output the car instance being sold neatly and also give the unique seller ID.
			System.out.println("Seller " + this.sellerID + " has just sold " + c.toString());
			//Below will render the number of sales at the time it is called.
			System.out.println("This is sale number " + totalSales);
		}

	}

}
