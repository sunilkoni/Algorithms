package com.threads;

public class ProducerConsumerMainLock {

	public static void main(String[] args) 
	{
		ProducerConsumerByLock prl = new ProducerConsumerByLock();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				prl.produce();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				prl.consume();
			}
		});
		
		t1.start();
		t2.start();
	}

}
