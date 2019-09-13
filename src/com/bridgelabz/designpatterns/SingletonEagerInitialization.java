package com.bridgelabz.designpatterns;

public class SingletonEagerInitialization 
{
	
	private static final SingletonEagerInitialization eagerInitialized = new SingletonEagerInitialization();
	
	private SingletonEagerInitialization()
	{
		
	}
	
	public static SingletonEagerInitialization getInstance()
	{
		return eagerInitialized;
	}
}
