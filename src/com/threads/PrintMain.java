package com.threads;

public class PrintMain {

	public static void main(String[] args) {
		
		OddEven hw = new OddEven();
		Thread oddT = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					hw.printOdd();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread evenT = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					hw.printEven();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		oddT.start();
		evenT.start();
		
		
	}

}
