/**
 * 
 */
package com.github.uguisu.www.common.thread.interrupt;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author hexin
 *
 */
public class InterruptedCatch {

	private volatile AtomicInteger aintCount;
	
	private Thread job = new Thread(new InterruptedCatchWorker(), "Worker");
	
	public static void main(String ary[]) throws Exception {
		
		InterruptedCatch tester = new InterruptedCatch();
		tester.job.start();
		
		tester.tryToInterrupte();
	}
	
	public InterruptedCatch() {
		aintCount = new AtomicInteger(0);
	}
	
	
	private void tryToInterrupte() {
		
		while(this.job.isAlive() && aintCount.get() < 10) {
			
			this.job.interrupt();
			
			System.out.println("Interrupting..." + aintCount.incrementAndGet());
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
