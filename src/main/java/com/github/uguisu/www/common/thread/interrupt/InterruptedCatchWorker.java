/**
 * 
 */
package com.github.uguisu.www.common.thread.interrupt;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author hexin
 *
 */
public class InterruptedCatchWorker implements Runnable {

	private volatile AtomicInteger aintCount1;
	private static final int WAITING_TIME = 5000;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized(InterruptedCatchWorker.class) {
			
			while(aintCount1.get() < 10) {
				
				try {
					Thread.sleep(WAITING_TIME);
				} catch (InterruptedException e) {
					
					System.err.println("Interrupted!" + aintCount1.incrementAndGet());
					
				}
			}
		}
		
	}
	
	
	public InterruptedCatchWorker() {
		aintCount1 = new AtomicInteger(0);
	}

}
