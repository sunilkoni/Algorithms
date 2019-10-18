package com.algos.hacker.medium;

import java.util.ArrayList;
import java.util.List;

// Following is the part of the program and is provided as an assistance to read the input.
class Accolite {
    public static void main(String[] args) throws InterruptedException {
        
        Solution(12);
    }
    
    public static void Solution(int N){
        List<Integer> primeD = new ArrayList<Integer>();
        List<Integer> divi = new ArrayList<Integer>();
        for(int i=2;i<=N;i++)
        {
            if(N%i == 0 && isPrime(i))
            {
                primeD.add(i);
            }
        }
        for(int i=1; i<=N; i++)
        {
            if(N%i==0)
            {
                divi.add(i);
            }
        }
        int score=0;
        int prevScore=1;
        for(Integer x : primeD)
        {
            for(Integer y : divi)
            {
                if(y%x==0)
                    score++;
            }
            if(score != 0)
                prevScore=prevScore*score;
            score=0;
        }
        System.out.println(prevScore%1000003);
    }
    public static boolean isPrime(int x)
    {
        boolean isPrime=true;
        for(int i=2; i<x; i++)
        {
            if(x%i == 0)
                isPrime= false;
        }
        return isPrime;
    }
}