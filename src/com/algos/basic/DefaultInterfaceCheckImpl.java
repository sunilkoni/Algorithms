package com.algos.basic;

public class DefaultInterfaceCheckImpl implements DefaultInterfaceCheck{

	@Override
	public void show() {
		System.out.println("Show method");
	}
	public static void main(String[] args) {
		DefaultInterfaceCheck obj1 = new DefaultInterfaceCheckImpl();
		obj1.show();
		System.out.println(""+obj1.showMe());
	}
}
