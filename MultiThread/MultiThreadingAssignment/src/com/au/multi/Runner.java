package com.au.multi;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Starting simulaion...");
		
		List<Taxi> taxiQueue = new CopyOnWriteArrayList<Taxi>();
		List<Passenger> passengerQueue = new CopyOnWriteArrayList<Passenger>();
		
		TaxiStand lot = new TaxiStand(5, taxiQueue, passengerQueue);

				new TaxiQueueRunnable(taxiQueue, lot); 
				new PassengerQueueRunnable(passengerQueue, lot);
		
//		try {
//			lot.t.join();
//			taxicreator.t.join();
//			passengerCreator.t.join();
//		}catch(InterruptedException e) {
//			
//		}

	}

}
