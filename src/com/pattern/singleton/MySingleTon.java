package com.pattern.singleton;

import java.io.Serializable;

public class MySingleTon implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static MySingleTon instance = null;
	
	private MySingleTon()
	{
		
	}
	
	public static MySingleTon getInstance()
	{
		if(instance == null)
		{
			instance = new MySingleTon();
			return instance;
		}
		else
			return instance;
	}
	
}
