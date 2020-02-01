package com.threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerByLock 
{
	Queue<Integer> buffer = new LinkedList<Integer>();
	int count=0;
	Lock lock = new ReentrantLock(true);
	Condition condition = lock.newCondition();
	
	public void produce()
	{
		try {
			while (count<2) {
				lock.lock();
				for (int i = 1; i <= 3; i++) {
					System.out.println("Produced : "+i);
					buffer.add(i);
				}
				count++;
				condition.await();
				System.out.println("producer again..");
				lock.unlock();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void consume()
	{
		try {
			Thread.sleep(100);
			while (count<2) {
				lock.lock();
				while (!buffer.isEmpty())
					System.out.println("Consumed : " + buffer.remove());
				condition.signal();
				lock.unlock();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
