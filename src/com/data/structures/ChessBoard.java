package com.data.structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChessBoard {

	public static void main(String[] args) {
		int[][] board = new int[8][8];
		int rq = 4;
		int cq = 4;
		HashMap<String, List<String>> pos = new HashMap<>();
		List<String> upl=new ArrayList<String>();
		List<String> dl=new ArrayList<String>();
		List<String> ll=new ArrayList<String>();
		List<String> rl=new ArrayList<String>();
		for(int i=1; i<=8; i++)
		{
			if(i==rq || i==cq)
				continue;
			if(i < rq)
				dl.add(i+","+rq);
			if(i > rq)
				upl.add(i+","+rq);
			if(i < cq)
				ll.add(cq+","+i);
			if(i > cq)
				rl.add(cq+","+i);
		}
		
	}

}
