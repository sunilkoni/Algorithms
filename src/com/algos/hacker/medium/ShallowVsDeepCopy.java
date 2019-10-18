package com.algos.hacker.medium;

public class ShallowVsDeepCopy {

	public static void main(String[] args) {
		Name na = new Name("Viraj", "Koni");
		Use u = new Use(na);
		u.show();
		na.fname="Sunil";
		u.show();
	}

}

class Use{
	Name n;

	public Use(Name n) {
		this.n = n;
	}
	public void show()
	{
		System.out.println(n.fname+" "+n.lname);
	}
	
}

class Name{
	String fname;
	String lname;
	public Name(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	
}