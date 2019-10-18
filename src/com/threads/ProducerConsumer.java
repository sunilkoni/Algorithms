//package com.threads;
//
//import java.util.concurrent.locks.Condition;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//import com.data.structures.OwnQueueByLL;
//
//public class ProducerConsumer implements Runnable{
//	Lock lock = new ReentrantLock();
//	Condition cond = lock.newCondition();
//	OwnQueueByLL qll = new OwnQueueByLL();
//	int i = 0;
//	public void consumer()
//	{
//		lock.lock();
//		try
//		{
//			while (true) {
//				cond.await();
//				qll.peek();
//			}
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//	
//	public void produce() 
//	{
//		lock.lock();
//		try {
//			while(true)
//			{
//				qll.add("Data "+i);
//				i++;
//				cond.signal();
//			}
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public void run() {
//		
//	}
//}
