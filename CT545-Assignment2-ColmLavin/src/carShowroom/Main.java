package carShowroom;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		CarShowroom showroom1 = new CarShowroom(10); //Initializes a showroom object with capacity of 10.

		int day = 1; //Day starts at 1.

		//The below loop will cycle through day 1 to day 31.
		//It will display how many cars are in the showroom.
		while (day < 32) {
			System.out.println("Day " + day + " beginning. There are " + showroom1.getCarListSize()
					+ " cars in the showroom today.");

			//The below for loop will randomly initialize between 1 and 3 instances of buyer with separate threads.
			for (int i = 0; i < new Random().nextInt(3) + 1; i++) {
				Buyer buy1 = new Buyer(showroom1);
				Thread buys = new Thread(buy1);
				buys.start();
			}

			//The below for loop will randomly initialize between 1 and 3 instances of seller with separate threads.
			for (int j = 0; j < new Random().nextInt(3) + 1; j++) {
				Seller sells1 = new Seller(showroom1);
				Thread sells = new Thread(sells1);
				sells.start();
			}

			day++;
			//Slight pause of threads right after a day ends (ie. loop completes an iteration).
			try {
				Thread.sleep(Math.round(1000));
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}

	}

}
