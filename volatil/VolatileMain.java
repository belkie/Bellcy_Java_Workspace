package com.dal.volatil;

public class VolatileMain {

	private final static int noOfThreads = 2;

	public static void main(String[] args) throws InterruptedException {
		
		VolatileData volatileData = new VolatileData();
		Thread[] threads = new Thread[noOfThreads];
		
		for (int i = 0; i < noOfThreads; ++i)
			threads[i] = new VolatileThread(volatileData);
		
		for (int i = 0; i < noOfThreads; ++i)
			threads[i].start();
		
		for (int i = 0; i < noOfThreads; ++i)
			threads[i].join(); 
	}
}