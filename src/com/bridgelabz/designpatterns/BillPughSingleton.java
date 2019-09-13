package com.bridgelabz.designpatterns;

public class BillPughSingleton 
{
	private BillPughSingleton()
	{
		
	}
	
	private static class BillPughHelper
	{
		private static final BillPughSingleton billPughSingleton = new BillPughSingleton();
	}
	
	private static BillPughSingleton getInstance()
	{
		
		return BillPughHelper.billPughSingleton;
	}
	
}
