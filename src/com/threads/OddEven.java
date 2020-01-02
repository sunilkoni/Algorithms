package com.threads;

public class OddEven {
	
	int counter=1;

	public void printOdd() throws InterruptedException
	{
		while (counter <= 20) {
			synchronized (this) {
				System.out.println(counter);
				counter++;
			}
			Thread.sleep(1000);
		}
	}
	
	public void printEven() throws InterruptedException
	{
		while (counter <= 20) {
			synchronized (this) {
				System.out.println(counter);
				counter++;
			}
			Thread.sleep(1000);
		}
	}
}
