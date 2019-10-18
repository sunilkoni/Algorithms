package com.threads;

public class Hello implements Runnable{
	HelloWorld hw = new HelloWorld("Hello");
	@Override
	public void run() {
			hw.print();
	}

}
