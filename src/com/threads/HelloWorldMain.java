package com.threads;

public class HelloWorldMain {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Thread t1 = new Thread(new Hello()); Thread t2 = new Thread(new World());
		 * 
		 * t1.start(); t2.start();
		 * 
		 * Thread.sleep(15000);
		 */
		//t1.join();
		//t2.join();
		HelloWorld1 t1 = new HelloWorld1("Hello");
		t1.start();
		HelloWorld1 t2 = new HelloWorld1("World");
		t2.start();
	}

}
