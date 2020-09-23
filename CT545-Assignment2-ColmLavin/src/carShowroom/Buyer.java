package carShowroom;

import java.util.concurrent.atomic.AtomicInteger; //Allows for the use of AtomicIntegers.

public class Buyer implements Runnable { //Runnable needed to use Thread.

	private int buyerID;
	private CarShowroom showroom1;
	private static AtomicInteger totalBuyers = new AtomicInteger(0);
	private static AtomicInteger totalPurchases = new AtomicInteger(0);

	public Buyer() {
	}

	public Buyer(CarShowroom showroom1) { //Instance of CarShowroom passed into constructor.
		this.showroom1 = showroom1;
	}

	//Below run method will carry out most of the work.
	public void run() {

		buyerID = totalBuyers.addAndGet(1);
		totalPurchases.addAndGet(1);

		System.out.println("A new buyer " + this.buyerID + " has arrived at the showroom.");
		
		//Synchronized will block all of the threads trying to use showroom1 at the same time.
		synchronized (showroom1) {

			//Below block executes the isEmpty method to check if the showroom is empty. 
			while (showroom1.isEmpty()) {
				try {
					System.out.println(
							"Buyer " + this.buyerID + " wants to buy a car, but the showroom is currently empty.");
					showroom1.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			//Below will execute outside of the above isEmpty method.
			Car c = showroom1.takeCar(); //Buys Car instance.
			showroom1.notifyAll(); //Notifies all the other threads.
			//The toString below will output the car instance being bought neatly and also give the unique buyer ID.
			System.out.println("Buyer " + this.buyerID + " has just bought " + c.toString());
			//Below will render the number of sales at the time it is called.
			System.out.println("This is purchase number " + totalPurchases);

		}
	}
}
