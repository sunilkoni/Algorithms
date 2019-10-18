package com.threads;

public class World implements Runnable{
	HelloWorld hw = new HelloWorld("World");
	@Override
	public void run() {
		hw.print();
	}

}
