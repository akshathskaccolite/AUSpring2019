package com.au.multi;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class TaxiStand implements Runnable {
	private int size;

	private List<Passenger> passengerQueue;
	private List<Taxi> taxiQueue;
	private List<Taxi> taxiStand;

	public Thread t;

	public TaxiStand(int capacity, List<Taxi> q, List<Passenger> pq) {
		size = capacity;
		taxiQueue = q;
		passengerQueue = pq;
		taxiStand = new CopyOnWriteArrayList<Taxi>();
		for (int i = 0; i < size; i++) {
			Taxi t=new Taxi();
			t.start=System.currentTimeMillis();
			taxiStand.add(t);
		}
		System.out.println("Creating a TaxiStand with capacity " + size);

		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(17000);
		} catch (InterruptedException ie) {
		}
		while (true) {
			processTaxiStandQueue();
			try {
				
			Thread.sleep(1000);
				
			processPassengerQueue();
			
			Thread.sleep(1000);
			
			processTaxiQueue();
			
			
		}catch(InterruptedException e){}
		}

	}

	public boolean addTaxi(Taxi c) {

		Taxi t = new Taxi();

		if (!isFull()) {
			t.start = System.currentTimeMillis();
			taxiStand.add(t);
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		return (taxiStand.size() < size) ? false : true;
	}

	public boolean isEmpty() {
		return (taxiStand.size() == 0) ? true : false;
	}

	public boolean allocatePassenger(Passenger p) {
		ListIterator<Taxi> standIterator = taxiStand.listIterator();
		while (standIterator.hasNext()) {
			Taxi taxi = standIterator.next();
			if (taxi.allocatePassenger(p)) {
				return true;
			}
		}
		
		return false;
	}

	public synchronized void processTaxiStandQueue() {
		ListIterator<Taxi> standIterator = taxiStand.listIterator();
		while (standIterator.hasNext()) {
			Taxi taxi = standIterator.next();
			 long finish = System.currentTimeMillis();
			 long timeElapsed = finish - taxi.start;
//			 System.out.println(timeElapsed); 
			if (taxi.getpassengerCount() == 4 || (timeElapsed)>50000) {
				System.out.println("Taxi to " + taxi.getDestination() + " departs");
				taxiStand.remove(taxi);
			}
		}
	}

	public synchronized void processPassengerQueue() {
		System.out.println("Starting to process passengerQueue");
		if (passengerQueue.isEmpty()) {
			return;
		}
		ListIterator<Passenger> passengerIterator = passengerQueue.listIterator();
		while (passengerIterator.hasNext()) {
			Passenger p = passengerIterator.next();
			if (allocatePassenger(p)) {
				passengerQueue.remove(p);
			}
		}
	}

	public synchronized void processTaxiQueue() {
		System.out.println("Starting to process taxiQueue");
		ListIterator<Taxi> taxiIterator = taxiQueue.listIterator();
		while (taxiIterator.hasNext()) {
			Taxi t = taxiIterator.next();
			if (addTaxi(t)) {
				taxiQueue.remove(t);
			}
		}
	}

	public void printStatus() {
		ListIterator<Taxi> standIterator = taxiStand.listIterator();
		int position = 0;
		while (standIterator.hasNext()) {
			Taxi taxi = standIterator.next();
			position++;
			System.out.println(
					position + ". Taxi to " + taxi.getDestination() + " passengers=" + taxi.getpassengerCount());
		}
	}

	// public void execute(){
	//// ExecutorService executorService = Executors.newFixedThreadPool(2);
	////
	//// executorService.submit(this.processTaxiQueue());
	//// executorService.submit(this.processPassengerQueue());
	////
	//// executorService.shutdown();
	// }

}
