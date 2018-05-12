/**
 *
 */
package com.github.uguisu.www.common.thread;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author hexin
 *
 */
public class BlockingQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayBlockingQueue<String> fairQueue = new ArrayBlockingQueue<String>(100);

		try {
			for (int i = 1; i <= 101; i++) {
				fairQueue.offer(String.valueOf(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}


		try {
			for (int i = 1; i <= 101; i++) {
				System.out.println(fairQueue.poll());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
