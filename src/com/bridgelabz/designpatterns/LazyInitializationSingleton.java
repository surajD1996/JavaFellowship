package com.bridgelabz.designpatterns;

public class LazyInitializationSingleton 
{
	
	private LazyInitializationSingleton lazySingleton;
	
	private LazyInitializationSingleton() 
	{
	
	}
	
	public LazyInitializationSingleton getInstance()
	{
		if(lazySingleton == null)
		{
			lazySingleton = new LazyInitializationSingleton();
		}
		return lazySingleton;
	}
}