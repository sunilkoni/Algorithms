package com.threads;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer 
{
	Queue<Integer> buffer = new LinkedList<Integer>();
	Object lock = new Object();
	int i=0;
	public void producer()
	{
		synchronized (lock) {
				while (i < 10) {
					if (buffer.size() == 1) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {
						buffer.add(i);
						System.out.println("Produced : " + i);
						i++;
						lock.notify();
					} 
				}
		}
	}
	
	public void consumer()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		synchronized (lock) {
				while (true) {
					if (buffer.size() == 0) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {
						while (!buffer.isEmpty())
							System.out.println("Consumed : " + buffer.remove());

						lock.notify();
					} 
				}
		}
	}
}
