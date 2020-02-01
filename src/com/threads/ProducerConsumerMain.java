package com.threads;

public class ProducerConsumerMain {

	public static void main(String[] args) {
		ProducerConsumer pc = new ProducerConsumer();
		Thread t1 = new Thread(new Runnable()
				{
					public void run()
					{
						pc.producer();
					}
				});
		
		Thread t2 = new Thread(new Runnable()
		{
			public void run()
			{
				pc.consumer();
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
