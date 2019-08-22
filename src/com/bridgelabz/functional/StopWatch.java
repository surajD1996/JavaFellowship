package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class StopWatch {

	public static void main(String[] args) 
	{
		System.out.println("Enter 0 to start stop watch");
		int start = Utility.scanInt();
		long startTime = 0;
		long stopTime = 0;
		
		if(start == 0)
		{
			startTime = System.currentTimeMillis();
			
			
		}
		
		System.out.println("Enter 1 to stop the stop watch");
		
		int stop = Utility.scanInt();
		
		if(stop == 1)
		{
			stopTime = System.currentTimeMillis();
			double lap = (stopTime-startTime)/1000;
			System.out.println(lap);
		}

	}

}
