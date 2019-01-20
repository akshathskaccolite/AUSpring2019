package com.au.multi;


import java.util.*;

public class TaxiQueueRunnable implements Runnable {

    private List<Taxi> taxiQueue;
    private TaxiStand lot;
    public Thread t;

    public TaxiQueueRunnable(List<Taxi> q, TaxiStand l){
        taxiQueue = q;
        lot = l;
        t=new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Starting taxiQueue Thread...");
        while(true) {
            try {
                Thread.sleep(35000);
            } catch (InterruptedException ie) {

            }
            
            Taxi t=new Taxi();
            if(lot.addTaxi(t))
            {
            	System.out.println("New taxi allocated to stand");
            }
            else
            	{
            		System.out.println("Taxi stand is full. Adding to Queue..");
            		taxiQueue.add(t);
            	}
            
        }
    }
}
