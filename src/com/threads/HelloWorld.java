package com.threads;

public class HelloWorld {
	private String msg;
	
	public HelloWorld(String msg)
	{
		this.msg = msg;
	}
		public void print()
		{
			int i=0;
			while(i<10)
			{
				synchronized (this) {
					System.out.println(msg);
				}
				i++;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}
