package com.algos.basic;

public interface DefaultInterfaceCheck {
	public void show();
	
	default int showMe()
	{
		System.out.println("From Default method");
		return 1;
	}
}
