package com.bridgelabz.designpatterns;

public class ThreadSafeDoubleChecked 
{
	private static ThreadSafeDoubleChecked threadSafeDoubleChecked;
	
	private ThreadSafeDoubleChecked()
	{
		
	}
	
	private static ThreadSafeDoubleChecked getInstance()
	{
		
		if(threadSafeDoubleChecked == null)
		{
			synchronized(ThreadSafeDoubleChecked.class)
			{
				if(threadSafeDoubleChecked == null)
				{
					threadSafeDoubleChecked = new ThreadSafeDoubleChecked();
				}
			}
		}	
		return threadSafeDoubleChecked;
	}
	
}
