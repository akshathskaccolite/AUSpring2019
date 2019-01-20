POOL TAXI

Assumptions:
Taxi stand can hold 5 taxis.
All the newly arriving passengers are given the highest priority and hence assigned first.
Passengers select from a predefined set of 10 destinations.
Taxi once assigned to the stand can wait for 50 seconds.
Passengers are generated every 3 seconds.
New taxi arrives once every 35 seconds.
For better execution - generate passengers once every 4 seconds and taxis once every 20 seconds

3 threads are used-
1.Thread for passengers generation
2.Thread for taxis generation 
3.Thread for queue processing is being used.

Concurrency is achieved by using-
1.synchronized methods
2.CopyOnWriteArrayList classes for concurrent access by 2 threads at a time.

Start evecution-Runner.java