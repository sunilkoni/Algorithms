package com.algos.basic;

public class TimeConversion {

	public static void main(String[] args) {
		String res = timeConversion("12:45:54PM");
		System.out.println(res);
	}
	
	/*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String res="";
        int hour = 00;
        String hourS="";
        if(s.endsWith("PM"))
        {
            hour = Integer.valueOf(s.substring(0,2));
            if(hour==12)
            	hour = 12;
            else
            	hour+=12;
        }
        else if(s.endsWith("AM"))
        {
            hour = Integer.valueOf(s.substring(0,2));
            if(hour==12)
            	hour = 0;
        }
        if(hour/10<1)
        	hourS="0"+hour;
        else
        	hourS = ""+hour;
        
        res=hourS+""+s.substring(2);
       res =  res.contains("PM") ? res.replace("PM","") : res.contains("AM") ? res.replace("AM","") : res;
        //res = res.replace("PM","");
       if(res.startsWith("0:"))
    	   res = "0"+res;
        return res;

    }
}
