package com.threads;

public class HelloWorld1 extends Thread{
	String msg;
	public HelloWorld1(String msg)
	{
		this.msg=msg;
	}
	public void run()
	{
		for(int i=0; i<5; i++) {
			System.out.println(msg);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
