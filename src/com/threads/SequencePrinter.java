package com.threads;

public class SequencePrinter implements Runnable 
{
	int number;
	int sleep;

	public SequencePrinter(int number, int sleep) {
		this.number = number;
		this.sleep = sleep;
	}


	@Override
	public void run() 
	{
			while(number < 12)
			{
				synchronized (this) {
					System.out.println(number);
					number += 3;
				}
				try {
					Thread.sleep(sleep);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}
