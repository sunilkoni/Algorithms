package com.algos.basic;

public class ExtractOddFromStringArr {

	public static void main(String[] args) {
		String[] str = {"21","20","43","22","39","37", "35"};
		
		for(String s : str)
		{
			if(s.endsWith("1") || s.endsWith("3") || s.endsWith("5") || s.endsWith("7") || s.endsWith("9"))
				System.out.print(s+", ");
		}
	}

}
