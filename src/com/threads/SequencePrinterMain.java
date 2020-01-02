package com.threads;

public class SequencePrinterMain {

	public static void main(String[] args) throws InterruptedException {
		SequencePrinter s1 = new SequencePrinter(1, 1000);
		SequencePrinter s2 = new SequencePrinter(2, 1500);
		SequencePrinter s3 = new SequencePrinter(3, 2000);
		
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		Thread t3 = new Thread(s3);
		
		t1.start();
		Thread.sleep(200);
		t2.start();
		Thread.sleep(200);
		t3.start();
	}

}
