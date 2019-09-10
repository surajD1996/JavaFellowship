package com.bridgelabz.objectorientation;

public class Company 
{
	private static String companyName;
	private static int shareQuantity;
	private static int amount;
	
	public static String getCompanyName() 
	{
		return companyName;
	}
	
	public static void setCompanyName(String companyName) 
	{
		Company.companyName = companyName;
	}
	
	public static int getShareQuantity()
	{
		return shareQuantity;
	}
	
	public static void setShareQuantity(int shareQuantity) 
	{
		Company.shareQuantity = shareQuantity;
	}
	
	public static int getAmount() 
	{
		return amount;
	}
	
	public static void setAmount(int amount) 
	{
		Company.amount = amount;
	}
	
	@Override
	public String toString() 
	{
		return "Company [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	} 

}
