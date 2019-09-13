package com.bridgelabz.designpatterns;

public class StaticBlockSingleton 
{
	private static StaticBlockSingleton staticSingleton;
	
	private StaticBlockSingleton()
	{
		
	}
	
	static
	{
		try
		{
			staticSingleton = new StaticBlockSingleton();
		}
		catch(Exception exception)
		{
			throw new RuntimeException("Error occured while creation singleton object");
			//System.out.println("Error occured while creation singleton object");
		}
	}
	
	public StaticBlockSingleton getInstance()
	{
		return staticSingleton;
	}
	
}
