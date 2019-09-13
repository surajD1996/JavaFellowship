package com.bridgelabz.designpatterns;

public class ThreadSafeSingleton 
{
	private static ThreadSafeSingleton threadSafeSingleton;
	
	private ThreadSafeSingleton()
	{
		
	}
	
	public static synchronized ThreadSafeSingleton getInstance()
	{
		if(threadSafeSingleton == null)
		{
			threadSafeSingleton = new ThreadSafeSingleton();
		}
		return threadSafeSingleton;
	}
}
