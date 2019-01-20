package com.au.multi;


import java.util.Random;
import java.util.*;

public class PassengerQueueRunnable implements Runnable {
    TaxiStand lot;
    public Thread t;
    List<Passenger> passengerQueue;
    int queueNumber=0;
    public PassengerQueueRunnable(List<Passenger> queue, TaxiStand l) {
        passengerQueue = queue;
        lot = l;
        t=new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ie) {

            }
            int pick = new Random().nextInt(Passenger.DESTINATION.values().length);
            Passenger p = new Passenger(Passenger.DESTINATION_VALUES[pick]);
            System.out.println("New passenger with destination " + p.getDestination() + " arrives.");

            if(!lot.allocatePassenger(p)) {
                System.out.println("No cab found for passenger. Adding to Queue..");
                passengerQueue.add(p);
                System.out.println("Passeneger added to queue.");
                
            }
            
//            lot.processPassengerQueue();
        }
    }
}
